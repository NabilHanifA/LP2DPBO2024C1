<?php
/* Saya Nabil Hanif Achmaddiredja mengerjakan Latihan Praktikum 2 dalam 
mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */
require_once 'Product.php';

class Clothing extends Product {
    // Private Attributes
    private $size = "";
    private $material = "";
    private $gender = "";
    
    // Constructor
    public function __construct($idProduct="", $name="", $brand="", $price="", $size="", $material="", $gender="") {
        parent::__construct($idProduct, $name, $brand, $price);
        $this->size = $size;
        $this->material = $material;
        $this->gender = $gender;
    }

    /*Getter & Setter*/
    // Getter
    public function getSize() {
        return $this->size;
    }

    public function getMaterial() {
        return $this->material;
    }

    public function getGender() {
        return $this->gender;
    }

    // Setter
    public function setSize($size) {
        $this->size = $size;
    }

    public function setMaterial($material) {
        $this->material = $material;
    }

    public function setGender($gender) {
        $this->gender = $gender;
    }
}

?>
