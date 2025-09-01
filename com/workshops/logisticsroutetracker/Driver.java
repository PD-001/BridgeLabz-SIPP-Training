package com.workshops.logisticsroutetracker;

import java.io.Serializable;

class Driver implements Serializable {
    private static final long serialVersionUID = 1L;

    String driverId;
    String name;
    RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public void addCheckpoint(Checkpoint cp) {
        routeHistory.addCheckpoint(cp);
    }

    public void printSummary() {
        System.out.printf("Driver: %s – %s%nRoute Summary:%n", driverId, name);
        routeHistory.printRoute();
        double totalDistance = routeHistory.computeTotalDistance();
        double totalPenalty = routeHistory.computeTotalPenalty();
        double routeScore = 100 - totalPenalty;
        boolean isConsistent = routeHistory.checkCriticalConsistency();

        System.out.printf("Total Distance: %.1f km%n", totalDistance);
        System.out.printf("Total Penalty: %.1f%n", totalPenalty);
        System.out.printf("Route Score: %.1f%n", routeScore);
        System.out.println("Critical Route Check: " + (isConsistent ? "All required checkpoints present" : "Missing critical checkpoints"));
    }
}