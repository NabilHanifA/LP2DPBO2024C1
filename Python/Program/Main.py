from Shirt import Shirt
from Tabel import Tabel

choice = 0
n = 0
list = []

while choice != 2:
    print("Pilih Opsi")
    print("1. Add")
    print("2. Done")
    try:
        choice = int(input())
    except ValueError:
        print("The input is not an integer!")

    if choice == 1:
        print("Jumlah List Product: ", end='')
        try:
            n = int(input())
        except ValueError:
            print("The input is not an integer!")
        for i in range(n):
            print("List Product ", (i + 1), ":")
            idProduct = input("Id Product  : ")
            name = input("Nama        : ")
            brand = input("Brand       : ")
            price = input("Price       : ")
            size = input("Size        : ")
            material = input("Material    : ")
            gender = input("Gender      : ")
            color = input("Color       : ")
            sleeve_type = input("Sleeve Type : ")

            temp = Shirt(idProduct, name, brand, price, size, material, gender, color, sleeve_type)
            list.append(temp)
        print("Data Berhasil Ditambah!")
    elif choice == 2:
        if not list:
            print("List Kosong")
        else:
            data = [[shirt.getIdProduct(), shirt.getName(), shirt.getBrand(), shirt.getPrice(),
                        shirt.getSize(), shirt.getMaterial(), shirt.getGender(), shirt.getColor(), shirt.getSleeveType()]
                    for shirt in list]

            # Define column names
            columnNames = ["Id Product", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type"]

            # Create a table object
            tabel = Tabel()
            tabel.buatTabel(data, columnNames)