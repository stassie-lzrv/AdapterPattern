package org.example;

public class DigitalClockAdapter implements DigitalClock {
    RegularClock regularClock;

    public DigitalClockAdapter(RegularClock regularClock) {
        this.regularClock = regularClock;
    }


    @Override
    public void showTime() {
        regularClock.showHands();
    }
}
