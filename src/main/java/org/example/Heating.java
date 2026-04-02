package org.example;

public class Heating implements ConnectedDevice{
    private int idHeating;
    private String deviceName;
    private boolean isConnectionActivated;
    private String energyConsuption;
    private boolean lowEnergyMode;
    private int temperatureValue;
    private String thermostat;
    private boolean isOn;

    public void setStatus(){
        if (isOn){
            System.out.println("The heating is on");
        } else {
            System.out.println("The heating is off");
        }
    }
}
