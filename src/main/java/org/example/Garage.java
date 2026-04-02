package org.example;

public class Garage implements ConnectedDevice{
    private int idGarage;
    private String deviceName;
    private boolean isConnectionActivated;
    private String energyConsuption;
    private boolean lowEnergyMode;
    private boolean isGarageOpen;

    public void setStatus(){
        if (isGarageOpen){
            System.out.println("The garage is open");
        } else {
            System.out.println("The garage is closed");
        }
    }


}
