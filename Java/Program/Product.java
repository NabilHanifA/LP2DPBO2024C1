/*Saya Nabil Hanif Achmaddiredja mengerjakan Latihan Praktikum 2 dalam 
mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

public class Product {
    
    /*Attribute */
    private String idProduct;
    private String name;
    private String brand;
    private String price;

    /*Constructor */
    public Product(){
        this.idProduct="";
        this.name="";
        this.brand="";
        this.price="";
    }

    public Product(String idProduct, String name, String brand, String price) {
        this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    /*Getter & Setter */
    // Setter
    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    // Getter
    public String getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getPrice() {
        return price;
    }
}
