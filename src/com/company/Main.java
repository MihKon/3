package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double l;
        float w;
        Human man = new Human();
        Scanner scan = new Scanner(System.in);
        l = scan.nextDouble();
        w = scan.nextFloat();
        Head head = new Head(l, w);
        man.setHead(head);
        l = scan.nextDouble();
        w = scan.nextFloat();
        Hand hand = new Hand(l, w);
        man.setHand(hand);
        l = scan.nextDouble();
        w = scan.nextFloat();
        Leg leg = new Leg(l, w);
        man.setLeg(leg);
        System.out.println("Head:");
        man.getHead();
        System.out.println("Hand:");
        man.getHand();
        System.out.println("Legs:");
        man.getLeg();
    }
}
