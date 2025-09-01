package com.workshops.logisticsroutetracker;

class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String checkpointId, String location, double distance, int expectedDuration, int actualDuration) {
        super(checkpointId, location, distance, expectedDuration, actualDuration);
    }

    public boolean isCritical() {
        return true;
    }

    public String getType() {
        return "DeliveryCheckpoint";
    }

    public double calculatePenalty() {
        return isDelayed() ? (actualDuration - expectedDuration) * 2 : 0;
    }
}