import java.util.ArrayList;
import java.util.List;

class KontrolaLotow {
    private List<Samolot> samoloty;
    private int limitSamolotow;

    public KontrolaLotow() {
        this.samoloty = new ArrayList<>();
        this.limitSamolotow = 5;
    }

    public void dodajSamolot(Samolot samolot) {
        if (samoloty.size() < limitSamolotow) {
            samoloty.add(samolot);
        } else {
            System.out.println("Limit samolotów na kontrolce lotów został osiągnięty. Samolot " + samolot.getNumerRejestracyjny() + " musi oczekiwać.");
        }
    }

    public void usunSamolot(Samolot samolot) {
        samoloty.remove(samolot);
    }

    public List<Samolot> getSamoloty() {
        return samoloty;
    }
}
