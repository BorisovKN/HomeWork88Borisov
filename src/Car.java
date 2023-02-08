public class Car {
    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public Float getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    String name;
    Integer year;
    Float price;
    String colour;
    public Car(String name, Integer year, Float price, String colour){
        this.name=name;
        this.year=year;
        this.price=price;
        this.colour=colour;
    }


}
