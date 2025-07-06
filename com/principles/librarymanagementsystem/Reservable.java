package com.principles.librarymanagementsystem;

interface Reservable {
 boolean reserveItem(String borrowerName);
 boolean checkAvailability();
}