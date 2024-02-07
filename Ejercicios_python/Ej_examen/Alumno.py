from Persona import Persona as Persona
class Alumno(Persona):
    evalucion=bool
    def __init__(self,nombre,apellidos,dni,direccion,evaluacion,):
        super().__init__(nombre,apellidos,dni,direccion)
        self.evalucion=evaluacion
    def mostarinfo(self):
        print(f'{super().mostrarinfo()} {self.evalucion}')