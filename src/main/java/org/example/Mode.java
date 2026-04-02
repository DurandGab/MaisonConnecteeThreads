package org.example;

import java.util.Date;
import java.util.List;

public class Mode implements Runnable
{
    private int idMode;
    private String modeName;
    private Date dayStart;
    private Date dayEnd;
    private boolean stateMode;

    private List<ConnectedDevice> shutters;
    private List<ConnectedDevice> heatings;
    private List<ConnectedDevice> lamps;
    private ConnectedDevice garage;

    public Mode(String modeName, List<ConnectedDevice> shutters,
                List<ConnectedDevice> heatings, List<ConnectedDevice> lamps,
                ConnectedDevice garage) {
        this.modeName = modeName;
        this.shutters = shutters;
        this.heatings = heatings;
        this.lamps    = lamps;
        this.garage   = garage;
    }

    // turn on a mode
    public void turnOn()
    {
        this.stateMode = true;
        System.out.println("Mode " + this.modeName + " activated !");
        new Thread(this, "ModeThread").start();

    }

    //turn off a mode
    public void turnOff()
    {
        this.stateMode = false;
        System.out.println("Mode " + this.modeName + " disabled !");
    }

    // run method to execute the mode in a separate thread
    @Override
    public void run() {
        System.out.println("[" + modeName + "]" + " Security in progress...");

        shutters.forEach(s -> new Thread(() -> s.setStatus(false)).start());
        lamps.forEach(l -> new Thread(() -> l.setStatus(false)).start());
        new Thread(() -> garage.setStatus(false)).start();
        heatings.forEach(h -> new Thread(() -> ((Heating) h).setLowEnergyMode(true)).start());
    }
}

