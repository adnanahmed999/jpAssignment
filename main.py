import datetime
import yfinance as yf 
import matplotlib.pyplot as plt

present_date = datetime.datetime.today().strftime('%Y-%m-%d')
five_years_back_date = (datetime.datetime.now() - datetime.timedelta(days=(5*365+1))).strftime('%Y-%m-%d')

IT_Companies = ['TCS', 'INFY', 'WIPRO.NS', 'HCLTECH.NS', 'TECHM.NS']

data = yf.download(IT_Companies,F'{five_years_back_date}',F'{present_date}')

data["Close"].plot()

plt.title("Previous 5 year Stock Data of IT Companies")
plt.xlabel("Years")
plt.ylabel("Closing Price")
plt.legend()
plt.grid()
plt.tight_layout()
plt.show()

