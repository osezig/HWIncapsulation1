import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Human max = new Human(1988, "Максим", "Минск", "бренд-менеджером");
        Human ann = new Human(1993, "Аня", "Москва", "методистом образовательных программ");
        Human kate = new Human(1992, "Катя", "Калининград", "продакт-менеджером");
        Human artem = new Human(1995, "Артем", "Москва", "директором по развитию бизнеса");

        Car lada = new Car("Lada ", " Granta ", 1.7, " Желтый ", 2015, " Россия",
                "Механическая", "Седан","ю123юю123",5,0);
        Car audi = new Car("Audi ", " A8 ", 3.0, " Черный ", 2020, " Германия",
                "Автоматическая", "Купе","а3а88кр123",2,3);
        Car bmw = new Car("BMW ", " Z8 ", 3.0, " Черный ", 2021, " Германия",
                "Автоматическая", "Купе","щ123456",2,1);
        Car kia = new Car("KIA ", " Sportage ", 2.4, " Красный ", 2018, " Южная Корея",
                "Автоматическая", "Кроссовер","в123вв123",5,0);
        Car hyundai  = new Car("Hyundai ", " Avante ", 1.6, " Оранжевый ", 2016, " Южная Корея",
                "Механическая", "Седан","ш123шш123",5,1);


        System.out.println("Домашнее задание 1");
        System.out.println("Задание 1");
        max.printOut();
        ann.printOut();
        kate.printOut();
        artem.printOut();
        Human vova = new Human(LocalDate.now().getYear()-21,"Владимир", "Казань", "null");
        vova.printOut();

        System.out.println("Задание 2");
        Flower rozaObyknovennaya = new Flower("Роза обыкновенная","null", "Голландия", 35.59, 0);
        Flower hrizantema = new Flower("Хризантема","null", "null", 15.0, 5);
        Flower pion = new Flower("Пион","null", "Англия", 69.9, 1);
        Flower gipsofila = new Flower("Гипсофила","", "Турция", 19.5, 10);

        System.out.printf(rozaObyknovennaya +"\n" + hrizantema + "\n" + pion + "\n" + gipsofila );


        System.out.println("Домашнее задание 2");
        System.out.println("Задание 1");
        System.out.println(audi);


        System.out.println("Домашнее задание 3");
        System.out.println("Задание 2");
        Car.Insurance audiIns = audi.new Insurance(2021, 330000, 331854894);
        Car.Insurance ladaIns = lada.new Insurance(2022, 20000, 44536872);
        Car.Insurance bmwIns = bmw.new Insurance(2021, 50000, 2317548);
        Car.Insurance kiaIns = kia.new Insurance(2020, 8000, 931954);
        Car.Insurance hyundaiIns = hyundai.new Insurance(2021, 40000, 999999999);
        audi.setInsurance(audiIns);
        lada.setInsurance(ladaIns);
        bmw.setInsurance(bmwIns);
        kia.setInsurance(kiaIns);
        hyundai.setInsurance(hyundaiIns);
        audi.checkValidityInsurance();
        lada.checkValidityInsurance();
        bmw.checkValidityInsurance();
        kia.checkValidityInsurance();
        hyundai.checkValidityInsurance();
        audi.checkNumInsurance();
        lada.checkNumInsurance();
        bmw.checkNumInsurance();
        kia.checkNumInsurance();
        hyundai.checkNumInsurance();

    }
}

