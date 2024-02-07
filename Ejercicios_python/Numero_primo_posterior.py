def generarprimo():
    numeros_primos=[]
    for i in range(2,2000):
        primo=True
        for j in range(2,i):
            if i%j==0:
                primo=False
                break
        if primo:
            numeros_primos.append(i)
    return numeros_primos

numero=int(input("Introduce un numero: "))
numeros_primos=generarprimo()
for i in range (2000):
    if numero<numeros_primos[i]:
        print(numeros_primos[i])
        break