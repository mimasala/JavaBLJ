package ch.tbz;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class daysBetweenDays {
    public static void main(String[] args) {

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
}
