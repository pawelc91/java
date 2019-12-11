package classExtends;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoController {
    // lista przechowująca obiekty klasy nadrzędnej czyli wszystkich typów aut
    List<Auto> autos = new ArrayList<>(
            Arrays.asList(
                    new Auto("BMW","X3","3.0 TDI","DIESEL",180_000),
                    new AdditionSets("BMW","X5","3.5 TDI","DIESEL",380_000)
            ));
    // pobierz wyszstkie auta z listy aut
    public void getAutos(){
//        for (Auto a: autos) {
//            System.out.println(a);
//        }
        // to samo wykorzystując interfejs funkcjyny
        // CTRL + Space -> generate predicate
//        autos.forEach(auto -> System.out.println(auto));
        autos.forEach(System.out::println);
    }
    // dodaj obiekt klasy auto
    public void addAuto(String brand, String model, String engineType, String fuelType, double price_net){
        Auto a = new AdditionSets(brand, model, engineType, fuelType, price_net);
        autos.add(a);
    }
    // dodaj wyposażenie do wybranego auta po indeksie listy

    /**
     * Ta metoda coś robi!!!
     * @param index
     * @param eqName
     * @param eqPrice
     * @author "MK"
     */
    public void addEquipment(int index, String eqName, double eqPrice) {
        Auto auto = autos.get(index);
        AdditionSets as = (AdditionSets) auto;
        as.assignEquipmentToAuto(eqName, eqPrice);
    }
    // daj rabat na wszystkie auta

    public static void main(String[] args) {
        AutoController ac = new AutoController();
        ac.addAuto("VW", "Passat", "1.9TDU", "DIESEL", 100_000);
        ac.addEquipment(1, "X", 1000);
//        ac.addEquipment(0, "Y", 2000); -> trzeba castować
        ac.getAutos();

    }
}