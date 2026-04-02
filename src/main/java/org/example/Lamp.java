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

//    public Lamp(int idLamp, String deviceName, boolean isConnectionActivated, String energyConsuption, boolean lowEnergyMode, int temperature, int brightness, String color) {
//        this.idLamp = idLamp;
//        this.deviceName = deviceName;
//        this.isConnectionActivated = isConnectionActivated;
//        this.energyConsuption = energyConsuption;
//        this.lowEnergyMode = lowEnergyMode;
//        this.temperature = temperature;
//        this.brightness = brightness;
//        this.color = color;
//    }

    public void setStatus(boolean status){
        if(status){
            this.isOn = true;
            System.out.println("The lamp is on");
        } else {
            this.isOn = false;
            System.out.println("The lamp is off");
        }
    }
}
