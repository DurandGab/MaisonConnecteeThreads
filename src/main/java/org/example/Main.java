package org.example;

public class Main
{
    public static void main(String[] args)
    {
        // Rooms
        Room bedroom = new Room("Bedroom");
        Room kitchen = new Room("Kitchen");
        Room bathroom = new Room("Bathroom");
        Room garagePlace = new Room("Garage");

        // Heatings
        HeatingCreator heatingCreator = new HeatingCreator();
        ConnectedDevice bedroomHeating = heatingCreator.createConnectedDevice("Heating of bedroom");
        ConnectedDevice kitchenHeating = heatingCreator.createConnectedDevice("Heating of kitchen");
        ConnectedDevice bathroomHeating = heatingCreator.createConnectedDevice("Heating of bathroom");

        // Garage
        GarageCreator garageCreator = new GarageCreator();
        ConnectedDevice garage = garageCreator.createConnectedDevice("Garage door");

        // Shutters
        ShutterCreator shutterCreator = new ShutterCreator();
        ConnectedDevice shuttersBedroom = shutterCreator.createConnectedDevice("Shutters of bedroom");
        ConnectedDevice shuttersKitchen = shutterCreator.createConnectedDevice("Shutters of kitchen");
        ConnectedDevice shuttersBathroom = shutterCreator.createConnectedDevice("Shutters of bathroom");

        // Lamps
        LampCreator lampCreator = new LampCreator();
        ConnectedDevice bedroomLampBed = lampCreator.createConnectedDevice("Lamp of bedroom's bed");
        ConnectedDevice bedroomLampCeiling = lampCreator.createConnectedDevice("Lamp of bedroom's ceiling");
        ConnectedDevice bedroomLampDesk = lampCreator.createConnectedDevice("Lamp of bedroom's desk");
        ConnectedDevice kitchenLampCeiling = lampCreator.createConnectedDevice("Lamp of kitchen's ceiling");
        ConnectedDevice kitchenLampSink = lampCreator.createConnectedDevice("Lamp of kitchen's sink");
        ConnectedDevice kitchenLampTable = lampCreator.createConnectedDevice("Lamp of kitchen's table");
        ConnectedDevice bathroomLampSink = lampCreator.createConnectedDevice("Lamp of bathroom's sink");
        ConnectedDevice bathroomLampShower = lampCreator.createConnectedDevice("Lamp of bathroom's shower");
        ConnectedDevice bathroomLampSpots = lampCreator.createConnectedDevice("Lamp of bathroom's spots");

        // Bedroom connected devices
        bedroom.getRoomDevices().add(bedroomLampBed);
        bedroom.getRoomDevices().add(bedroomLampCeiling);
        bedroom.getRoomDevices().add(bedroomLampDesk);
        bedroom.getRoomDevices().add(bedroomHeating);
        bedroom.getRoomDevices().add(shuttersBedroom);

        // Kitchen connected devices
        kitchen.getRoomDevices().add(kitchenLampCeiling);
        kitchen.getRoomDevices().add(kitchenLampSink);
        kitchen.getRoomDevices().add(kitchenLampTable);
        kitchen.getRoomDevices().add(kitchenHeating);
        kitchen.getRoomDevices().add(shuttersKitchen);

        // Bathroom connected devices
        bathroom.getRoomDevices().add(bathroomLampSpots);
        bathroom.getRoomDevices().add(bathroomLampSink);
        bathroom.getRoomDevices().add(bathroomLampShower);
        bathroom.getRoomDevices().add(bathroomHeating);
        bathroom.getRoomDevices().add(shuttersBathroom);

        // Garage connected device
        garagePlace.getRoomDevices().add(garage);
    }
}