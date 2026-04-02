package org.example;

public class ShutterCreator extends ConnectedDeviceCreator
{
    @Override
    public ConnectedDevice createConnectedDevice(String shutterName)
    {
        return new Shutter(shutterName);
    }
}
