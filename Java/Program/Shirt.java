/*Saya Nabil Hanif Achmaddiredja mengerjakan Latihan Praktikum 2 dalam 
mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

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
        setIdProduct(idProduct);
        setName(name);
        setBrand(brand);
        setPrice(price);
        setSize(size);
        setMaterial(material);
        setGender(gender);
        this.color = color;
        this.sleeve_type = sleeve_type;
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
