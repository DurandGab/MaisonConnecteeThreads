package org.example;

import lombok.Getter;

import java.util.ArrayList;

public class Room
{
    private int idRoom;
    private String roomName;
    private boolean lightState;

    public Room(String roomName)
    {
        this.roomName = roomName;
    }

    @Getter
    private ArrayList<ConnectedDevice> roomDevices = new ArrayList<ConnectedDevice>();
}
