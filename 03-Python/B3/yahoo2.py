# Instalar biblioteca no dos
#pip install yfinance

import pandas_datareader as pdr

msft = pdr.get_data_yahoo("MSFT", start="2022-01-01", end="2022-03-17")
print(msft)
