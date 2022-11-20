import requests
from bs4 import BeautifulSoup
link="https://www.espn.com/nba/teams"

r=requests.get(link)
soup=BeautifulSoup(r.content,"html.parser")
messi=soup.find("div",{"class":"Wrapper bg-clr-white br-5 mb3 pa5"}).find_all("div",{"class":"mt7"})
sayac=1
for i in messi:
    pasifikler=i.find("div",{"class":"headline headline pb4 n8 fw-heavy clr-gray-01"}).text
    kobe=i.find("div",{"class":"ContentList mt4 ContentList--NoBorder"}).find_all("div",{"class":"ContentList__Item"})
    print(pasifikler)
    for m in kobe:
        #takımlar=m.find("div",{"class":"mt3"}).find("section",{"class":"TeamLinks flex items-center"}).next.next.next.next.next.text
        teams=m.find("div",{"class":"mt3"}).find("section",{"class":"TeamLinks flex items-center"}).find("h2",{"class":"di clr-gray-01 h5"}).text
        print("TEAM"+str(sayac)+"--->"+teams)
        sayac+=1

