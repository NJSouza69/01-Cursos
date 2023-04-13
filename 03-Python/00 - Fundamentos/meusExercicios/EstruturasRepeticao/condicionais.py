saldo = 2000.0
cheque_especial = 1000.0
saque = float(input("Informe o valor do saque: "))


if saldo >= saque:
    print("Realizando saque!")
if saldo < saque:
    print("Saldo Insuficiente!")

# Outro exemplo
if saldo >= saque:
    print("Realizando saque!")
else:
    print("Saldo Insuficiente!")


# Outro exemplo
opcao = float(input("Informe uma opção: [1] Sacar\n[2] Extrato:"))

if opcao == 1:
    valor = float(input("Informe o valor do saque: "))
    #...
elif opcao == 2:
    print("Exibindo o extrato...")
else :
    SystemExit("Opção inválida")

# Outro exemplo
MAIOR_IDADE = 18

idade = int(input("Informe sua idade: "))
if idade >= MAIOR_IDADE :
    print("Maior de idade, pode tirar a CNH!")
else:
    print("Ainda não pode tirar a CNH!")

# if aninhado
conta_universitaria = True
conta_normal = False
if conta_normal:
    if saldo >= saque:
        print("Saque realizado com sucesso!")
    elif saldo <= (saque + cheque_especial):
        print("Saque realizado com uso do cheque especial!")
elif conta_universitaria:
    if saldo >= saque:
        print("Saque realizado com sucesso!")
    else:
        print("Saldo insuficiente!")


# if ternário

saldo = 1000
saque = 5000

status = "Sucesso!" if saldo >= saque else "Falha!"

print(f"{status} ao realizar o saque")