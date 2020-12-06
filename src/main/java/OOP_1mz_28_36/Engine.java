package OOP_1mz_28_36;

import lombok.Getter;
import lombok.Setter;

//ex28
public class Engine {
    private Double capacity;
    @Getter//@Getter
    @Setter
    private Integer horsePower;
    @Getter
    @Setter
    private Double fuelConsumption;
//ex29
    public Engine(Double capacity, Integer horsePower, Double fuelConsumption) {
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
    }

    //ex30i31 mozna normalnie gettery i settery aa mozna lobmokeiem peirwsze normlane i zrobimy pozniej  nastepne lombokiem
    public void setCapacity (Double capacity) {
        this.capacity = capacity;
    }
    //reczy setter powyzej ponizej getter
    public Double getCapacity() {
        return this.capacity;
    }
    //ex32
    
}


