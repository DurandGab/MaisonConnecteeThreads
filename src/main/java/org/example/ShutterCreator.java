package org.example;

public class ShutterCreator extends ConnectedDeviceCreator
{
    @Override
    public ConnectedDevice createConnectedDevice()
    {
        return new Shutter();
    }
}
