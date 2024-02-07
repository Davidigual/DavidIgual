from Profesores import Profesores as Profesores
class Jefeestudios(Profesores):
    localizable=bool
    def __init__(self,nombre,apellidos,dni,direccion,horario,complemento_economico,localizable):
        super().__init__(nombre,apellidos,dni,direccion,horario)
        self.localizable=localizable
        self.complemento_economico=complemento_economico
    def mostarinfo(self):
        print(f'{super().mostrarinfo()}{self.localizable}{self.complemento_economico}')