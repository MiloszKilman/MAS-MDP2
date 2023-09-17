import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Samolot samolot1 = new Samolot("ABC123", "Boeing");
        Samolot samolot2 = new Samolot("DEF456", "Airbus");
        Samolot samolot3 = new Samolot("GHI789", "Boeing");
        Pilot pilot = new Pilot("Jan", "Kowalski");
        Pilot pilot1 = new Pilot("Tomasz", "Nowak");
        Lotnisko lotnisko1 = new Lotnisko("Lotnisko A");
        Lotnisko lotnisko2 = new Lotnisko("Lotnisko B");

        //asocjacja zwykła
        System.out.println("====Zwykła===");
        samolot1.addPilot(pilot);
        samolot1.addPilot(pilot1);
        samolot1.removePilot(pilot);

        //asocjacja z atrybutem
        System.out.println("===Z Atrybutem====");
        Lot lot = new Lot(pilot,samolot1,30);
        System.out.println(lot.toString());

        //asocjacja kwalifikowana
        System.out.println("====Kwalifikowana====");
        lotnisko1.addSamolot(samolot2);
        lotnisko1.addSamolot(samolot1);
        lotnisko2.addSamolot(samolot3);


        //kompozycja
        lotnisko1.addPas();
        lotnisko1.addPas();
        lotnisko1.addPas();
        lotnisko2.addPas();
        lotnisko2.addPas();
        lotnisko2.addPas();
        lotnisko2.addPas();
        System.out.println();
        System.out.println("====Kompozycja====");
        System.out.println("Pasy startowe na lotnisku " + lotnisko1.getNazwa() + ":");
        List<Lotnisko.PasStartowy> pasyStartowe = lotnisko1.getPasyStartowe();
        for (Lotnisko.PasStartowy pasStartowy : pasyStartowe) {
            System.out.println(" - " + pasStartowy.getNumer());
        }
        System.out.println();
        System.out.println("Pasy startowe na lotnisku " + lotnisko2.getNazwa() + ":");
        List<Lotnisko.PasStartowy> pasyStartowe2 = lotnisko2.getPasyStartowe();
        for (Lotnisko.PasStartowy pasStartowy : pasyStartowe2) {
            System.out.println(" - " + pasStartowy.getNumer());
        }
        System.out.println();


    }
}
