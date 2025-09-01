package com.workshops.logisticsroutetracker;

import java.io.Serializable;

abstract class Checkpoint implements Serializable {
    String checkpointId;
    String location;
    double distance;
    int expectedDuration;
    int actualDuration;

    public Checkpoint(String checkpointId, String location, double distance, int expectedDuration, int actualDuration) {
        this.checkpointId = checkpointId;
        this.location = location;
        this.distance = distance;
        this.expectedDuration = expectedDuration;
        this.actualDuration = actualDuration;
    }

    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    public abstract boolean isCritical();
    public abstract String getType();
    public abstract double calculatePenalty();
}