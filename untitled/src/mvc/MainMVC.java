package mvc;

import mvc.controller.ReservationController;
import mvc.model.ReservationService;
import mvc.view.ConsoleView;

public class MainMVC {
    static void main(String[] args) {
        ReservationController reservationController = new ReservationController(new ReservationService(), new ConsoleView());
        reservationController.start();
    }
}