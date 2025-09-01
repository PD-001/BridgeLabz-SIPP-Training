package com.workshops.logisticsroutetracker;

import java.io.Serializable;

class RouteLinkedList<T extends Checkpoint> implements Serializable {
    private static final long serialVersionUID = 1L;

    private static class Node<T> implements Serializable {
        private static final long serialVersionUID = 1L;
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;

    public void addCheckpoint(T checkpoint) {
        Node<T> newNode = new Node<>(checkpoint);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public double computeTotalDistance() {
        double total = 0;
        Node<T> temp = head;
        while (temp != null) {
            total += temp.data.distance;
            temp = temp.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0;
        Node<T> temp = head;
        while (temp != null) {
            total += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return total;
    }

    public boolean checkCriticalConsistency() {
        boolean hasDelivery = false, hasFuel = false;
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data instanceof DeliveryCheckpoint) hasDelivery = true;
            if (temp.data instanceof FuelCheckpoint) hasFuel = true;
            temp = temp.next;
        }
        return hasDelivery && hasFuel;
    }

    public void printRoute() {
        Node<T> temp = head;
        int count = 1;
        while (temp != null) {
            T cp = temp.data;
            System.out.printf("%d. %s – %s – %s – Penalty: %.1f%n",
                count++, cp.getType(), cp.location,
                cp.isDelayed() ? "Delayed" : "On Time",
                cp.calculatePenalty());
            temp = temp.next;
        }
    }
}