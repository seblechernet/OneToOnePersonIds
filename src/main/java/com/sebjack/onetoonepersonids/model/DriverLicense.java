package com.sebjack.onetoonepersonids.model;

import javax.persistence.*;

@Entity
public class DriverLicense {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String dateIssued;
    private String location;

    @OneToOne(mappedBy = "driverLicense")
    private Person person;


    public DriverLicense(String dateIssues, String location, Person person) {
        this.dateIssued = dateIssues;
        this.location = location;
        this.person = person;
    }

    public DriverLicense() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(String dateIssued) {
        this.dateIssued = dateIssued;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
