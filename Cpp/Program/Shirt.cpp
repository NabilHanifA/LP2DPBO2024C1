#include <iostream>
#include <string>
#include "Clothing.cpp"

using namespace std;

class Shirt : public Clothing
{
    /*Attribute*/
    private:
        string color;
        string sleeve_type;

    /*Constuctor*/
    public:
        Shirt(){

        }

        Shirt(string idProduct, string name, string brand, string price, 
                string size, string material, string gender, string color, 
                string sleeve_type) : Clothing(idProduct, name, brand, price, size, material, gender){
            this->color = color;
            this->sleeve_type = sleeve_type;
        }

    /*Getter & Setter*/
    // Getters
    string getColor() {
        return this->color;
    }

    string getSleeveType() {
        return this->sleeve_type;
    }

    // Setter
    void setColor(string color) {
        this->color = color;
    }

    void setSleeveType(string sleeve_type) {
        this->sleeve_type = sleeve_type;
    }

    ~Shirt()
    {}
};
