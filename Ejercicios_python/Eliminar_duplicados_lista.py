lista=['Antonio','Juan','Juan','Pedro','Lucas','Ana','Julian','Ana','Juan','Ana','Ana','Lucia','Pablo']

for i in range (len(lista)-1,-1,-1):
    nombre_actual=lista[i]
    contador=0
    for j in range(len(lista)-1,-1,-1):
        if lista[j]== nombre_actual:
            contador+=1
            if lista[j]==nombre_actual and contador >2:
                del lista[j]
print(lista)
