package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchIn;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void punchIn(double time) {
        this.punchIn = time;
    }

    public void punchIn() {
        LocalTime now = LocalTime.now();

        this.punchIn = now.getHour() + (now.getMinute() / 60.0);
    }

    public void punchOut(double time) {
        double sessionHours = time - this.punchIn;
        this.hoursWorked += sessionHours;
    }

    public void punchOut() {
        LocalTime now = LocalTime.now();
        double time = now.getHour() + (now.getMinute() / 60.0);
        double sessionHours = time - this.punchIn;
        this.hoursWorked += sessionHours;
    }


    public double getRegularHours(){
        if(hoursWorked<40){
            return hoursWorked;

        }
        else{
            return 40;
        }
    }
    public double getOvertimeHours(){
        if (hoursWorked<40){
            return 0;
        }
        else{
            return hoursWorked - 40;
        }
    }
    public double getTotalPay(){
        return getRegularHours()*payRate + getOvertimeHours()*(payRate/2);
    }
}
