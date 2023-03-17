import fundamentus
import requests_cache
import requests
import time, logging
import pandas as pd
import matplotlib.pyplot as plt
df = fundamentus.get_resultado()
df.columns
df
df.dtypes
df.describe()
df.pl
print(df.columns)
print(df.describe())
filtro1 = df[(df.pl > 0) & (df.mrgebit > 0.5) & (df.dy > 0.09) ]
papeis = filtro1.sort_values('dy',ascending=False)
print(papeis)
