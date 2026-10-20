package mvc.controller;

import mvc.model.Book;
import mvc.model.ReservationService;
import mvc.model.User;
import mvc.view.ConsoleView;

public class ReservationController {
    ReservationService reservationService;
    ConsoleView consoleView;

    public ReservationController(ReservationService reservationService, ConsoleView consoleView) {
        this.reservationService = reservationService;
        this.consoleView = consoleView;
    }

    public void start() {
        boolean encendido = true;
        while (encendido) {
            int op = consoleView.mainMenu();
            switch (op) {
                case 1: // Nueva reserva
                    consoleView.outPutBookingEnd(reservationService.reserve(new User(consoleView.askUserName()), new Book(consoleView.askBookName())));
                    break;
                case 2: // Listar reservas
                    consoleView.showAll(reservationService.getAllReservations());
                    break;
                case 0: // Salir
                    encendido = false;
                    break;
                default: // Opción invalida
                    consoleView.invalidOption();
                    break;
            }
        }

    }

}
