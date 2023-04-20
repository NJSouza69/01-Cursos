#https://www.youtube.com/watch?v=fxUyMA1Iowc
#Video sobre atualização de 2 tabelas

import mysql.connector
conexao = mysql.connector.connect(
    host='localhost',
    user='root',
    password='Nvgb0927@',
    database='ifmoney',
)

cursor = conexao.cursor()

#UPDATE
numero_banco = 1
nome_banco = "Banco do Brasil"

comando = f'UPDATE conta SET banco_numero = {numero_banco} WHERE nome = "{nome_banco}"'
cursor.execute(comando)
conexao.commit()                    # Atualiza banco de dados

cursor.close()
conexao.close()