# Instruções para Criação de Repositórios

## Link para download do [Git] (https://git-scm.com/download/win)
- O Git Bash é um terminal extendido para otimisar o uso do Git

## Passo 01
- Criar novo repositório no GitHub

## Passo 02
- Clonar repositório do servidor para a máquina local
###cmd: git clone <endereço http do repositório>

## Passo 03
- Após realizar qualquer alteração enviar tudo para o controle de versão
###cmd: git add . ou git add -A

## Passo 04
- Realizar o commit dos arquivos alterados
###cmd: git commit -m "mensagem explicativa referenciando as alterações realizadas"

## Passo 05
- Enviar para o repositório remoto todos os arquivos novos e atualizados na máquina local
###cmd: git push origin main

### Observações:

####cmd: git status - para saber se existem alterações no diretório local.