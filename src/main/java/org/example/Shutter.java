package org.example;

public class Shutter implements ConnectedDevice{
    private int idShutter;
    private String deviceName;
    private boolean isConnectionActivated;
    private String energyConsuption;
    private boolean lowEnergyMode;
    private int openingPercentage;
    private boolean isOpenShutter;

    public void setStatus(){
        if (isOpenShutter){
            System.out.println("The shutter is open");
        } else {
            System.out.println("The shutter is closed");
        }
    }
}
