package org.example;

import java.util.Date;

public class Mode
{
    private int idMode;
    private String modeName;
    private Date dayStart;
    private Date dayEnd;
    private boolean stateMode;

    public void turnOn()
    {
        this.stateMode = true;
        System.out.println("Mode " + this.modeName + " activé !");
    }

    public void turnOff()
    {
        this.stateMode = false;
        System.out.println("Mode " + this.modeName + " désactivé !");
    }
}
