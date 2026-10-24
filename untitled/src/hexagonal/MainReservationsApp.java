package hexagonal;

import hexagonal.application.ControllerReservation;
import hexagonal.application.ReservationRepository;
import hexagonal.domain.ReservationService;
import hexagonal.infraestructure.adapter.InMemoryReservationRepositoryAdapter;

public class MainReservationsApp {


    static void main(String[] args) {
        ReservationRepository rr = new InMemoryReservationRepositoryAdapter();
        ControllerReservation cr = new ControllerReservation();
        ReservationService rs = new ReservationService();

    }

}
