class Product:
    # Private Attributes
    __idProduct = ""
    __name = ""
    __brand = ""
    __price = ""
    
    # Constructor
    def __init__(self, idProduct="", name="", brand="", price=""):
        self.__idProduct = idProduct
        self.__name = name
        self.__brand = brand
        self.__price = price

    # Getter and Setter
    # Getter 
    def getIdProduct(self):
        return self.__idProduct

    def getName(self):
        return self.__name

    def getBrand(self):
        return self.__brand

    def getPrice(self):
        return self.__price

    # Setter 
    def setIdProduct(self, idProduct):
        self.__idProduct = idProduct

    def setName(self, name):
        self.__name = name

    def setBrand(self, brand):
        self.__brand = brand

    def setPrice(self, price):
        self.__price = price
