# Inlamningsuppgift
## Del 1
Redogöra för följande termer:
### Objekt  
Ett objekt representerar en specifik instans av en klass. I ett objekt samlas de egenskaper (attribut) och beteenden (metoder) som definieras av klassen. Själva klassen fungerar som en mall, medan objektet innehåller de konkreta värdena för just den instansen.
Till exempel kan en klass beskriva en bil med attribut som färg, modell och antal dörrar, medan ett objekt av klassen representerar en specifik bil – till exempel en röd Volvo med fyra dörrar.
### Konstruktor
En konstruktor i Java är en speciell metod som anropas automatiskt när ett nytt objekt skapas. Konstruktorns namn är alltid samma som klassens namn och den saknar returtyp. Dess främsta uppgift är att initiera objektets attribut och ta emot eventuella inparametrar som används för att sätta startvärden.
### Attribut
Attribut är variabler som beskriver ett objekts egenskaper. De definieras i klassen och lagrar information om objektet, till exempel en bils färg, modell eller antal dörrar. 
### Redogöra för de grundläggande principerna för versionshantering 
Man använder sig av versionshanteringsystem för att kunna se vad som har hänt i koden över tid. När man gör en kodändring sparas den och registreras med information om vem som gjort ändringen, när den gjordes och varför. På det här sättet kan flera personer arbeta på samma projekt samtidigt utan att deras arbete krockar. Om något går fel kan man även gå tillbaka till tidigare versioner och ändra eller bara jämföra olika versioner med varandra. 
### Beskriv kort utvecklingsprocessen TDD 
Test Driven Development (TDD) innebär att man skriver tester innan man skriver den faktiska koden. Man börjar med att skapa ett enhetstest som medvetet kommer att misslyckas, eftersom funktionaliteten ännu inte finns. Därefter skriver man den enklaste möjliga koden som gör att testet går igenom. Sedan upprepas processen: man skriver ett nytt test, ser det misslyckas, implementerar den nödvändiga koden och ser till att alla tester klarar sig.
Fördelen med TDD är att all kod blir testad, vilket minskar risken för buggar, och att man bara skriver den kod som faktiskt behövs för att uppfylla kraven.
