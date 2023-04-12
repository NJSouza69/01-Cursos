#Exemplo 01 - Métodos

curso = "   pYtHon   "
print(curso.upper())
print(curso.lower())
print(curso.title())
print(curso.strip())
print(curso.lstrip())
print(curso.rstrip())

curso = "Python"
print(".".join(curso))
print(curso.center(12,"-"))
print("-".join(curso))


#Exemplo 02 - Interpolação de Variáveis
nome = "Guilherme"
idade = 25.35
profissao = "Engenheiro Eletricista"
linguagem = "Python"

# Método %s ou %d
print("Olá, me chamo %s. Eu tenho %d anos de idade, trabalho como %s e estou matriculado no curso de %s." % (nome, idade, profissao,linguagem))

#Método format
print("Olá, me chamo {}. Eu tenho {} anos de idade, trabalho como {} e estou matriculado no curso de {}.".format(nome, idade, profissao,linguagem))
print("Olá, me chamo {0}. Eu tenho {1} anos de idade, trabalho como {2} e estou matriculado no curso de {3}.".format(nome, idade, profissao,linguagem))

pessoa = {"nome":"Guelherme", "idade": 25,"profissao": "Engenheiro Eletricista","linguagem": "Python"}
print("Olá, me chamo {nome}. Eu tenho {idade} anos de idade, trabalho como {profissao} e estou matriculado no curso de {linguagem}.".format(**pessoa))

print(f"Olá, me chamo {nome}. Eu tenho {idade:5.2f} anos de idade, trabalho como {profissao} e estou matriculado no curso de {linguagem}.")

PI = 3.14159
print(f"Valor de PI: {PI:.2f}")
print(f"Valor de PI: {PI:.4f}")
print(f"Valor de PI: {PI:10.2f}")

# Exemplo 03 Fatiamento de strings

texto = "Nilson José de Souza"
print(texto[5])
print(texto[-1])
print(texto[:8])
print(texto[10:])
print(texto[3:13])
print(texto[:])
print(texto[::-1])
print(texto[5:12:2])

# Exemplo 04 - Strings Multiplas Linhas ou Triplas
nome = "Nilson José de Souza"

mensagem = f"""Olá meu nome é {nome}, 
  Eu estou aprendendo Python
"""
print(mensagem)

mensagem = f'''   Olá meu nome é {nome}, 
    Eu estou aprendendo Python
          Essa mensagem tem diferentes recuos
'''
print(mensagem)

menu = f'''
**************MENU***************

    1 - Depositar
    2 - Sacar
    3 - Sair

*********************************'''
print(menu)

menu = f"""
**************MENU***************

    1 - Depositar
    2 - Sacar
    3 - Sair

*********************************"""
print(menu)