package com.company.t4.main;
//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его отдельных полей
// (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в
// значение 0.
// Создать методы изменения времени на заданное количество часов, минут и секунд.
public class Time {
    private int hours;
    private int minutes;
    private  int seconds;
    private static final int MAX_HOURS = 24;
    private static final int MAX_MINUTES = 59;
    private static final int MAX_SECONDS = 59;

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public static int getMaxHours() {
        return MAX_HOURS;
    }

    public static int getMaxMinutes() {
        return MAX_MINUTES;
    }

    public static int getMaxSeconds() {
        return MAX_SECONDS;
    }

    public String toString() {
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}
