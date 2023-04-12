# Instalar biblioteca no dos
#pip install yfinance

import yfinance as yf 

vale = yf.Ticker("VALE")
vale.info

data_vale = yf.download("VALE", start="2017-01-01", end=end_data, progress=False)
data_vale

from datetime import datetime

end_data = datetime.now().strftime('%Y-%m-%d')

d_vale['Adj Close']

data_vale['Adj Close'].plot()

