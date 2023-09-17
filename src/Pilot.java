import java.util.ArrayList;
import java.util.List;

public class Pilot {
    private String name;
    private String lastName;
    private List<Lot> loty;
    public Pilot(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.loty=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void addLot(Lot lot){
        loty.add(lot);
    }

    public void removeLot(Lot lot){
        loty.remove(lot);
    }
    public void addSamolot(Samolot samolot){
        samolot.removePilot(this);
    }
    public void removeSamolot(Samolot samolot){
        samolot.removePilot(this);
    }
    //zwykła
    public void addPilot(Pilot pilot){
        pilot.addPilot(this);
    }
    public void removePilot(Pilot pilot) {
        pilot.removePilot(pilot);
    }

    
}
