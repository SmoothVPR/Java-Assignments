package com.ss.assn.three;

public class Store implements Runnable
{
    protected List<Integer> inventory;

    public Store(int quantity)
    {
        this.quantity = quantity;
    }

    public void sellItem(int index)
    {
        inventory[index]--;
    }

    public void generateItems()
    {
    }

    @Override
    public void run()
    {
        while (true)
        {
            for (Integer item : inventory)
            {
                if (item < 5)
                {
                    item++;
                }
            }
        }
    }
}
