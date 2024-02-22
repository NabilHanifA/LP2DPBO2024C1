<?php

class Product {
    // Private Attributes
    private $idProduct = "";
    private $name = "";
    private $brand = "";
    private $price = "";
    
    // Constructor
    public function __construct($idProduct="", $name="", $brand="", $price="") {
        $this->idProduct = $idProduct;
        $this->name = $name;
        $this->brand = $brand;
        $this->price = $price;
    }
    
    /*Getter & Setter*/
    // Getter 
    public function getIdProduct() {
        return $this->idProduct;
    }

    public function getName() {
        return $this->name;
    }

    public function getBrand() {
        return $this->brand;
    }

    public function getPrice() {
        return $this->price;
    }

    // Setter 
    public function setIdProduct($idProduct) {
        $this->idProduct = $idProduct;
    }

    public function setName($name) {
        $this->name = $name;
    }

    public function setBrand($brand) {
        $this->brand = $brand;
    }

    public function setPrice($price) {
        $this->price = $price;
    }
}

?>
