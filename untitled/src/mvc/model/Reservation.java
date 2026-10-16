package mvc.model;

public class Reservation {
    User u;
    Book b;

    public Reservation(User u, Book b) {
        this.u = u;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "u=" + u +
                ", b=" + b +
                '}';
    }
}
