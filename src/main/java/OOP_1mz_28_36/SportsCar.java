package OOP_1mz_28_36;

public class SportsCar extends Car { //alt enter na czerwone podpowie co nie tak

    //napisz konstrukotr przyjmujacy wszystkie parametry car
    public SportsCar(String producer, String model, String color, Integer seatsNumber, Engine engine) {
        super(producer, model, color, seatsNumber,engine); //dalem extends rozsyzlem sportscar o klase car, utwoerzylem konsturktor zawierajcy wsyzstkie artyrbiyt charkatrketeysczne dla cara, za pomoca slowka super odowloalme sie do wszystkich ti podanycn atrybutrow, odwoluje sie do rodzica
    }
}
