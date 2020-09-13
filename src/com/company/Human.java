package com.company;

public class Human {
    Head head;
    Leg leg;
    Hand hand;
    Human(double l, float weight){
        this.head = new Head(l ,weight);
        this.leg = new Leg(l, weight);
        this.hand = new Hand(l, weight);
    }
    Human(){}
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        System.out.println("Length: "+this.hand.getLength()+" Weight:"+this.hand.getWeight());
        return hand;
    }

    public Head getHead() {
        System.out.println("Length: "+this.head.getLength()+" Weight:"+this.head.getWeight());
        return head;
    }

    public Leg getLeg() {
        System.out.println("Length: "+this.leg.getLength()+" Weight:"+this.leg.getWeight());
        return leg;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
