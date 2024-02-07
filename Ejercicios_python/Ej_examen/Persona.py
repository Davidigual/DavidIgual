class Persona:

    def __init__(self,nombre,apellidos,dni,direccion):
        self.nombre=nombre
        self.apellidos=apellidos
        self.dni=dni
        self.direccion=direccion
    def mostrarinfo(self):
        return f'{self.nombre} {self.apellidos} {self.dni} {self.direccion}'