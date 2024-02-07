from Alumno import Alumno as Alumno
from Profesores import Profesores as Profesores
from  Director import Director as Director
from Jefeestudios import Jefeestudios as Jefeestudios
from Instituto import Instituto as Instituto
david=Alumno("David","Igual Peralta","184365289L","Calle Luisiana",True)
juanma=Alumno("Juanma","gonzales perez","16985265L","Calle Jamon",False)

profe1=Profesores("Juan","Perez alvarez","12569856L","Calle Putin","Vespertino")
profe2=Profesores("Juanito","Perezes alvarez","125469856L","Calle Putinio","Mañana")

direc1=Director("Pedro","Alba","15896523J","Calle bus","Mañana",100,456,13)
direc2=Director("Borja","Albaricoque","15896893k","Calle busiana","Tarde",300,256,9)

jefees1=Jefeestudios("Manolo","Perez alins","12458965L","Calle Camion","Mañana",100,False)
jefees2=Jefeestudios("Juan","Añon burgos","18495685L","Calle Muñones","Tarde",500,True)

instituto=Instituto()
instituto.matricular_alumno(Juanma)
print(instituto.lista_alumnos_Dam2)
print(instituto.lista_alumnos_Dam1)
print(instituto.lista_alumnos_Smr2)
print(instituto.lista_alumnos_Smr1)

