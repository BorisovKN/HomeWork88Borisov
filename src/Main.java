import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Car renault = new Car("Renault", 2017, 14700.5f, "silver");
        Car toyota = new Car("Toyota", 2003, 5565.9f, "blue");
        Car ford = new Car("Ford", 2010, 9999.9f, "black");
        Car alfaRomeo = new Car("Alfa Romeo", 2020, 32500f, "red");
        Car[] cars = {renault, toyota, ford, alfaRomeo};
        System.out.println("Отобразить все автомобил");
        Stream<Car> carStream1 = Stream.of(cars);
        carStream1.forEach(a -> System.out.println
                ("Name: " + a.getName() + " Year: " + a.getYear() + " Price: " + a.getPrice() + " Colour: " + a.getColour()));
        System.out.println("Отобразить автомобили указанного цвета");
        Stream<Car> carStream2 = Stream.of(cars);
        carStream2.filter
                        (c -> c.getColour() == "silver").
                forEach(c -> System.out.println
                        ("Name: " + c.getName() + " Year: " + c.getYear() + " Price: " + c.getPrice() + " Colour: " + c.getColour()));
        System.out.println("Отобразить автомобили дороже указанной цены");
        Stream<Car> carStream3 = Stream.of(cars);
        carStream3.filter(p -> p.getPrice() > 12000).
                forEach(p -> System.out.println
                        ("Name: " + p.getName() + " Year: " + p.getYear() + " Price: " + p.getPrice() + " Colour: " + p.getColour()));
        System.out.println("Отобразить автомобили, чей год выпуска находится в заданном диапазоне");
        Stream<Car> carStream4 = Stream.of(cars);
        carStream4.filter(y -> (y.getYear() > 2009) && (y.getYear() < 2019)).
                forEach(y -> System.out.println
                        ("Name: " + y.getName() + " Year: " + y.getYear() + " Price: " + y.getPrice() + " Colour: " + y.getColour()));
        System.out.println("Сортировать автомобили в порядке убывания стоимости");
        Stream<Car> carStream5 = Stream.of(cars);
        carStream5.sorted((p1, p2) -> p2.getPrice().compareTo(p1.getPrice())).
                forEach(p -> System.out.println
                        ("Name: " + p.getName() + " Year: " + p.getYear() + " Price: " + p.getPrice() + " Colour: " + p.getColour()));
    }
}