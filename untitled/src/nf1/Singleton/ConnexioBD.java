package nf1.Singleton;

public class ConnexioBD {
    private String nom;
    private static ConnexioBD instance;

    private ConnexioBD(){}
    private ConnexioBD(String nom) {
        this.nom = nom;
    }
    public static ConnexioBD getInstance(){
        if(instance==null){
            instance=new ConnexioBD();
        }
        return instance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
