package OOP_1mz_28_36;

import lombok.Getter;
import lombok.Setter;

public abstract class Car {
    @Getter
    @Setter
    private String producer, model, color;
    @Getter
    @Setter
    private Integer seatsNumber;
    private Engine engine; //kompozycja; Engine wlasny typ stowrzylsimsy tworze kompozycje

    //getter i setter do Engine
    //setter
    public void setEngine(Engine engine1) { //przjmuje typ naszego silnika Enginge jest typem
        this.engine = engine1; //zaczalem tworzyc setter dostepny zwszad, uzywamy typu engine obiekt nazywa sie engine1, taka konrketna wartosc engine to ejst enginge1, jako atrybout tego obiektu bedzie engine taki ktory ma takie same warotisc jak engine1, egning1 mozemy sobie w przyszlsoci stworzyc w mainie
    }

    public Engine getEngine() { //zwracam swoj obiek Engiine
        return this.engine;
        //ja stworzylem klase Engine. uzywam jako atrubutu w klasie absatarycjenj car mojej klasy Engine.
        // ja pisze metode w ktorej jestem gotowy przyjac przygotrowany wczesniej obiekt
    }
    //tworze konsturkotr ze wszystkimi arugmentami

    public Car (String producer, String model, String ) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.seatsNumber = seatsNumber;
        this.engine = engine;
    }
}

