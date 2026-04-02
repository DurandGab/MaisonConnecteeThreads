package org.example;

import java.util.Date;

public class Mode implements Runnable
{
    private int idMode;
    private String modeName;
    private Date dayStart;
    private Date dayEnd;
    private boolean stateMode;

    private ConnectedDevice shutter;
    private ConnectedDevice garage;
    private ConnectedDevice heating;
    private ConnectedDevice lamp;

    public Mode(String modeName, ConnectedDevice shutter, ConnectedDevice garage, ConnectedDevice heating, ConnectedDevice lamp)
    {
        this.modeName = modeName;
        this.shutter = shutter;
        this.garage = garage;
        this.heating = heating;
        this.lamp = lamp;
    }
    public void turnOn()
    {
        this.stateMode = true;
        System.out.println("Mode " + this.modeName + " activé !");
        new Thread(this, "ModeThread").start();

    }

    public void turnOff()
    {
        this.stateMode = false;
        System.out.println("Mode " + this.modeName + " désactivé !");
    }

    @Override
    public void run() {
        Thread t1 = new Thread(() -> shutter.setStatus(false), "ShutterThread");
        Thread t2 = new Thread(() -> garage.setStatus(false),  "GarageThread");
        Thread t3 = new Thread(() -> lamp.setStatus(false),    "LampThread");
        Thread t4 = new Thread(() -> ((Heating) heating).setLowEnergyMode(true), "HeatingThread");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("[Mode vacances] Domicile sécurisé !");
    }
}

