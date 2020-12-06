package OOP_1mz_28_36;

public class Main {

    public static void main(String[] args) {
        //tworzymy boiekt sportscar
        Engine engine = new Engine(12.02d, 350, 16.22); //tworze obiekt typu silnik
        SportsCar sportsCar = new SportsCar("Opel", "Corsa", "red", 2, engine);//sportscar az seatsNumbe wlacznie, dodajemy engine powyzej i wtedy engine tu
    }
}
