from Clothing import Clothing

class Shirt(Clothing):
    
    # Private Attributes
    __color = ""
    __sleeveType = ""
    
    # Constructor
    def __init__(self, idProduct="", name="", brand="", price="", size="", material="", gender="", color="", sleeveType=""):
        super().__init__(idProduct, name, brand, price, size, material, gender)
        self.__color = color
        self.__sleeveType = sleeveType

    # Getter and Setter
    # Getter 
    def getColor(self):
        return self.__color

    def getSleeveType(self):
        return self.__sleeveType

    # Setter 
    def setColor(self, color):
        self.__color = color

    def setSleeveType(self, sleeveType):
        self.__sleeveType = sleeveType
