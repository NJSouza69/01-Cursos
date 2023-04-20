import os
# limpa tela do terminal
os.system('cls')  # ou os.system('cls') no Windows

class Bicicleta:
    #Método Construtor de Classe
    def __init__(self, cor, modelo, ano, valor, aro):
        self.cor = cor
        self.modelo = modelo
        self.ano = ano
        self.valor = valor
        self.aro = aro

    def buzinar(self):
        print("Plim plim...")

    def parar(self):
        print("Parando bicicleta...")
        print("Bicicleta parada!")

    def correr(self):
        print("Vrummmmm...")

    def trocar_marcha(self):
        print("Marcha trocada")

    # Método para formatar saida quando deseja imprimir o objeto
    def __str__(self):
        return f"{self.__class__.__name__}: {', '.join([f'{chave}={valor}' for chave, valor in self.__dict__.items()])}"


b1 = Bicicleta("vermelha", "caloi", 2022, 600, 18)
print(b1)
b1.cor = "azul"
print(b1)
b1.buzinar()
b1.correr()
b1.parar()
b1.trocar_marcha()
print(b1.cor, b1.modelo, b1.ano, b1.valor)

b2 = Bicicleta("verde", "monark", 2000, 189, 20)
print(b2)
b2.correr()     
# Equivale ao comando abaixo 
Bicicleta.correr(b2)