package com.workshops.logisticsroutetracker;

@FunctionalInterface
interface PenaltyCalculator {
 double calculate(Checkpoint cp);
}