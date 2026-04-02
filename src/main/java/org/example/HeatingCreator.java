package org.example;

public class HeatingCreator extends ConnectedDeviceCreator
{
    @Override
    public ConnectedDevice createConnectedDevice()
    {
        return new Heating();
    }
}
