'''
Saya Nabil Hanif Achmaddiredja mengerjakan Latihan Praktikum 2 dalam 
mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
'''

from Product import Product

class Clothing(Product):
    # Private Attributes
    __size = ""
    __material = ""
    __gender = ""
    
    # Constructor
    def __init__(self, idProduct="", name="", brand="", price="", size="", material="", gender=""):
        super().__init__(idProduct, name, brand, price)
        self.__size = size
        self.__material = material
        self.__gender = gender

    # Getter and Setter
    # Getter 
    def getSize(self):
        return self.__size

    def getMaterial(self):
        return self.__material

    def getGender(self):
        return self.__gender

    # Setter 
    def setSize(self, size):
        self.__size = size

    def setMaterial(self, material):
        self.__material = material

    def setGender(self, gender):
        self.__gender = gender
