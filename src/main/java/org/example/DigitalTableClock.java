package org.example;

public class DigitalTableClock implements DigitalClock {
    public int hour;
    public int minute;

    public DigitalTableClock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public void showTime() {
        System.out.printf("%s:%s\n", String.format("%02d", hour), String.format("%02d", minute));
    }
}
