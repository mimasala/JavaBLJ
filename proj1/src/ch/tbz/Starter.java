package ch.tbz;

public class Starter {

    public static void main(String[] args) {
        Person stefan = new Person();
        stefan.setFirstname("Stefan");
        stefan.setLastname("Laux");
        stefan.setBirthday("2005-01-01");
        stefan.setBms(true);
        stefan.setBff("Mischa");

        Person mischa = new Person();
        mischa.setFirstname("Mischa");
        mischa.setLastname("Strauss");
        mischa.setBirthday("2005-09-21");
        mischa.setBms(true);
        mischa.setBff("Ismael");

        Person ismael = new Person();
        ismael.setFirstname("Ismael");
        ismael.setLastname("Lamgadar");
        ismael.setBirthday("2005-04-01");
        ismael.setBms(true);
        ismael.setBff("Stefan");

        mischa.printPerson();
        stefan.printPerson();
        ismael.printPerson();

    }
}
