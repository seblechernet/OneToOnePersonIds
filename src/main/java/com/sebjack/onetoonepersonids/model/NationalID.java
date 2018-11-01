package com.sebjack.onetoonepersonids.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class NationalID {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String dateIssued;
    private String location;

    @JsonIgnore
    @OneToOne(mappedBy = "nationalID")
    private Person person;


    public NationalID(String dateIssues, String location, Person person) {
        this.dateIssued = dateIssues;
        this.location = location;
        this.person = person;
    }

    public NationalID() {
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
