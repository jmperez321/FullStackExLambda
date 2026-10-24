package hexagonal.infraestructure.adapter;

import hexagonal.application.ReservationRepository;
import hexagonal.domain.Reservation;
import hexagonal.domain.ReservationService;

public class FileReservationRepositoryAdapter implements ReservationRepository {
    ReservationService rs = new ReservationService();

    @Override
    public void save(Reservation r) {
    }

    @Override
    public void finAll() {

    }
}
