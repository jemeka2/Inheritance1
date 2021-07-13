import java.text.NumberFormat;

public class Product {
    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {

        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + (this.getFormattedPrice()).format(price) + "\n";
    }

    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }

    public void setDesc(String description){
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    private NumberFormat getFormattedPrice() {
        // Use the NumberFormat class to format the price to 2 decimal places
        NumberFormat getFormattedPrice = NumberFormat.getCurrencyInstance();
        return getFormattedPrice;
    }

    // Create public access for the count variable
    public static int getCount() {
        count++;
        return count;
    }
}
