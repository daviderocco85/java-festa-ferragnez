# Java Festa Ferragnez

Il progetto **Java Festa Ferragnez** consiste nella realizzazione di un programma Java che simula il controllo degli invitati all'ingresso di una festa dei Ferragnez.

Il compito è verificare che possano accedere alla festa esclusivamente le persone presenti nella lista degli invitati.

## Obiettivi

- Creare il progetto con il package `com.ferragnez.party` che contiene la classe `CheckGuest`.
- Creare e inizializzare un array all'interno della classe contenente i nomi degli invitati.
- Chiedere all'utente di inserire il proprio nome.
- Verificare che il nome inserito sia presente nella lista.
- Consentire l'accesso agli invitati autorizzati.
- Negare l'accesso a chi non è presente nella lista.

## Lista degli invitati

L'array contiene i seguenti nomi:

- Dua Lipa
- Paris Hilton
- Manuel Agnelli
- J-Ax
- Francesco Totti
- Ilary Blasi
- Bebe Vio
- Luis
- Pardis Zarei
- Martina Maccherone
- Rachel Zeilic

## Funzionamento

- Il programma inizializza l'array degli invitati.
- Chiede all'utente di inserire il proprio nome.
- Legge l'input da tastiera tramite la classe `Scanner`.
- Confronta il nome inserito con quelli presenti nell'array, ignorando le differenze tra maiuscole e minuscole e normalizzando gli spazi.
- Se il nome è presente nella lista, stampa il messaggio:
```text
Puoi entrare!
```
- Se il nome non è presente nella lista, stampa il messaggio:
```text
Non sei nella lista invitati, non puoi entrare!
```

## Tecnologie utilizzate

- **Java**. 
- **Scanner** – per leggere l'input dell'utente.
- **Array** – per memorizzare la lista degli invitati.
- **Ciclo `for`** e **ciclo `while`** – per iterare la lista e verificare la presenza del nome.
- **String** – per confrontare e normalizzare i nomi inseriti.

## Bonus

Il progetto prevede anche l'implementazione alternativa del controllo degli invitati utilizzando il ciclo `while`, nel caso in cui la versione iniziale sia stata sviluppata con il ciclo `for` o viceversa.

