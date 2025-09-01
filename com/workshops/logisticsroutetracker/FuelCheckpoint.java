package com.workshops.logisticsroutetracker;

class FuelCheckpoint extends Checkpoint {
    public FuelCheckpoint(String checkpointId, String location, double distance, int expectedDuration, int actualDuration) {
        super(checkpointId, location, distance, expectedDuration, actualDuration);
    }

    public boolean isCritical() {
        return true;
    }

    public String getType() {
        return "FuelCheckpoint";
    }

    public double calculatePenalty() {
        return isDelayed() ? 10 : 0;
    }
}