package hexagonal.domain;

import hexagonal.application.ControllerReservation;
import hexagonal.domain.Reservation;
import mvc.controller.ReservationController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReservationService {

    /*public void reserve(User u, Book b){
        // se guarda a traves de un port (ni puta idea)

    }*/
    List<Reservation> llistaReserves = new ArrayList<>();


    public String[] reserve(User user, Book book) {
        llistaReserves.add(new Reservation(user, book));
        String[] info = {user.getNom(), book.getTitol()};
        return info;

    }

    public List<Reservation> getAllReservations() {
        List<Reservation> onlyReadList = Collections.unmodifiableList(llistaReserves);
        return onlyReadList;
    }
}
