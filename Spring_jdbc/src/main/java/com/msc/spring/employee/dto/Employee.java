package com.msc.spring.employee.dto;

public class Employee {

    private Integer id;
    private String firstName;
    private String lastNam;

    public Employee(String firstName, String lastNam) {
        this.firstName = firstName;
        this.lastNam = lastNam;
    }

    public Employee(Integer id){
        this.id = id;
    }

    public Employee(){};

    public Employee(int id, String firstName, String lastNam) {
        this.firstName = firstName;
        this.lastNam = lastNam;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNam() {
        return lastNam;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastNam(String lastNam) {
        this.lastNam = lastNam;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastNam='" + lastNam + '\'' +
                '}';
    }
}
