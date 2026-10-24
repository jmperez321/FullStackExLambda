package hexagonal.infraestructure.adapter;

import hexagonal.application.ReservationRepository;
import hexagonal.domain.Reservation;

import java.util.ArrayList;

public class InMemoryReservationRepositoryAdapter implements ReservationRepository {
    ArrayList<Reservation> llistaDeReserves = new ArrayList<>();

    @Override
    public void save(Reservation r) {


    }

    @Override
    public void finAll() {

    }
}
