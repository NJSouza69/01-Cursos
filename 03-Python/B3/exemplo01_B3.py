#pip install B3Bovespa

import requests

url = 'https://arquivos.b3.com.br/api/download/?fileName=InstrumentsConsolidated&date=20220316'
response = requests.get(url)

if response.status_code == 200:
    data = response.content.decode('utf-8')
    lines = data.split('\n')

    for line in lines:
        fields = line.split(';')
        if fields[3] == 'PETR4':
            print('Preço PETR4:', fields[6])
