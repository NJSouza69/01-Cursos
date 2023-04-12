
# Instalar biblioteca no dos
#pip install yfinance
import yfinance as yf

# Obter dados históricos de uma ação
msft = yf.Ticker("PETR4.SA")
historico = msft.history(period="max")
print(historico)

# Obter informações sobre uma ação
info = msft.info
print(info)