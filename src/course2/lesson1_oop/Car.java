package course2.lesson1_oop;

public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int year;
    public String country;
    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (color == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }
    Car() {
        brand = "default";
        model = "default";
        engineVolume = 1.5;
        color = "белый";
        year = 2000;
        country = "default";
    };
    @Override
    public String toString(){
        return "Бренд - " + brand + ". Модель - " + model + ". Объем двигателя - " + engineVolume +
        ". Цвет - " + color + ". Год выпуска - " + year + ". Сборка - " + country + ".";
    }
}
