import os
# limpa tela do terminal
os.system('cls')  # ou os.system('cls') no Windows

salario = 2000


def salario_bonus(bonus):
    global salario
    salario += bonus
    return salario


novoSalario = salario_bonus(500)  # 2500
print(novoSalario)
