package nf1.Singleton;

public class MainAppDB {
    static void main(String[] args) {
        // ConnexioBD con = new ConnexioBD("Alumnes");
        ConnexioBD con = ConnexioBD.getInstance();

        System.out.println(con.getNom());

        mX();
        con.setNom("Clients");
        mX();

    }

    public static void mX(){
        //ConnexioBD con = new ConnexioBD("Persones");
        ConnexioBD con = ConnexioBD.getInstance();
        System.out.println(con.getNom());
    }
}
