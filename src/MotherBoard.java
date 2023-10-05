import java.util.SplittableRandom;

public class MotherBoard {
    public String base;

    public String model;
    public String price;

    public String getFullName(){
        return base + " " + model + " " + price;
    }

    public String getBase() {

        return base;
    }


    public void setBase(String base) {
        this.base = base;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
