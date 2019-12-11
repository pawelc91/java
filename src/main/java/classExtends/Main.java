package classExtends;

public class Main {
    public static void compareAutoPrices(Auto a1, Auto a2){
        if(a1.calculatePriceGross() > a2.calculatePriceGross()){
            System.out.println("Auto pierwsze jest droższe o " +
                    (a1.calculatePriceGross() - a2.calculatePriceGross()));
        } else if(a1.calculatePriceGross() == a2.calculatePriceGross()){
            System.out.println("Auta są w tej samej cenie");
        } else {
            System.out.println("Auto drugie jest droższe o " +
                    (a2.calculatePriceGross() - a1.calculatePriceGross()));
        }
    }
    public static void main(String[] args) {
        Auto a1;
        // utworzenie obiektu Auto
        Auto a = new Auto("VW", "Passat", "1.9 TDI", "Diesel", 150000);
        System.out.println(a);
        // utworznie obiektu klasy dziedziczącej po Auto
        AdditionSets as = new AdditionSets("BMW","5", "2.5 TDI", "Diesel", 250000);
        as.assignEquipmentToAuto("Skóra", 5000.);
        as.assignEquipmentToAuto("Falgi '19", 4000.);
        System.out.println(as);

        a1 = new AdditionSets("BMW", "X1", "2.5TDI", "DIESEL", 200000);
        System.out.println(a1);
        System.out.println("Jakiego typu jest mój obiekt: " + a1.getClass().getName());

        compareAutoPrices(a1, a1);   // AdditionSets - AdditionSets
        compareAutoPrices(a1, a);    // AdditionSets - Auto
        compareAutoPrices(a, a);     // Auto - Auto

    }
}