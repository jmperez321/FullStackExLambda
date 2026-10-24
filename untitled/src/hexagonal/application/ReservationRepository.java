package hexagonal.application;

import hexagonal.domain.Reservation;

public interface ReservationRepository {

    void save(Reservation r);
    void finAll();

}
