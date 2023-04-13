# Estruturas de repetição
a = 5 #int(input("Informe um número inteiro: "))
nro_repeticoes = 10

print(a)
a += 1
print(a)
a += 1
print(a)


# Exemplo 01
texto = "Nilson Jose de Souza"#input("Informe um texto: ")
VOGAIS = "AEIOU"

for letra in texto:
    if letra.upper() in VOGAIS:
        print(letra, end="")
print() # adiciona uma quebra de linha


# Exemplo 02
for letra in texto:
    if letra.upper() in VOGAIS:
        print(letra, end="")
        print() # adiciona uma quebra de linha

for letra in texto:
    if letra.upper() in VOGAIS:
        print(letra, end="")
else:
    print() # adiciona uma quebra de linha
    print("Executa no final do laço")


# Exemplo 03 - Função range(start,end,step)
print(list(range(0,100,3)))
print() # adiciona uma quebra de linha

for numero in range(0,11):
    print(numero, end=" ")
else:
    print() # adiciona uma quebra de linha

for numero in range(0,51,5):
    print(numero, end=" ")
else:
    print() # adiciona uma quebra de linha


# Exemplo 04 While
opcao = -1
while opcao != 0:
    opcao = int(input("[1] Sacar \n [2] Extrato\n [0] Sair \n "))
    if opcao == 1:
        print("Sacando...")
    elif opcao == 2:
        print("Exibindo o extrato... ")
else:
    print("Obrigado por usar nosso sistema bancário, até logo!")

while True:
    opcao = int(input("[1] Sacar \n [2] Extrato\n [0] Sair \n "))
    if opcao == 1:
        print("Sacando...")
    elif opcao == 2:
        print("Exibindo o extrato... ")
    elif opcao == 0:
        break

# Exemplo 02 continue pula a execução
for numero in range(100):
    if numero %2 ==0:
        continue
    print(numero-1, end=" ")




