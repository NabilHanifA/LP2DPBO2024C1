#include <bits/stdc++.h>
#include "Shirt.cpp"
#include "Tabel.cpp"

using namespace std;

int main() {
    int i, choice = 0, n = 0;
    string idProduct, name, brand, price, size, material, gender, color, sleeve_type;

    vector<Shirt> list;
    do {
        cout << "Pilih Opsi" << endl;
        cout << "1. Add" << endl;
        cout << "2. Done" << endl;
        try {
            cin >> choice;
        }
        catch (exception& e) {
            cout << "The input is not an integer!" << endl;
        }

        if (choice == 1) {
            cout << "Jumlah List Product: ";
            cin >> n;
            for (i = 0; i < n; i++) {
                cout << "List Product " << (i + 1) << ":" << endl;
                cout << "Id Product  : ";
                cin >> idProduct;
                cout << "Nama        : ";
                cin >> name;
                cout << "Brand       : ";
                cin >> brand;
                cout << "Price       : ";
                cin >> price;
                cout << "Size        : ";
                cin >> size;
                cout << "Material    : ";
                cin >> material;
                cout << "Gender      : ";
                cin >> gender;
                cout << "Color       : ";
                cin >> color;
                cout << "Sleeve Type : ";
                cin >> sleeve_type;

                Shirt temp(idProduct, name, brand, price, size, material, gender, color, sleeve_type);
                list.push_back(temp);
            }
            cout << "Data Berhasil Ditambah!" << endl;
        }
        else if (choice == 2) {
            if (list.empty()) {
                cout << "List Kosong" << endl;
            }
            else {
                vector<vector<string>> data(list.size(), vector<string>(9));
                for (i = 0; i < list.size(); i++) {
                    Shirt shirt = list[i];
                    data[i] = {
                        shirt.getIdProduct(), shirt.getName(), shirt.getBrand(), shirt.getPrice(),
                        shirt.getSize(), shirt.getMaterial(), shirt.getGender(), shirt.getColor(), shirt.getSleeveType()
                    };
                }

                // Define column names
                vector<string> columnNames = {"Id Product", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type"};

                // Create a table object
                Tabel tabel;
                tabel.buatTabel(data, columnNames);
            }
        }
    } while (choice != 2);

    return 0;
}