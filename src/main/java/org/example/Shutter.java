package org.example;

public class Shutter implements ConnectedDevice{
    private int idShutter;
    private String deviceName;
    private boolean isConnectionActivated;
    private String energyConsuption;
    private boolean lowEnergyMode;
    private int openingPercentage;
    private boolean isOpenShutter;

    public Shutter(String shutterName)
    {
        this.deviceName = shutterName;
    }

    public synchronized void setStatus(boolean status){
        if (status){
            this.isOpenShutter = true;
            System.out.println(deviceName + " are open");
        } else {
            this.isOpenShutter = false;
            System.out.println(deviceName + " are closed");
        }
    }
}
