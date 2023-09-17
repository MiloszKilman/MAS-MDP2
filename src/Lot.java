public class Lot {
    private Pilot pilot;
    private Samolot samolot;
    private int czasWPowietrzu;

    public Lot(Pilot pilot, Samolot samolot, int czasWPowietrzu) {
        this.pilot = pilot;
        this.samolot = samolot;
        this.czasWPowietrzu = czasWPowietrzu;
        samolot.addLot(this);
        pilot.addLot(this);
    }
    public void addLot(Lot lot){
        lot.addLot(this);
    }
    public void removeLot(Lot lot){
        lot.removeLot(this);
    }

    @Override
    public String toString() {
        return "Lot{" +
                "pilot=" + pilot +
                ", samolot=" + samolot +
                ", czasWPowietrzu=" + czasWPowietrzu +
                '}';
    }
}
