import requests
from bs4 import BeautifulSoup
url="https://www.python.org/jobs/?page="
r=requests.get(url)
soup=BeautifulSoup(r.content,"html.parser")
pages=len(soup.find("ul",{"class":"pagination menu"}).find_all("li"))-2
sayac = 0
for page in range(1,pages+1):
    sayfa=(url+str(page))
    new_r=requests.get(sayfa)
    new_soup=BeautifulSoup(new_r.content,"html.parser")
    jobs=(new_soup.find("div",{"class":"row"}).ol.find_all("li"))
    for job in jobs:
        first=job.h2.find("span",{"class":"listing-company-name"}).a.text.strip()
        location=job.h2.find("span",{"class":"listing-location"}).a.text.strip()
        business_ability=job.find("span",{"class":"listing-job-type"}).text.strip()
        date=job.find("span",{"class":"listing-posted"}).time.text.strip()
        sayac +=1
        print(f"(İŞ:{sayac})\n{first} işi bulundu.\nİş yeri {location} da bulunmaktadır.\nİşe girmeniz için {business_ability} teknolojilerine hakim olmanız gerekir.\n{date} tarihinde ilan girilmiştir.GEÇ OLMADAN BAŞVURU YAPMANIZI TAVSİYE EDERİZ...")
        print("*"*60)
print("Toplam bulunan iş sayısı",sayac)