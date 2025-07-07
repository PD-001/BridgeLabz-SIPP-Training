package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

import java.util.ArrayList;

class User {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friendIds; // Stores Friend IDs
    User next; // Pointer to next user in the linked list

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}