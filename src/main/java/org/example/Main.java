package org.example;

import org.example.tasks.Hallway;

public class Main {
    public static void main(String[] args) {
        System.out.println(Hallway.contactByPattern("><"));
        System.out.println(Hallway.contactByPattern(">-<"));
        System.out.println(Hallway.contactByPattern(">----<"));
        System.out.println(Hallway.contactByPattern(">-----<-->--<-----"));
    }
}