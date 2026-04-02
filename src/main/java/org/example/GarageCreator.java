package org.example;

public class GarageCreator extends ConnectedDeviceCreator
{
    @Override
    public ConnectedDevice createConnectedDevice()
    {
        return new Garage();
    }
}
