public class Main {
    public static void main(String[] args) {
        Car carLada = new Car("Lada", "", 1.7, "", 2015, "Россия");
        Car carAudi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 0, "Германия");
        Car carBmw = new Car(null, "Z8", 3.0, "черный", 2021, "Германия");
        Car carKia = new Car("null", "Sportage 4-го поколения", 2.4, "красный", 2018, "");
        Car carHyundai = new Car("Hyundai", "Avante", 0, "оранжевый", 2016, "Южная Корея");

        System.out.println(carLada + "\n" + carAudi + "\n" +  carBmw  + "\n" +  carKia  + "\n" +  carHyundai);
    }
}
