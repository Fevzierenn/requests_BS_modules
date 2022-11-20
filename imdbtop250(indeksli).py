import requests
from bs4 import BeautifulSoup

link="https://www.imdb.com/chart/top/"
getcontent=requests.get(link)
insert=getcontent.content
beauty=BeautifulSoup(insert,"html.parser")
keriz=beauty.find_all("table",{"class":"chart full-width"})
meriz=keriz[0].contents
lengthofC=(len(keriz[0].contents))
listeyegidis=(meriz)[5] #tbody ulaştık
messi=listeyegidis.find_all("tr")
for film in messi:
    filmadlari=film.find_all("td",{"class":"titleColumn"})
    messi=filmadlari[0].text
    messi=messi.replace("\n","")

    print(messi.strip())
 