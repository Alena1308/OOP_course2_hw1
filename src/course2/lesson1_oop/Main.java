package course2.lesson1_oop;

public class Main {
    public static void main(String[] args) {
        runHomeWork1Human();
        runHomework1Car();
        runHomeWork2Human();
        runHomework2Car();
    }
    public static void runHomeWork1Human() {
        System.out.println("Домашнее задание 1/3");
        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.yearOfBirth = 1988;
        maksim.town = "Минск";
        maksim.jobTitle = "Бренд-менеджер";
        Human anya = new Human();
        anya.name = "Аня";
        anya.yearOfBirth = 1993;
        anya.town = "Москва";
        anya.jobTitle = "Методист образоватльных программ";
        Human katya = new Human();
        katya.name = "Катя";
        katya.yearOfBirth = 1992;
        katya.town = "Калининград";
        katya.jobTitle = "Продакт-менеджер";
        Human artem = new Human();
        artem.name = "Артем";
        artem.yearOfBirth = 1995;
        artem.town = "Москва";
        artem.jobTitle = "Директор по развитию бизнеса";
        System.out.println(maksim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
    }
    public static void runHomework1Car() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Granta";
        lada.engineVolume = 1.7;
        lada.color = "желтый";
        lada.year = 2015;
        lada.country = "Россия";
        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.engineVolume = 3.0;
        audi.color = "черный";
        audi.year = 2020;
        audi.country = "Германия";
        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.engineVolume = 3.0;
        bmw.color = "черный";
        bmw.year = 2021;
        bmw.country = "Германия";
        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.engineVolume = 2.4;
        kia.color = "красный";
        kia.year = 2018;
        kia.country = "Южная КореяЮжная Корея";
        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolume = 1.6;
        hyundai.color = "оранжевый";
        hyundai.year = 2016;
        hyundai.country = "Южная КореяЮжная Корея";
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }

    public static void runHomeWork2Human() {
        System.out.println("========================================================================");
        System.out.println("Домашнее задание 2/3");
        Human maksim = new Human("Максим", 1988, "Минск",
                "Бренд-менеджер");
        Human anya = new Human("Аня", 1993, "Москва",
                "Методист образоватльных программ");
        Human katya = new Human("Катя", 1992, "Калининград",
                "Продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва",
                "Директор по развитию бизнеса");
        System.out.println(maksim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
    }
    public static void runHomework2Car() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015,
                "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный",
                2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021,
                "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный",
                2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый",
                2016, "Южная Корея");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}
