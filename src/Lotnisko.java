import java.util.*;

class Lotnisko {
    private String nazwa;
    // Asocjacja kwalifikowana
    private Map<String, List<Samolot>> samoloty;



    private KontrolaLotow kontrolaLotow;
    //Kompozycja
    private List<PasStartowy> pasyStartowe;
    private static Set<PasStartowy> allPas = new HashSet<>();

    public Lotnisko(String nazwa) {
        this.nazwa = nazwa;
        this.samoloty = new HashMap<>();
        this.kontrolaLotow = new KontrolaLotow();
        this.pasyStartowe = new ArrayList<>();
    }

    public String getNazwa() {
        return nazwa;
    }
    //kwalifikowana
    public void addSamolot(Samolot samolot) {
        String typ = samolot.getTyp();
        if (!samoloty.containsKey(typ)) {
            samoloty.put(typ, new ArrayList<>());
        }
        samoloty.get(typ).add(samolot);
        samolot.setLotnisko(this);
        System.out.println("Dodano samolot " +samolot.getNumerRejestracyjny()+" do lotniska "+this.nazwa);
    }

    public void removeSamolot(Samolot samolot) {
        String typ = samolot.getTyp();
        if (samoloty.containsKey(typ)) {
            samoloty.get(typ).remove(samolot);
            samolot.setLotnisko(null);
            System.out.println("Usunięto samolot " +samolot.getNumerRejestracyjny()+" z lotniska "+this.nazwa);
        }
    }

    public List<PasStartowy> getPasyStartowe() {
        return this.pasyStartowe;
    }

    //kompozycja
    public void addPas() {
        PasStartowy pasStartowy = new PasStartowy();
        pasyStartowe.add(pasStartowy);
        allPas.add(pasStartowy);
    }

    public void usunPas(PasStartowy pasStartowy) {
        pasyStartowe.remove(pasStartowy);
        allPas.remove(pasStartowy);
    }

    public Map<String, List<Samolot>> getSamoloty() {
        return samoloty;
    }

    //klasa wewnętrzna z konstruktorem prywatnym - kompozycja
    class PasStartowy {
        private String numer;
        private PasStartowy() {
            this.numer = generateRandomNumer();
        }

        private String generateRandomNumer() {
            Random random = new Random();
            char litera = (char) (random.nextInt(26) + 'A'); // Losowa wielka litera (A-Z)
            int cyfra = random.nextInt(10); // Losowa cyfra (0-9)
            return litera + String.valueOf(cyfra);
        }

        public String getNumer() {
            return numer;
        }
    }
}
