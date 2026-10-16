package mvc.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReservationService {

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
