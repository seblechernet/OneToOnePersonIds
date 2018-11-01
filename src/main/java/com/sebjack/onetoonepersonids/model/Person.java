package com.sebjack.onetoonepersonids.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="DL_ID")

    private DriverLicense driverLicense;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="NI_ID")
    private NationalID nationalID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="PSS_ID")
    private Passport passport;

    public Person() {
    }

    public Person(String name, DriverLicense driverLicense, NationalID nationalID, Passport passport) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.nationalID = nationalID;
        this.passport = passport;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    public NationalID getNationalID() {
        return nationalID;
    }

    public void setNationalID(NationalID nationalID) {
        this.nationalID = nationalID;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }
}
