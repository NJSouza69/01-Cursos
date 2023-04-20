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

#READ

comando = f'SELECT * FROM conta;'
cursor.execute(comando)
resultado = cursor.fetchall()       #Ler banco de dados
print(resultado)

cursor.close()
conexao.close()