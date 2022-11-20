import requests
from bs4 import BeautifulSoup
link="https://www.imdb.com/chart/top/"
r=requests.get(link)
soup=BeautifulSoup(r.content,"html.parser")
fec=soup.find_all("table",{"class":"chart full-width"})
for i in fec:
    cef=i.find_all("tbody",{"class":"lister-list"})
    #print(cef)
    
for film in cef:
        
    hypo1=film.find_all("tr")
    #print(hazal)    
 
for arz in hypo1:
    
    hypo2=arz.find_all("td",{"class":"titleColumn"})
    
    hypo3=(hypo2[0].text.strip().replace("\n",""))
    print(hypo3)
    