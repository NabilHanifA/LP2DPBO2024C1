/*Saya Nabil Hanif Achmaddiredja mengerjakan Latihan Praktikum 2 dalam 
mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

#include <iostream>
#include <string>

using namespace std;

class Product
{
    /*Attribute*/
    private:
        string idProduct;
        string name;
        string brand;
        string price;

    /*Constuctor*/
    public:
        Product()
        {

        }

        Product(string idProduct, string name, string brand, string price) {
        this->idProduct = idProduct;
        this->name = name;
        this->brand = brand;
        this->price = price;
    }


    /*Getter and Setter*/
    //Getter
    string getIdProduct(){
        return this->idProduct;
    }
    string getName(){
        return this->name;
    }
    string getBrand(){
        return this->brand;
    }
    string getPrice(){
        return this->price;
    }

    //Setter
    void setidProduct(string idProduct){
        this->idProduct = idProduct;
    }
    void setName(string name){
        this->name = name;
    }
    void setBrand(string brand){
        this->brand = brand;
    }
    void setPrice(string price){
        this->price = price;
    }

    ~Product()
    {}
};