package classExtends;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AdditionSets extends Auto {
    private Map<String, Double> autoEqipment;

    public AdditionSets(String brand, String model,
                        String engineType, String fuelType, double price_net) {
        // super -> wywołanie konstruktora klasy Auto
        super(brand, model, engineType, fuelType, price_net);
        autoEqipment = new HashMap<>();
        System.out.println("jestem w kontruktorze AdditionSets");
    }
    public void assignEquipmentToAuto(String eqName, Double eqPriceNet){
        autoEqipment.put(eqName, eqPriceNet);
    }
    @Override
    public double calculatePriceGross(){
        double price_gross = super.calculatePriceGross();
        double cumSum = 0;
        for (String eq : autoEqipment.keySet()) {       // pętla iterująca po kluczach mapy -> nazwach wyposażenia
            // sumowanie kwot za kżdy dodatkowy element wyposażenia
            cumSum += autoEqipment.get(eq) * 1.23;
        }
        return price_gross + cumSum;
    }
    @Override
    public String toString() {
        return super.toString() + " " + autoEqipment + " |";
    }

}