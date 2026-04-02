package org.example;

public class HeatingCreator
{
    @Override
    public ConnectedDevice createConnectedDevice()
    {
        return new Heating();
    }
}
