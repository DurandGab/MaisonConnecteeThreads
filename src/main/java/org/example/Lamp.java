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

    public void setStatus(){
        if(isOn){
            System.out.println("The lamp is on");
        } else {
            System.out.println("The lamp is off");
        }
    }
}
