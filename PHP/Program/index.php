<?php
/*Saya Nabil Hanif Achmaddiredja mengerjakan Latihan Praktikum 2 dalam 
mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

require_once 'Shirt.php';
require_once 'Tabel.php';

// Create Shirt objects
$shirt1 = new Shirt("s001", "Kemeja Flanel", "Zalora", "29.99", "M", "Flanel", "Wanita", "Merah", "Lengan Panjang");
$shirt2  = new Shirt("s002", "Celana Pendek", "Gap", "19.99", "S", "Katun", "Pria", "Biru", "Reguler");
$shirt3  = new Shirt("s003", "Gaun Pesta", "Forever 21", "69.99", "L", "Satin", "Wanita", "Hitam", "Lengan Pendek");




// Create an array to store Shirt objects
$list = array($shirt1, $shirt2, $shirt3);

// Define column names
$columnNames = array("Id Product", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type");

// Create a table object
$tabel = new Tabel();

// Prepare data array
$data = array();
foreach ($list as $shirt) {
    $data[] = array(
        $shirt->getIdProduct(),
        $shirt->getName(),
        $shirt->getBrand(),
        $shirt->getPrice(),
        $shirt->getSize(),
        $shirt->getMaterial(),
        $shirt->getGender(),
        $shirt->getColor(),
        $shirt->getSleeveType()
    );
}

// Create the table
$tabel->buatTabel($data, $columnNames);

?>