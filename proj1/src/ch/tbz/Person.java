package ch.tbz;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class Person {
    private String firstname;
    private String lastname;
    private String birthday;
    private boolean bms;
    private String bff;

    public Person() {

    }


    public Person(String firstname, String lastname, String birthday, boolean bms, String bff) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.bms = bms;
        this.bff = bff;

    }

    public Person(Person person) {
        this.firstname = person.firstname;
        this.lastname = person.lastname;
        this.birthday = person.birthday;
        this.bms = person.bms;
        this.bff = person.bff;

    }

    public void printPerson() {
        System.out.println("hello my name is " + firstname + " " + lastname + " and my birthdate is " + birthday + " me going to BMS is " + bms + " and my best friend is " + bff);
    }


    public void getFullName() {
        System.out.println(firstname + " " + lastname);
    }

    public void looseFriend() {
        bff = null;
    }

    public void calcDaysToBirthday() {

        LocalDate dt = LocalDate.parse(birthday);
        LocalDate birthday = LocalDate.of(dt.getYear(), dt.getMonthValue(), dt.getDayOfMonth());
        LocalDate today = LocalDate.now();
        LocalDate nextBDay = birthday.withYear(today.getYear());

        if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
            nextBDay = nextBDay.plusYears(1);
        }

        Period p = Period.between(today, nextBDay);
        long p2 = ChronoUnit.DAYS.between(today, nextBDay);

        if (p2 == 365) {
            System.out.println("Alles gute zum Geburtstag!!!!");
        } else if (p2 == 1) {
            System.out.println("Noch einen Tag bis zu deinem Geburtstag ;)");
        } else {
            System.out.println("Noch " + p2 + " Tage bis zu deinem Geburtstag ;)");
        }
    }

    //getters and setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isBms() {
        return bms;
    }

    public void setBms(boolean bms) {
        this.bms = bms;
    }

    public String getBff() {
        return bff;
    }

    public void setBff(String bff) {
        this.bff = bff;
    }

    public String getBffName() {
        String bestfriend = bff;
        return bff;
    }

}
