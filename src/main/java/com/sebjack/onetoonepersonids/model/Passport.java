package com.sebjack.onetoonepersonids.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String dateIssues;
    private String location;

    @OneToOne(mappedBy = "passport")
    @JsonIgnore
    private Person person;

    public long getId() {
        return id;
    }

    public Passport() {
    }

    public Passport(String dateIssues, String location, String country, Person person) {
        this.dateIssues = dateIssues;
        this.location = location;
        this.person = person;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDateIssues() {
        return dateIssues;
    }

    public void setDateIssues(String dateIssues) {
        this.dateIssues = dateIssues;
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
