import mysql.connector
conexao = mysql.connector.connect(
    host='localhost',
    user='root',
    password='Nvgb0927@',
    database='ifmoney',
)

cursor = conexao.cursor()

#UPDATE
numero_banco = 159
nome_banco = "Banco do Brasil"

comando = f'DELETE FROM conta WHERE nome = "{nome_banco}"'
cursor.execute(comando)
conexao.commit()                    # Atualiza banco de dados

cursor.close()
conexao.close()