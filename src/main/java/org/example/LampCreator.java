package org.example;

public class LampCreator extends ConnectedDeviceCreator
{
    @Override
    public ConnectedDevice createConnectedDevice()
    {
        return new Lamp();
    }
}
