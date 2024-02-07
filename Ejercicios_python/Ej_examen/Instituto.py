from Persona import Persona as Persona
from Alumno import Alumno as Alumno
from Profesores import Profesores as Profesores
from Director import Director as Director
from Jefeestudios import Jefeestudios as Jefeestudios
class Instituto:
    def __init__(self,direccion,telefono,director,jefe_de_estudios):
        self.direccion=direccion
        self.telefono=telefono
        self.director=director
        self.jefe_de_estudios=jefe_de_estudios
        self.lista_alumnos_Dam1=[]
        self.lista_alumnos_Dam2=[]
        self.lista_alumnos_Smr1=[]
        self.lista_alumnos_Smr2=[]

    def matricular_alumno(self,alumno):
        opcion = '0'
        while not (opcion == '5'):
            print(' 1. añadir a DAM1')
            print(' 2. añadir a DAM2')
            print(' 3. añadir a SMR1')
            print(' 4. añadir a SMR2')
            print(' 5. Salir')
            opcion = input('  --- ¿Dime que quieres opcion?: ')
        if opcion==1:
            self.lista_alumnos_Dam1.append(alumno)
        if opcion ==2:
            self.lista_alumnos_Dam2.append(alumno)
        if opcion ==3:
            self.lista_alumnos_Smr1.append(alumno)
        if opcion ==4:
            self.lista_alumnos_Smr2.append(alumno)
    def buscaralumno(self,alumno):
        if alumno.nombre in self.lista_alumnos_Smr2:
            print(f"El alumno esta matriculado en {self.lista_alumnos_Smr2}")
        else:
            print("El alumno no esta matriculado en esta clase")
        if alumno.nombre in self.lista_alumnos_Smr1:
            print(f'El alumno esta matriculado en {self.lista_alumnos_Smr1}')
        else:
            print("El alumno no esta matriculado en esta clase")
        if alumno.nombre in self.lista_alumnos_Dam1:
            print(f'El alumno esta matriculado en {self.lista_alumnos_Dam1}')
        else:
            print("El alumno no esta matriculado en esta clase")
        if alumno.nombre in self.lista_alumnos_Dam2:
            print(f'El alumno esta matriculado en {self.lista_alumnos_Dam2}')
        else:
            print("El alumno no esta matriculado en esta clase")
    def dar_baja_alumno(self,alumno):
        if alumno.nombre in self.lista_alumnos_Smr1:
            self.lista_alumnos_Smr1.remove(alumno)
            print(f"El alumno : {alumno.nombre} se ha dado de baja")
        if alumno.nombre in self.lista_alumnos_Smr2:
            self.lista_alumnos_Smr2.remove(alumno)
            print(f"El alumno : {alumno.nombre} se ha dado de baja")
        if alumno.nombre in self.lista_alumnos_Dam1:
            self.lista_alumnos_Dam1.remove(alumno)
            print(f"El alumno : {alumno.nombre} se ha dado de baja")
        if alumno.nombre in self.lista_alumnos_Dam2:
            self.lista_alumnos_Dam2.remove(alumno)
            print(f"El alumno : {alumno.nombre} se ha dado de baja")





