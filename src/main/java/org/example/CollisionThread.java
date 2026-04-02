package org.example;

public class CollisionThread implements Runnable{
    private ConnectedDevice device;

    public CollisionThread(ConnectedDevice device) {
        this.device = device;
    }

    @Override
    public void run() {
        System.out.println("[Collision] Attempt to modify the device...");
        device.setStatus(true);
    }
}
