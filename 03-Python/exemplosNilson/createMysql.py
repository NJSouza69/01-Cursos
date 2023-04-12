import mysql.connector
conexao = mysql.connector.connect(
    host='localhost',
    user='root',
    password='Nvgb0927@',
    database='ifmoney',
)

cursor = conexao.cursor()

#CREATE
numero_banco = 1
nome_banco = "Banco do Brasil"

#comando = f'INSERT INTO banco (numero, nome) VALUES ({numero_banco},"{nome_banco}");'
comando = f'INSERT INTO conta (fk_tipo_conta, banco_numero, agencia_numero, numero, digito, saldo, nome, ativo) VALUES ({2},{numero_banco}, {5044}, {110927}, {8},{0.30}, "{nome_banco}",{1});'


cursor.execute(comando)
conexao.commit()                    # Atualiza banco de dados

cursor.close()
conexao.close()