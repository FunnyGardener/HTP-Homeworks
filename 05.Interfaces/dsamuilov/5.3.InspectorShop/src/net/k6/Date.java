package net.k6;

import java.util.Calendar;
import java.util.Random;

public class Date implements Comparable<Date> {
    private int day = 1;
    private int month = 1;
    private int year;

    Date() {
    }

    Date(int day, int month, int year) {
        if (day > 0 && day <= 31) this.day = day;
        if (month > 0 && month <= 12) this.month = month;
        if (year >= 0) this.year = year;
    }

    public void setDate(int day, int month, int year) {
        if (day >= 0 && day <= 31) this.day = day;
        if (month >= 0 && month <= 12) this.month = month;
        if (year >= 0) this.year = year;
    }

    public void setDay(int day) {
        if (day <= 31) this.day = day;
    }

    public void setMonth(int month) {
        if (month <= 12) this.month = month;
    }

    public void setYear(int year) {
        if (year >= 0) this.year = year;
    }

    public int getDate() {
        return ((day * 1000000) + (month * 10000) + (year));
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public static Date getCurrentDate() {
        Calendar c = Calendar.getInstance();
        return new Date(c.get(c.DAY_OF_MONTH), (c.get(c.MONTH) + 1), c.get(c.YEAR));
    }

    public static Date randomDate(int startDay, int startMonth, int startYear) {
        if (startDay < 0 && startDay > 31) startDay = 0;
        if (startMonth < 0 && startMonth > 12) startMonth = 0;
        return new Date(new Random().nextInt(32 - startDay) + startDay, new Random().nextInt(13 - startMonth) + startMonth, new Random().nextInt(2016 - startYear) + startYear);
    }

    @Override
    public String toString() {
        return String.valueOf(day) + "." + String.valueOf(month) + "." + String.valueOf(year);
    }

    @Override
    public int compareTo(Date date) {
        if (date == null) return -2;
        int currentDate = this.year * 10000 + this.month * 100 + this.day;
        int matchDate = date.getYear() * 10000 + date.getMonth() * 100 + date.getDay();
        if (currentDate < matchDate) return -1;
        if (currentDate > matchDate) return 1;
        else return 0;
    }


}
