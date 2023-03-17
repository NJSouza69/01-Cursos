import requests

url = 'https://arquivos.b3.com.br/api/download/?fileName=HistoricalDayQuote&date=20220316'
response = requests.get(url)

if response.status_code == 200:
    data = response.content.decode('utf-8')
    lines = data.split('\n')

    for line in lines:
        fields = line.split(';')
        if fields[2] == 'PETR4' and fields[3] == '2022-03-15':
            print('Preço PETR4 em 15/03/2022:', fields[4])
