package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
    public double getPrice(){
        double basePriceKing = 139;
        double basePriceDouble = 124;
        double total = 0;
        if (roomType.equalsIgnoreCase("king")){
            total += basePriceKing;
            if(isWeekend()){
                total+=basePriceKing*0.1;
            }
        }
        else if(roomType.equalsIgnoreCase("double")){
            total += basePriceDouble;
            if(isWeekend()){
               total += basePriceDouble*0.1;
            }
        }
        return total;

    }
    public double getResrvationTotal(){
        return getPrice()*numberOfNights;
    }
}
