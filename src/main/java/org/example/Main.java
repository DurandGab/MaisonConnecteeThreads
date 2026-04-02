package org.example;

public class Main {
    public static void main(String[] args) {
        ConnectedDevice shutter = new ShutterCreator().createConnectedDevice();
        ConnectedDevice garage  = new GarageCreator().createConnectedDevice();
        ConnectedDevice heating = new HeatingCreator().createConnectedDevice();
        ConnectedDevice lamp    = new LampCreator().createConnectedDevice();

        Mode mode = new Mode("Vacances",shutter, garage, heating, lamp);
        mode.turnOn();
    }
}