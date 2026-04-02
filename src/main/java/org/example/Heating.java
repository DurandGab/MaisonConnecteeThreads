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

    public Heating(String heatingName)
    {
        this.deviceName = heatingName;
    }

    public void setStatus(boolean status){
        if(status)
        {
            this.isOn = true;
            System.out.println("Chauffage allumé !");
        } else {
            this.isOn = false;
            System.out.println("Chauffage éteint !");
        }
    }
}
