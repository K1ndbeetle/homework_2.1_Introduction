public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == "" || brand == null || brand == "null") {
            this.brand = "default";
        } else this.brand = brand;
        if (model == "" || model == null || model == "null") {
            this.model = "default";
        } else this.model = model;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;
        if (color == "" || color == null || color == "null") {
            this.color = "белый";
        } else this.color = color;
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else this.productionYear = productionYear;
        if (productionCountry == "" || productionCountry == null || productionCountry == "null") {
            this.productionCountry = "default";
        } else this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return "Автомобиль : " +
                "Марка " + brand + ", модель " + model + ", объём двигателя - " + engineVolume + " л.с." +
                ", цвет " + color + ", год выпуска " + productionYear + ", страна производства " + productionCountry + ".";
    }
}