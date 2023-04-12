import requests

url = 'https://arquivos.b3.com.br/api/download/?fileName=InformationFile&date=20220316'
response = requests.get(url)

if response.status_code == 200:
    data = response.content.decode('latin1')
    lines = data.split('\n')

    for line in lines:
        fields = line.split(';')
        if fields[1] == 'PETR4':
            print('Nome da empresa PETR4:', fields[2])
            print('Setor da empresa PETR4:', fields[3])
