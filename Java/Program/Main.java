/*Saya Nabil Hanif Achmaddiredja mengerjakan Latihan Praktikum 2 dalam 
mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, choice = 0, n = 0;
        String idProduct, name, brand, price, size, material, gender, color, sleeve_type;

        ArrayList<Shirt> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Pilih Opsi");
            System.out.println("1. Add");
            System.out.println("2. Done");
            try{
                choice = sc.nextInt();
            }
            catch(Exception e){
                System.out.println("The input is not an integer!");
            }
            
            if (choice == 1) {
                System.out.print("Jumlah List Product: ");
                n = sc.nextInt();
                for (i = 0; i < n; i++) {
                    System.out.println("List Product " + (i + 1) + ":");
                    System.out.print("Id Product  : ");
                    idProduct = sc.next();
                    System.out.print("Nama        : ");
                    name = sc.next();
                    System.out.print("Brand       : ");
                    brand = sc.next();
                    System.out.print("Price       : ");
                    price = sc.next();
                    System.out.print("Size        : ");
                    size = sc.next();
                    System.out.print("Material    : ");
                    material = sc.next();
                    System.out.print("Gender      : ");
                    gender = sc.next();
                    System.out.print("Color       : ");
                    color = sc.next();
                    System.out.print("Sleeve Type : ");
                    sleeve_type = sc.next();

                    Shirt temp = new Shirt(idProduct, name, brand, price, size, material, gender, color, sleeve_type);
                    list.add(temp);
                }
                System.out.println("Data Berhasil Ditambah!");
            }
            
            else if (choice == 2) {
                if (list.isEmpty()) {
                    System.out.println("List Kosong");
                } else {
                    String[][] data = new String[list.size()][9];
                    for (i = 0; i < list.size(); i++) {
                        Shirt shirt = list.get(i);
                        data[i] = new String[]{
                            shirt.getIdProduct(), shirt.getName(), shirt.getBrand(), shirt.getPrice(),
                            shirt.getSize(), shirt.getMaterial(), shirt.getGender(), shirt.getColor(), shirt.getSleeve_type()
                        };
                    }

                   // Define column names
                   String columnNames[] = {"Id Product", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type"};

                   // Create a table object
                   Tabel tabel = new Tabel();

                   tabel.buatTabel(data, columnNames);
                }
            }
        } while ( choice != 2);

        sc.close();
    }
}
