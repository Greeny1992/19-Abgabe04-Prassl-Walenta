# Queue

In der Informatik bezeichnet eine Warteschlange (englisch queue [kju]) eine häufig eingesetzte Datenstruktur. Sie dient zur Zwischenspeicherung von Objekten in einer Reihenfolge, bevor diese weiterverarbeitet werden. 

  - Funktionsprinzip
  - Ilustration
  - Anwendung

### Funktionsprinzip
Eine Warteschlange kann, eine beliebige Menge von Objekten aufnehmen und gibt diese in der Reihenfolge ihres Einfügens wieder zurück. Dazu stellen Warteschlangen die Operationen

   * .offer() zum Hinzufügen eines Objekts und
   * .poll() zum Zurückholen und Entfernen eines Objektes bereit.

Dabei wird nach dem Prinzip First In – First Out (kurz FIFO, deutsch zuerst hinein – zuerst heraus) gearbeitet, das heißt, es wird von .poll() immer das Objekt aus der Warteschlange zurückgegeben, welches von den in der Warteschlange noch vorhandenen Objekten als erstes mit .offer() hineingelegt wurde. 

### Ilustration
Man kann sich eine Warteschlange wie eine Warteschlange von Kunden an einer Kasse vorstellen. Der Letzte, der sich in die Schlange stellt, wird auch als letzter bedient. Umgekehrt wird derjenige, der sich als erstes angestellt hat, als erster bedient.

![Illustration of Queue](./images/Data_Queue.png)

![Illustration of Queue2](./images/Queue_algor.jpg)

Mit enter wird ein neuer Wert (3) der Schlange hinzugefügt, und mit leave das am längsten gespeicherte Element (37) herausgenommen. Der einzige lesende Zugriff erfolgt mit front → und liefert das erste gespeicherte Element der Queue (hier im Beispiel 37, natürlich unter der Annahme, dass die Operation leave noch nicht ausgeführt wurde!). 
### Anwendung
Die zur Interprozesskommunikation verwendete Pipe ist eine der wichtigsten Anwendungen für Warteschlangen.

Durch Warteschlangen werden auch langsame externe Geräte, z. B. Drucker, von der Programmabarbeitung entkoppelt. Nach dem Einstellen eines Druckauftrages in die Warteschlange wird dem Programm der Auftrag als „gedruckt“ signalisiert, tatsächlich wird der Auftrag jedoch erst später bei Verfügbarkeit des Gerätes ausgeführt.

Warteschlangen werden außerdem häufig zur Datenübergabe zwischen asynchronen Prozessen in verteilten Systemen verwendet, wenn also Daten vor ihrer Weiterverarbeitung gepuffert werden müssen. Der Zugriff erfolgt dabei durch im Betriebssystem verankerte APIs. Die Größe der Warteschlange wird durch das Betriebssystem limitiert.

Graphische Benutzeroberflächen puffern Maus- und Tastaturereignisse in einer sogenannten „Message Queue“ nach dem FIFO-Prinzip, d. h. in der Reihenfolge ihres Auftretens. Anschließend leiten sie diese dann, abhängig von Position und Eingabefokus, an die korrekten Prozesse weiter.

Eine Warteschlange kann auch zum Parallelisieren verwendet werden. Dies kann man sich wie bei einem Postamt vorstellen, bei dem es mehrere Schalter für eine Warteschlange gibt. So können Aufgaben eingestellt werden, die später parallel abgearbeitet werden. 


Quelle: 
[Wikipedia](https://de.wikipedia.org/wiki/Warteschlange_(Datenstruktur\) "Wikipedia Queue")
