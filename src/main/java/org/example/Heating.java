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
            System.out.println(deviceName + " is on !");
        } else {
            this.isOn = false;
            System.out.println(deviceName + " is off");
        }
    }

    public void setLowEnergyMode(boolean enabled) {
        this.lowEnergyMode = enabled;
        this.temperatureValue = enabled ? 12 : 20;
        System.out.println(enabled
                ? deviceName + " : " + "Heating frost protection (12°C)"
                : deviceName + " : " + "Heating normal mode (20°C)");
    }
}
