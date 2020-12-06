package OOP_1mz_28_36;

public class Main {

    public static void main(String[] args) {
        //tworzymy boiekt sportscar
        Engine engine = new Engine(12.02d, 350, 16.22); //tworze obiekt typu silnik
        SportsCar sportsCar = new SportsCar("Opel", "Corsa", "red", 2, engine);//sportscar az seatsNumbe wlacznie, dodajemy engine powyzej i wtedy engine tu

        System.out.println(sportsCar.loudBrumBrumBrum()); //dodajemy na koncu zad 33
//zad34
        SportsCar sportsCar2 = new SportsCar("Ford", "Focus", "grey", engine);//towrzymy obiekt kotry ma 2 zad domyslnie
        System.out.println(sportsCar2.toString());
    }
}
