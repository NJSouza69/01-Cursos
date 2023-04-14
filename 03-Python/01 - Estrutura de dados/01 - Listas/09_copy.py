lista = [1, "Python", [40, 30, 20]]

l2 = lista.copy()
l2[0] = 2

print(id(l2),id(lista))
print(lista)  # [1, "Python", [40, 30, 20]]
print(l2)