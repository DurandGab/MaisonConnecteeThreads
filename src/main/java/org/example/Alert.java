package org.example;

import java.util.Date;

public class Alert
{
    private int idAlert;
    private String alertName;
    private Date alertTime;
    private boolean alertMode;

    public void turnOn()
    {
        this.alertMode = true;
        System.out.println("Alerte " + this.alertName + " activée !");
    }

    public void turnOff()
    {
        this.alertMode = false;
        System.out.println("Alerte " + this.alertName + " désactivée !");
    }
}
