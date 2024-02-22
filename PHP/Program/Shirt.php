<?php
require_once 'Clothing.php';

class Shirt extends Clothing {
    // Private Attributes
    private $color = "";
    private $sleeveType = "";
    
    // Constructor
    public function __construct($idProduct="", $name="", $brand="", $price="", $size="", $material="", $gender="", $color="", $sleeveType="") {
        parent::__construct($idProduct, $name, $brand, $price, $size, $material, $gender);
        $this->color = $color;
        $this->sleeveType = $sleeveType;
    }

    /*Getter & Setter*/
    // Getter
    public function getColor() {
        return $this->color;
    }

    public function getSleeveType() {
        return $this->sleeveType;
    }

    // Setter
    public function setColor($color) {
        $this->color = $color;
    }

    public function setSleeveType($sleeveType) {
        $this->sleeveType = $sleeveType;
    }
}

?>
