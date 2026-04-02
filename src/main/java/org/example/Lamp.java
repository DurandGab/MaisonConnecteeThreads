package org.example;

public class Lamp implements ConnectedDevice{
    private int idLamp;
    private String deviceName;
    private boolean isConnectionActivated;
    private String energyConsuption;
    private boolean lowEnergyMode;
    private boolean isOn;
    private int temperature;
    private int brightness;
    private String color;

    public Lamp(String deviceName)
    {
        this.deviceName = deviceName;
    }

    public void setStatus(boolean status){
        if(status){
            this.isOn = true;
            System.out.println(deviceName + " is on");
        } else {
            this.isOn = false;
            System.out.println(deviceName + " is off");
        }
    }
}
