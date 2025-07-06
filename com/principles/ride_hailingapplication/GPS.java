package com.principles.ride_hailingapplication;

interface GPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}