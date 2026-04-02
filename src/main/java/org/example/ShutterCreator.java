package org.example;

public class ShutterCreator
{
    @Override
    public ConnectedDevice createConnectedDevice()
    {
        return new Shutter();
    }
}
