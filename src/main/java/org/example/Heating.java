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

    public void setLowEnergyMode(boolean enabled) {
        this.lowEnergyMode = enabled;
        this.temperatureValue = enabled ? 12 : 20;
        System.out.println(enabled
                ? "Chauffage hors-gel (12°C)"
                : "Chauffage mode normal (20°C)");
    }
}
