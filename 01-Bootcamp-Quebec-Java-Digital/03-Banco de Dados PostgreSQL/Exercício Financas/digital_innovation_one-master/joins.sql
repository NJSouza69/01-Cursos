-- JOINS

SELECT tabela_1.campos, tabela_2.campos
FROM tabela_1
JOIN tabela_2;

SELECT tabela_1.campos, tabela_2.campos
FROM tabela_1
LEFT JOIN tabela_2
ON tabela_2.campo=tabela_1.campo;

SELECT tabela_1.campos, tabela_2.campos
FROM tabela_1
RIGHT JOIN tabela_2
ON tabela_2.campo=tabela_1.campo;

SELECT tabela_1.campos, tabela_2.campos
FROM tabela_1
FULL JOIN tabela_2
ON tabela_2.campo=tabela_1.campo;

SELECT tabela_1.campos, tabela_2.campos
FROM tabela_1
CROSS JOIN tabela_2;

SELECT numero, nome FROM banco;
SELECT banco_numero,numero, nome FROM agencia;
SELECT numero, nome FROM cliente;
SELECT banco_numero,agencia_numero,numero,digito, cliente_numero FROM agencia;
SELECT id, nome FROM tipo_transacao;
SELECT banco_numero,agencia_numero, conta_corrente_numero, conta_corrente_digito, cliente_numero, valor FROM cliente_transacoes;

SELECT count(1) FROM banco;
SELECT count(1) FROM agencia;

SELECT banco.numero, banco.nome, agencia.numero, agencia.nome
FROM banco
JOIN agencia ON agencia.banco_numero = banco.numero;

SELECT banco.numero
FROM banco
JOIN agencia ON agencia.banco_numero = banco.numero
GROUP BY banco.numero;

SELECT count (distinct(banco.numero))
FROM banco
JOIN agencia ON agencia.banco_numero = banco.numero;

SELECT banco.numero, banco.nome, agencia.numero, agencia.nome
FROM banco
LEFT JOIN agencia ON agencia.banco_numero = banco.numero;

SELECT agencia.numero, agencia.nome, banco.numero, banco.nome
FROM agencia
RIGHT JOIN banco ON banco.numero = agencia.banco_numero;

SELECT agencia.numero, agencia.nome, banco.numero, banco.nome
FROM agencia
LEFT JOIN banco ON banco.numero = agencia.banco_numero;

SELECT banco.numero, banco.nome, agencia.numero, agencia.nome
FROM banco
FULL JOIN agencia ON agencia.banco_numero = banco.numero;

SELECT 	banco.nome, 
		agencia.NOME, 
		conta_corrente.numero,
		conta_corrente.digito,
		cliente.nome
FROM banco
JOIN agencia ON agencia.banco_numero = banco.numero
JOIN conta_corrente
	-- ON conta_corrente.banco_numero = agencia.banco_numero
	ON conta_corrente.banco_numero = banco.numero
	AND conta_corrente.agencia_numero = agencia.numero
JOIN cliente
	ON cliente.numero = conta_corrente.cliente_numero;
