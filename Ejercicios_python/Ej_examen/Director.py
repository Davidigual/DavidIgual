from Profesores import Profesores as Profesores
class Director(Profesores):
    def __init__(self,nombre,apellidos,dni,direccion,horario,complemento_economico,horas_semanales,annos_director):
        super().__init__(nombre,apellidos,dni,direccion,horario)
        self.complemento_economico=complemento_economico
        self.horas_semanales=horas_semanales
        self.annos_director=annos_director
    def mostrarinfo(self):
        print(f'{super().mostrarinfo()}{self.horas_semanales}{self.horario}{self.complemento_economico}')

