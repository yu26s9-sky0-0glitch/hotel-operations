package com.pluralsight;

public class Main {
    static void main(){
        Reservation kingRoom = new Reservation("king",4,true);
        System.out.println(kingRoom.getResrvationTotal());
        Employee sahar = new Employee(1234,"sahar","software",19.5,55);
        System.out.println(sahar.getTotalPay());
        sahar.punchIn(0.5);
        sahar.punchOut();
        System.out.println(sahar.getHoursWorked());
        System.out.println(sahar.getTotalPay());
        Hotel hilton = new Hotel("hilton",4,6);
        System.out.println(hilton.getAvailableRooms());
        hilton.bookRoom(2,false);
        System.out.println(hilton.getAvailableRooms());
    }
}
