package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkIn_should_make_room_dirty(){
        Room room = new Room(2,139,false,false);
        boolean expectedIsDirty = true;

        room.checkIn();

        assertEquals(expectedIsDirty,room.isDirty());
    }
    @Test
    public void checkIn_should_make_room_occupied(){
        Room room = new Room(2,139,false,false);
        boolean expectedIsOccupied = true;

        room.checkIn();

        assertEquals(expectedIsOccupied,room.isOccupied());
    }
    @Test
    public void checkOut_should_make_room_dirty(){
        Room room = new Room(2,139,false,false);
        boolean expectedIsDirty = true;

        room.checkIn();
        room.checkOut();

        assertEquals(expectedIsDirty,room.isDirty());
    }
    @Test
    public void checkOut_should_make_room_unoccupied(){
        Room room = new Room(2,139,false,false);
        boolean expectedIsOccupied = false;

        room.checkIn();
        room.checkOut();

        assertEquals(expectedIsOccupied,room.isOccupied());
    }
    @Test
    public void cleanRoom_should_make_room_notDirty(){
        Room room = new Room(2,139,false,false);
        boolean expectedIsDirty = false;

        room.checkIn();
        room.checkOut();
        room.cleanRoom();

        assertEquals(expectedIsDirty,room.isDirty());
    }
    @Test
    public void notAvailable_if_occupied(){
        Room room = new Room(2,139,false,false);
        boolean expectedIsAvailable = false;

        room.setOccupied(true);

        assertEquals(expectedIsAvailable,room.isAvailable());
    }
    @Test
    public void notAvailable_if_dirty(){
        Room room = new Room(2,139,false,false);
        boolean expectedIsAvailable = false;

        room.setDirty(true);

        assertEquals(expectedIsAvailable,room.isAvailable());
    }


}
