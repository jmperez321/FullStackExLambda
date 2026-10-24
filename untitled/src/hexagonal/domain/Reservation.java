package hexagonal.domain;


public class Reservation {
    User u;
    Book b;

    public Reservation(User u, Book b) {
        this.u = u;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Reserva " +
                "Usuario: " + u.getNom() +
                " -> Libro: " + b.getTitol();
    }
}
