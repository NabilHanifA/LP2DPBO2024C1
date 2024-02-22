#include <iostream>
#include <string>
#include "Product.cpp"

using namespace std;

class Clothing : public Product
{
    /*Attribute*/
    private:
        string size;
        string material;
        string gender;

    /*Constuctor*/
    public:
        Clothing()
        {

        }

        Clothing(string idProduct, string name, string brand, string price, string size, string material, string gender) : Product(idProduct, name, brand, price){
            this->size = size;
            this->material = material;
            this->gender = gender;
        }

    /*Getter & Setter*/
    // Getters
    string getSize(){
        return this->size;
    }

    string getMaterial(){
        return this->material;
    }

    string getGender(){
        return this->gender;
    }

    // Setters
    void setSize(string size) {
        this->size = size;
    }

    void setMaterial(string material) {
        this->material = material;
    }

    void setGender(string gender) {
        this->gender = gender;
    }

    ~Clothing()
    {}
};



