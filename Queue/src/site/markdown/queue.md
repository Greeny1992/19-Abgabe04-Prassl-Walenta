# Queue

In der Informatik bezeichnet eine Warteschlange (englisch queue [kju]) eine häufig eingesetzte Datenstruktur. Sie dient zur Zwischenspeicherung von Objekten in einer Reihenfolge, bevor diese weiterverarbeitet werden. 

  - Funktionsprinzip
  - Ilustration
  - Anwendung
  - Verwandschaft mit Stapelspeichern

### Funktionsprinzip
Eine Warteschlange kann, eine beliebige Menge von Objekten aufnehmen und gibt diese in der Reihenfolge ihres Einfügens wieder zurück. Dazu stellen Warteschlangen die Operationen

   * .offer() zum Hinzufügen eines Objekts und
   * .poll() zum Zurückholen und Entfernen eines Objektes bereit.

Dabei wird nach dem Prinzip First In – First Out (kurz FIFO, deutsch zuerst hinein – zuerst heraus) gearbeitet, das heißt, es wird von .poll() immer das Objekt aus der Warteschlange zurückgegeben, welches von den in der Warteschlange noch vorhandenen Objekten als erstes mit .offer() hineingelegt wurde. 

### Ilustration
Man kann sich eine Warteschlange wie eine Warteschlange von Kunden an einer Kasse vorstellen. Der Letzte, der sich in die Schlange stellt, wird auch als letzter bedient. Umgekehrt wird derjenige, der sich als erstes angestellt hat, als erster bedient.

![Illustration of Queue](./media/Data_Queue.png)
![Illustration of Queue2](./media/Queue_algor.jpg)

Mit enter wird ein neuer Wert (3) der Schlange hinzugefügt, und mit leave das am längsten gespeicherte Element (37) herausgenommen. Der einzige lesende Zugriff erfolgt mit front → und liefert das erste gespeicherte Element der Queue (hier im Beispiel 37, natürlich unter der Annahme, dass die Operation leave noch nicht ausgeführt wurde!). 