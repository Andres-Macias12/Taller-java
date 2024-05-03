package C24C3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Edad {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(1998, 5, 22);
        LocalTime horaNacimiento = LocalTime.of(19, 30); // 7:30 PM


        LocalDateTime fechaHoraActual = LocalDateTime.now();


        Period periodo = Period.between(fechaNacimiento, fechaHoraActual.toLocalDate());


        System.out.println("Edad: " + periodo.getYears() + " años, " + periodo.getMonths() + " meses, y " + periodo.getDays() + " días.");


        LocalDateTime nacimiento = LocalDateTime.of(fechaNacimiento, horaNacimiento);
        long horas = nacimiento.until(fechaHoraActual, java.time.temporal.ChronoUnit.HOURS);
        long minutos = nacimiento.until(fechaHoraActual, java.time.temporal.ChronoUnit.MINUTES);
        long segundos = nacimiento.until(fechaHoraActual, java.time.temporal.ChronoUnit.SECONDS);

        System.out.println("Horas de vida: " + horas + " horas, " + minutos + " minutos, y " + segundos + " segundos.");
    }
}