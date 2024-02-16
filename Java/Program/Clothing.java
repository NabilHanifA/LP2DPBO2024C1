public class Clothing extends Product{
    /*Attribute */
    private String size;
    private String material;
    private String gender;

    /*Constructor */
    public Clothing(){
        this.size = "";
        this.material = "";
        this.gender = "";
    }

    public Clothing(String idProduct, String name, String brand, String price, String size, String material, String gender) {
        setIdProduct(idProduct);
        setName(name);
        setBrand(brand);
        setPrice(price);
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    /*Getter & Setter */
    // Getter
    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public String getGender() {
        return gender;
    }

    // Setter
    public void setSize(String size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
