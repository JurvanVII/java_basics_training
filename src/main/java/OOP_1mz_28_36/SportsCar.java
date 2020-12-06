package OOP_1mz_28_36;

public class SportsCar extends Car implements LoudCar { //alt enter na czerwone podpowie co nie tak ; impl Loud dopiero w 34 zadaniu

    //ex34
    public SportsCar (String producer, String model, String color, Engine engine)  {
        super(producer, model, color, 2, engine); //seats number na sztywno podany
    }

    //napisz konstrukotr przyjmujacy wszystkie parametry car
    //ex 35 i 36 odrazu to jest ot tez mimo ze zrobione wczesniej
    public SportsCar(String producer, String model, String color, Integer seatsNumber, Engine engine) {
        super(producer, model, color, seatsNumber,engine); //dalem extends rozsyzlem sportscar o klase car, utwoerzylem konsturktor zawierajcy wsyzstkie artyrbiyt charkatrketeysczne dla cara, za pomoca slowka super odowloalme sie do wszystkich ti podanycn atrybutrow, odwoluje sie do rodzica
    }
    //zad 34 dopiero od po utworzeniud LoudCar
    @Override //override tej motyd z LoudCar
    public String loudBrumBrumBrum() { //implementacja metody interfejsu
        return "BBBBBRRRRRRRRUUUUNMMMMMM!";
    }

    //wygenurjmy stirnga


    @Override
    public String toString() {
        return "SportsCar" + super.toString(); // zojca metode super.toString(); ctrl i toString() przeniesie do rodzica
    }
}
