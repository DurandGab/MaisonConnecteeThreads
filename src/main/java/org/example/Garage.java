package org.example;

public class Garage implements ConnectedDevice{
    private int idGarage;
    private String deviceName;
    private boolean isConnectionActivated;
    private String energyConsuption;
    private boolean lowEnergyMode;
    private boolean isGarageOpen;

    public void setStatus(boolean status){
        if (status){
            this.isGarageOpen = true;
            System.out.println("The garage is open");
        } else {
            this.isGarageOpen = false;
            System.out.println("The garage is closed");
        }
    }


}
