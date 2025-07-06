package com.inheritance.singleinheritance.smarthomedevices;

public class Device {
    private String deviceId;
    private String status;

    public void setdeviceid(String deviceId)
    {
    	   this.deviceId = deviceId;
    }
    public String getdeviceid()
    {
    	return deviceId;
    }
    public void setstatus(String status)
    {
    	  this.status = status;
    }
    public String getstatus()
    {
    	return status;
    }
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}