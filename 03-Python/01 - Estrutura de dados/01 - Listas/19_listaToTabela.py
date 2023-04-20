import pandas as pd
import os
# limpa tela do terminal
os.system('cls')  # ou os.system('cls') no Windows



produtos = [
    {"nome": "IPad", "preco": 1200, "Qde":500},
    {"nome": "IPhone", "preco": 8000, "Qde":1000},
    {"nome": "AirPod", "preco": 3000, "Qde":800},
    {"nome": "AppleWatch", "preco": 4000, "Qde":300},
    {"nome": "MacBook", "preco": 15000, "Qde":300},
]

tabela = pd.DataFrame(produtos)
print(tabela)
print("")
tabela["faturamento"] = (tabela["preco"] * tabela["Qde"])
print(tabela)
