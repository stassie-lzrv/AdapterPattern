package org.example;

public class Main {
    public static void main(String[] args) {
        DigitalTableClock digitalClock = new DigitalTableClock(7,30);
        RegularWallClock regularClock = new RegularWallClock(7,50);

        DigitalClock digitalClockAdapter = new DigitalClockAdapter(regularClock);
        digitalClock.showTime();
        regularClock.showHands();
        // пользуемся часами со стрелками как цифровыми
        digitalClockAdapter.showTime();
    }
}