public class Shirt extends Clothing{
    
    /*Attribute */
    private String color;
    private String sleeve_type;

    /*Constructor */
    public Shirt(){
        this.color = "";
        this.sleeve_type = "";
    }

    public Shirt(String idProduct, String name, String brand, String price, String size, String material, String gender, String color, String sleeve_type) {
        super(idProduct, name, brand, price, size, material, gender); // Call the constructor of the superclass (Clothing)
        setColor(color);
        setSleeve_type(sleeve_type);
    }

    /*Getter & Setter */
    // Getter
    public String getColor() {
        return color;
    }

    public String getSleeve_type() {
        return sleeve_type;
    }

    // Setter
    public void setColor(String color) {
        this.color = color;
    }

    public void setSleeve_type(String sleeve_type) {
        this.sleeve_type = sleeve_type;
    }
}
