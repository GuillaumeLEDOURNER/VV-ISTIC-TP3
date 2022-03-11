package fr.istic.vv;

import java.time.YearMonth;

class Date implements Comparable<Date> {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
     }

    public static boolean isValidDate(int day, int month, int year) {
        if(year > 0  && month > 0 && month <= 12){
            return day > 0 && day <= thirtyOrThirtyOne(month,year);
        }
        return false;
     }

    public static boolean isLeapYear(int year) { 
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
     }

    public Date nextDate() {
        YearMonth y = YearMonth.of(this.year,this.month);
        if(this.month < 12 && this.month > 1) {

            if (day > 0 && day < y.lengthOfMonth()) {
                return new Date(this.day + 1, this.month, this.year);
            }
            if (day == y.lengthOfMonth()) {
                return new Date(1, this.month + 1, this.year);
            }
        }
        if(day == y.lengthOfMonth() && this.month == 12){
            return new Date(1, 1, this.year+1);
        }
        return null;
     }

    public Date previousDate() { 
        YearMonth y = YearMonth.of(this.year,this.month);
        if(day > 0 && day < y.lengthOfMonth()){
            return new Date(this.day - 1, this.month, this.year);
        }
        if(day == 1 && this.month > 1 && this.month < 12){
            YearMonth y2 = YearMonth.of(this.year,this.month-1);
            return new Date(y2.lengthOfMonth(), this.month-1, this.year);
        }
        if(day == 1 && this.month == 1){
            return new Date(31, 12, this.year-1);
        }
        return null;
    }
    public String toString(){
        return "day : " + this.day + " | month : " + this.month + " | year : " + this.year;
    }
    private static int thirtyOrThirtyOne(int month,int year){
        if(month <= 12 && month >= 1){
            if(month == 1 || month == 3 ||month == 5 ||month == 7 ||month == 8 ||month == 10 || month == 12 ){
                return 31;
            }
            if(month == 4 || month == 6 || month == 9 || month == 11 ){
                return 30;
            }
            if(month == 2 && isLeapYear(year)){
                return 29;
            }else {
                return 28;
            }
        }
        return -1;
    }

    public int compareTo(Date other) {
        if(other != null) {
            if (this.day == other.day && this.month == other.month && this.year == other.year) {
                return 0;
            }
            if (this.year > other.year || (this.year == other.year && this.month > other.month) ||
                    (this.year == other.year && this.month == other.month && this.day > other.day)) {
                return 1;
            } else {
                return -1;
            }
        }
        throw new NullPointerException("input value is null");
    }

}