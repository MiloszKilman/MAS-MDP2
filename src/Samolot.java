import java.util.ArrayList;
import java.util.List;

class Samolot {
    private String numerRejestracyjny;
    private Lotnisko lotnisko;
    private String typ;
    private Lotnisko deafultLotnisko = new Lotnisko("x");
    //zwykła asocjacja
    private List<Pilot> piloci;
    //asocjacja z atrybutem
    private List<Lot> loty;
    public Samolot(String numerRejestracyjny, String typ) {
        this.numerRejestracyjny = numerRejestracyjny;
        this.typ = typ;
        this.lotnisko = deafultLotnisko;
        piloci=new ArrayList<>();
        this.loty = new ArrayList<>();
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }


    public void setLotnisko(Lotnisko lotnisko) {
        this.lotnisko = lotnisko;
    }
    public void removeLotnisko(){
        this.lotnisko=deafultLotnisko;
    }

    public String getTyp() {
        return typ;
    }

    //zwykła
    public void addPilot(Pilot pilot){
        this.piloci.add(pilot);
        System.out.println("Dodano pilota "+pilot.getName()+" do samolotu "+this.numerRejestracyjny);
    }
    public void removePilot(Pilot pilot) {
        this.piloci.remove(pilot);
        System.out.println("Usunięto pilota "+pilot.getName()+" z samolotu "+this.numerRejestracyjny);

    }
    //z atrybutem
    public void addLot(Lot lot){
        loty.add(lot);
    }
    public void removeLot(Lot lot){
        loty.remove(lot);
    }
}



