package com.sebjack.onetoonepersonids.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    DriverLicenseRepository driverLicenseRepository;
    @Autowired
    NationalIDRepository nationalIDRepository;
    @Autowired
    PassportRepository passportRepository;

    @Override
    public void run(String... strings) throws Exception{

        //*********************************************************************
        //* Create person 1, driverlicense, nationalid, passport, and link them
        //*********************************************************************
        //create DL
        //public DriverLicense(String dateIssues, String location, Person person)
        DriverLicense driverLicense1= new DriverLicense();
        driverLicense1.setDateIssued("June 2005");
        driverLicense1.setLocation("Maryland");
        //create national id
        //public NationalID(String dateIssues, String location, Person person)
        NationalID natID1 = new NationalID();
        natID1.setDateIssued("February 2017");
        natID1.setLocation("Ethiopia");
        //create Passport
        //  public Passport(String dateIssues, String location, String country, Person person)
        Passport passport1 = new Passport();
        passport1.setDateIssues("May 2016");
        passport1.setLocation("USA");
        //create person
        //         public Person(String name, DriverLicense driverLicense, NationalID nationalID, Passport passport)
        Person person1 = new Person();
        person1.setName("Seble");
        //link person && DriverLicense
        person1.setDriverLicense(driverLicense1);
        driverLicense1.setPerson(person1);

        //Link Person && NationalID
        person1.setNationalID(natID1);
        natID1.setPerson(person1);

        //link Person && Passport
        person1.setPassport(passport1);
        passport1.setPerson(person1);

        //add to repositories
        personRepository.save(person1);
        driverLicenseRepository.save(driverLicense1);
        nationalIDRepository.save(natID1);
        passportRepository.save(passport1);


        //*********************************************************************
        //* Create person 2, driverlicense, nationalid, passport, and link them
        //*********************************************************************
        //create DL
        //public DriverLicense(String dateIssues, String location, Person person)
        DriverLicense driverLicense2= new DriverLicense();
        driverLicense2.setDateIssued("May 2006");
        driverLicense2.setLocation("DC");
        //create national id
        //public NationalID(String dateIssues, String location, Person person)
        NationalID natID2 = new NationalID();
        natID2.setDateIssued("August 2017");
        natID2.setLocation("Nigeria");
        //create Passport
        //  public Passport(String dateIssues, String location, String country, Person person)
        Passport passport2 = new Passport();
        passport2.setDateIssues("July 2000");
        passport2.setLocation("Germany");
        //create person
        //         public Person(String name, DriverLicense driverLicense, NationalID nationalID, Passport passport)
        Person person2 = new Person();
        person2.setName("Jack");
        //link person && DriverLicense
        person2.setDriverLicense(driverLicense2);
        driverLicense2.setPerson(person2);

        //Link Person && NationalID
        person2.setNationalID(natID2);
        natID2.setPerson(person2);

        //link Person && Passport
        person2.setPassport(passport2);
        passport2.setPerson(person2);

        //add to repositories
        personRepository.save(person2);
        driverLicenseRepository.save(driverLicense2);
        nationalIDRepository.save(natID2);
        passportRepository.save(passport2);


        //*********************************************************************
        //* Create person 1, driverlicense, nationalid, passport, and link them
        //*********************************************************************
        //create DL
        //public DriverLicense(String dateIssues, String location, Person person)
        DriverLicense driverLicense3= new DriverLicense();
        driverLicense3.setDateIssued("Sep 2005");
        driverLicense3.setLocation("Verginia");
        //create national id
        //public NationalID(String dateIssues, String location, Person person)
        NationalID natID3 = new NationalID();
        natID3.setDateIssued("February 2017");
        natID3.setLocation("Ethiopia");
        //create Passport
        //  public Passport(String dateIssues, String location, String country, Person person)
        Passport passport3 = new Passport();
        passport3.setDateIssues("Dec 2016");
        passport3.setLocation("France");
        //create person
        //         public Person(String name, DriverLicense driverLicense, NationalID nationalID, Passport passport)
        Person person3 = new Person();
        person3.setName("Blen");
        //link person && DriverLicense
        person3.setDriverLicense(driverLicense3);
        driverLicense3.setPerson(person3);

        //Link Person && NationalID
        person3.setNationalID(natID3);
        natID3.setPerson(person3);

        //link Person && Passport
        person3.setPassport(passport3);
        passport3.setPerson(person3);

        //add to repositories
        personRepository.save(person3);
        driverLicenseRepository.save(driverLicense3);
        nationalIDRepository.save(natID3);
        passportRepository.save(passport3);



    }

}
