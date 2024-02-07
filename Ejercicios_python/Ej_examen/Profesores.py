from Persona import Persona as Persona
class Profesores(Persona):
    def __init__(self,nombre,apellidos,dni,direccion,horario):
        super().__init__(nombre,apellidos,dni,direccion)
        self.lista_asignaturas=[]
        self.horario=horario
    def mostrarinfo(self):
        print(f'{super().mostrarinfo()}{self.lista_asignaturas}{self.horario}')
