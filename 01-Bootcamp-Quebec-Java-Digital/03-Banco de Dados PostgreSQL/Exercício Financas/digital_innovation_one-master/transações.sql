SELECT numero, nome, ativo FROM banco ORDER BY numero ASC;

UPDATE banco SET ativo = false WHERE numero =0;

BEGIN;
UPDATE banco SET ativo = true WHERE numero =0;
ROLLBACK;
SELECT numero, nome, ativo FROM banco ORDER BY numero ASC;

BEGIN;
UPDATE banco SET ativo = true WHERE numero =0;
COMMIT;
SELECT numero, nome, ativo FROM banco ORDER BY numero ASC;

BEGIN;
UPDATE banco SET ativo = true WHERE numero = 0;
SAVEPOINT sf_banco;
UPDATE banco SET ativo = false WHERE numero = 1;
ROLLBACK TO sf_banco;
UPDATE banco SET ativo = true WHERE numero = 3;
COMMIT;
SELECT numero, nome, ativo FROM banco ORDER BY numero ASC;