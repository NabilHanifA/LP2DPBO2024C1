<?php

class Tabel {
    private $baris = 0;
    private $kolom = 0;
    
    // Constructor
    public function __construct($baris = 0, $kolom = 0) {
        $this->baris = $baris;
        $this->kolom = $kolom;
    }

    // Getter methods
    public function getBaris() {
        return $this->baris;
    }

    public function getKolom() {
        return $this->kolom;
    }

    // Setter methods
    public function setBaris($baris) {
        $this->baris = $baris;
    }

    public function setKolom($kolom) {
        $this->kolom = $kolom;
    }

    // Method to create the table
    public function buatTabel($data, $columnNames) {
        $baris = count($data);
        $kolom = count($data[0]);
    
        echo "<div style='text-align: center;'>"; 
        echo "<div style='margin-bottom: 10px; margin-top: 10px; font-size: 18px; font-weight: bold;'>Daftar Product</div>";
        echo "<table border='3' style='margin: 0 auto;'>"; 
    
        // Display column names row
        echo "<tr>";
        foreach ($columnNames as $columnName) {
            echo "<th style='padding-left: 10px; padding-right: 10px;'>$columnName</th>";
        }
        echo "</tr>";
    
        // Iterate over rows
        for ($i = 0; $i < $baris; $i++) {
            echo "<tr>";
    
            // Iterate over columns
            for ($j = 0; $j < $kolom; $j++) {
                echo "<td style='padding-left: 10px; padding-right: 10px;'>";
                echo $data[$i][$j];
                echo "</td>";
            }
            echo "</tr>";
        }
    
        echo "</table>";
    
        echo "</div>"; 
    }
}
?>
