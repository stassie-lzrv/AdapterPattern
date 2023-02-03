package org.example;

public class RegularWallClock implements RegularClock {
    public int minuteHand;
    public int hourHand;

    public RegularWallClock(int hourHand, int minuteHand) {
        this.hourHand = hourHand;
        this.minuteHand = minuteHand;
    }

    @Override
    public void showHands() {
        System.out.printf("%d hours %d minutes\n", hourHand, minuteHand);
    }
}
