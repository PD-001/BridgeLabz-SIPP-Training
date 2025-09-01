package com.workshops.logisticsroutetracker;

class RestCheckpoint extends Checkpoint {
    public RestCheckpoint(String checkpointId, String location, double distance, int expectedDuration, int actualDuration) {
        super(checkpointId, location, distance, expectedDuration, actualDuration);
    }

    public boolean isCritical() {
        return false;
    }

    public String getType() {
        return "RestCheckpoint";
    }

    public double calculatePenalty() {
        return isDelayed() && (actualDuration - expectedDuration) > 30
            ? (actualDuration - expectedDuration) * 0.5
            : 0;
    }
}
