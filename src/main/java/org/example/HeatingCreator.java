package org.example;

public class HeatingCreator extends ConnectedDeviceCreator
{
    @Override
    public ConnectedDevice createConnectedDevice(String deviceName)
    {
        return new Heating(deviceName);
    }
}
