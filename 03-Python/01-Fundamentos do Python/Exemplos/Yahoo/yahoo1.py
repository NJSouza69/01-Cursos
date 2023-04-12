#Site de referencia do código
#https://algotrading101.com/learn/yfinance-guide/#Price-to-Earnings-Ratio


import yfinance as yf
import pandas as pd

stocks= yf.Ticker("trpl4.sa")


# show actions
print(stocks.actions)

# show dividends
print(stocks.dividends)

# show splits
print(stocks.splits)

stocks_historical = stocks.history(start="2023-03-11", end="2023-03-17", interval="1m")
print(stocks_historical)

# + other methods etc.
data = yf.download("TRPL4.SA TAEE3.SA CPLE6.SA", start="2023-03-01", end="2023-03-17")
print(data)

print(stocks.basic_info)
#stocks.currency

#print(stocks.info('currency'))
 #['dayHigh', 'dayLow', 'exchange', 'fiftyDayAverage', 'lastPrice', 'lastVolume', 'marketCap', 'open', 'previousClose', 'quoteType', 'regularMarketPreviousClose', 'shares', 'tenDayAverageVolume', 'threeMonthAverageVolume', 'timezone', 'twoHundredDayAverage', 'yearChange', 'yearHigh', 'yearLow'])


