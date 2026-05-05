package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void hoursWorked_should_be_updated_whenPunchedOut(){
        Employee sahar = new Employee(1123,"sahar","Software",35,40);
        double expectedHoursWorked = 44;
        sahar.punchIn(4.5);
        sahar.punchOut(8.5);
        assertEquals(expectedHoursWorked,sahar.getHoursWorked());
    }

}