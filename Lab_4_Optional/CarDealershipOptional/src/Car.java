import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car {

    private String model;
    private String brand;
    private double price;
    private int year;
    private String color;
    private int quantity;

    public int delivery(){
        quantity++;
        return quantity;
    }

    public int sell(){
        if (quantity > 0) {
            quantity--;
        } else {
            System.out.println("No stock available for " + brand + " " + model);
        }
        return quantity;
    }

}
