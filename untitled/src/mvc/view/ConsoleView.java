package mvc.view;

import mvc.model.Reservation;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleView {
    Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

    public int mainMenu() {
        System.out.println("""
                
                --------------------------------
                Selecciona la teva opció:
                --------------------------------
                1. Nova reserva
                2. Llista de reserves
                0. Sortir
                --------------------------------
                """);
        return sc.nextInt();
    }

    public String askUserName() {
        sc.nextLine();
        System.out.println("""
                
                --------------------------------
                Introdueix el nom del USUARI:
                --------------------------------
                """);
        return sc.nextLine();
    }

    public String askBookName() {
        System.out.println("""
                
                --------------------------------
                Introdueix el nom del LLIBRE:
                --------------------------------
                """);
        return sc.nextLine();
    }

    public void outPutBookingEnd(String[] info) {
        System.out.println("Reserva realitzada: " + info[0] + " ha reservat \"" + info[1] + "\"");
    }

    public void showAll(List<Reservation> llistatReserves) {
        llistatReserves.stream().forEach(System.out::println);
    }


    public void invalidOption() {
        System.out.println("***** Opció invalida *****");
    }
}
