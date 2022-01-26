package ch.tbz;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class Person {
    private String vorname;
    private String nachname;
    private String geburtstag;
    private boolean bms;
    private String bff;

    public Person(){

    }


    public Person(String vorname, String nachname, String geburtstag, boolean bms, String bff){
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtstag = geburtstag;
        this.bms = bms;
        this.bff = bff;

    }

    public Person(Person person){
        this.vorname = person.vorname;
        this.nachname = person.nachname;
        this.geburtstag = person.geburtstag;
        this.bms = person.bms;
        this.bff = person.bff;

    }

    public void printPerson(){
        System.out.println("hello my name is "+vorname+" "+nachname+" and my birthdate is "+geburtstag+" me going to BMS is "+bms+" and my best friend is "+bff);
    }


    public void getFullName(){
        System.out.println(vorname + " " + nachname);
    }

    public void looseFriend(){
        bff = null;
    }
    public void calcDaysToBirthday (){
        String geburtstag = "2022-01-27";

        LocalDate dt = LocalDate.parse(geburtstag);
        LocalDate birthday = LocalDate.of(dt.getYear(), dt.getMonthValue(), dt.getDayOfMonth());
        LocalDate today = LocalDate.now();
        LocalDate nextBDay = birthday.withYear(today.getYear());

        if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
            nextBDay = nextBDay.plusYears(1);
        }
        Period p = Period.between(today, nextBDay);
        long p2 = ChronoUnit.DAYS.between(today, nextBDay);

        if (p2 == 365){
            System.out.println("Alles gute zum Geburtstag!!!!");
        }else if (p2 == 1){
            System.out.println("Noch einen Tag bis zu deinem Geburtstag ;)");
        }else{
            System.out.println("Noch " + p2 + " Tage bis zu deinem Geburtstag ;)");
        }
    }

    //getters and setters
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(String geburtstag) {
        this.geburtstag = geburtstag;
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

    public String getBffName(){
        String bestfriendnd = bff;
        return bff;
    }

}
