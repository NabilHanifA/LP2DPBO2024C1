#include <iostream>
#include <string>
#include <bits/stdc++.h>

using namespace std;

class Tabel
{
    private:
        int baris;
        int kolom;

    public:
        Tabel()
        {

        }

        Tabel(int baris, int kolom)
        {
            this->baris = baris;
            this->kolom = kolom;
        }

    /*Getter & Setter*/
    // Getter
    int getBaris()
    {
        return baris;
    }
    
    int getKolom()
    {
        return kolom;
    }

    // Setter
    void setBaris(int baris){
        this->baris = baris;
    }

    void setKolom(int kolom){
        this->kolom = kolom;
    }

    void buatTabel(vector<vector<string>>& data, vector<string>& columnNames) {
        int baris = data.size();
        int kolom = data[0].size();

        // Calculate the maximum width for each column
        vector<int> maxWidths(kolom);
        for (int j = 0; j < kolom; j++) {
            for (int i = 0; i < baris; i++) {
                maxWidths[j] = max(maxWidths[j], static_cast<int>(data[i][j].length()));
            }
            // Adjust maximum width based on column names
            maxWidths[j] = max(maxWidths[j], static_cast<int>(columnNames[j].length()));
        }

        // Print the separator line above the table
        printSeparator(maxWidths);

        // Print the title row
        for (int j = 0; j < kolom; j++) {
            cout << "| " << columnNames[j];
            for (int i = 0; i < maxWidths[j] - columnNames[j].length(); i++) {
                cout << " ";
            }
            cout << " ";
        }
        cout << "|" << endl;

        // Print the separator line below the title row
        printSeparator(maxWidths);

        // Print the table data
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                cout << "| " << data[i][j];
                for (int k = 0; k < maxWidths[j] - data[i][j].length(); k++) {
                    cout << " ";
                }
                cout << " ";
            }
            cout << "|" << endl;

            // Print the separator line between rows
            printSeparator(maxWidths);
        }
    }

    // Helper method to print the separator line
    void printSeparator(vector<int>& maxWidths) {
        for (int maxWidth : maxWidths) {
            for (int i = 0; i < maxWidth + 3; i++) {
                cout << "-";
            }
        }
        cout << "-" << endl;
    }

    ~Tabel()
    {};
};

