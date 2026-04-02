package org.example;

public class LampCreator extends ConnectedDeviceCreator
{
    @Override
    public ConnectedDevice createConnectedDevice(String lampName)
    {
        return new Lamp(lampName);
    }
}
