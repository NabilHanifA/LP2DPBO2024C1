public class Tabel {
    private int baris;
    private int kolom;

    Tabel(){
    }

    Tabel(int baris, int kolom){
        this.baris = baris;
        this.kolom = kolom;
    }

    public void setBaris(int baris) {
        this.baris = baris;
    }

    public void setKolom(int kolom) {
        this.kolom = kolom;
    }

    public int getBaris() {
        return baris;
    }

    public int getKolom() {
        return kolom;
    }

    public void buatTabel(String[][] data, String[] columnNames) {
        int baris = data.length;
        int kolom = data[0].length;
    
        // Calculate the maximum width for each column
        int[] maxWidths = new int[kolom];
        for (int j = 0; j < kolom; j++) {
            for (int i = 0; i < baris; i++) {
                maxWidths[j] = Math.max(maxWidths[j], data[i][j].length());
            }
            // Adjust maximum width based on column names
            maxWidths[j] = Math.max(maxWidths[j], columnNames[j].length());
        }
    
        // Print the separator line above the table
        printSeparator(maxWidths);
    
        // Print the title row
        for (int j = 0; j < kolom; j++) {
            System.out.print("| " + columnNames[j]);
            for (int i = 0; i < maxWidths[j] - columnNames[j].length(); i++) {
                System.out.print(" ");
            }
            System.out.print(" ");
        }
        System.out.println("|");
    
        // Print the separator line below the title row
        printSeparator(maxWidths);
    
        // Print the table data
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("| " + data[i][j]);
                for (int k = 0; k < maxWidths[j] - data[i][j].length(); k++) {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println("|");
    
            // Print the separator line between rows
            printSeparator(maxWidths);
        }
    }
    
    // Helper method to print the separator line
    private void printSeparator(int[] maxWidths) {
        for (int maxWidth : maxWidths) {
            for (int i = 0; i < maxWidth + 3; i++) {
                System.out.print("-");
            }
        }
        System.out.print("-");
        System.out.println();
    }
    
}

