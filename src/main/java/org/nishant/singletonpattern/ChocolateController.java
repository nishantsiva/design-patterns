package org.nishant.singletonpattern;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import org.nishant.singletonpattern.service.ChocolateBoiler;

import static java.util.stream.IntStream.range;

public class ChocolateController implements Runnable
{
    private volatile boolean keepRunning = true;


    public void stop()
    {
        keepRunning = false;
    }


    private List<String> selectOperations(int count)
    {
        List<String> operations = Arrays.asList("FILL", "DRAIN", "BOIL");
        List<String> selectedOperations;
        Random random = new Random();

        selectedOperations = range(0, count).mapToObj(i -> operations.get(random.nextInt(operations.size()))).collect(Collectors.toList());

        return selectedOperations;
    }


    private void doOperation(ChocolateBoiler boiler, String operation)
    {
        switch (operation)
        {
            case "FILL":
                boiler.fill();
                break;
            case "DRAIN":
                boiler.drain();
                break;
            case "BOIL":
                boiler.boil();
                break;
        }
    }


    @Override
    public void run()
    {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
//        ChocolateBoiler boiler = ChocolateBoiler.getInstanceNonSync();
        selectOperations(50).forEach(operation -> doOperation(boiler, operation));
        while (keepRunning)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ignored)
            {
            }
        }
        System.out.println("Final State:: isEmpty: " + boiler.isEmpty() + ", isBoiled: " + boiler.isBoiled());
    }


    public static void main(String[] args)
    {
        List<ChocolateController> controllers = range(0, 10).mapToObj(i -> new ChocolateController()).collect(Collectors.toList());
        controllers.forEach(controller -> new Thread(controller).start());

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException ignored)
        {
        }

        controllers.forEach(ChocolateController::stop);
    }
}
