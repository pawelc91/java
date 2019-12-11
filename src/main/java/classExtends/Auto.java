package classExtends;

public class Auto extends Object {     // każda klasa dziedziczy metody stn z nadklasy Object
    private String brand, model, engineType, fuelType;
    private double price_net;

    // konstruktor
    public Auto(String brand, String model, String engineType, String fuelType, double price_net) {
        System.out.println("Jestem w konstruktorze Auto");
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.fuelType = fuelType;
        this.price_net = price_net;
    }
    public double calculatePriceGross(){
        return price_net * 1.23;
    }
    // toString
    @Override
    public String toString() {
        return String.format("| %10s | %10s | %10s | %10s | %10.2fPLN |", brand,model,engineType,fuelType,calculatePriceGross());
    }

}