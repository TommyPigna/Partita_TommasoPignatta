## SCOPO DEL PROGETTO

Il progetto "Pignatta Partita Pallavolo" è un'applicazione che permette di simulare una partita di pallavolo in cui due giocatori, rappresentati da due diversi thread, si passano la palla. L'obiettivo principale, inoltre, è quello di implementare l'uso delle classi `Thread` e `Runnable` in Java e di comprendere la complessa gestione dei vari thread, anche in base alla loro priorità.

## METODI E ATTRIBUTI DELLA CLASSE THREAD UTILIZZATI
### Metodi Utilizzati
- **`setPriority(int newPriority)`**
  - **DESCRIZIONE**: Questo metodo imposta la priorità del thread su `MAX_PRIORITY`, che è la priorità massima possibile per un thread.
  - **USO**: `t1.setPriority(Thread.MAX_PRIORITY);` 

- **`start()`**
  - **DESCRIZIONE**: Questo metodo avvia l'esecuzione del thread. Il metodo `run()` della classe `Runnable` associata viene chiamato in un nuovo thread di esecuzione.
  - **USO**: `t1.start(); t2.start();`

- **`currentThread()`**
  - **DESCRIZIONE**: Questo metodo statico è usato per ottenere il thread attualmente in esecuzione, in modo da poter chiamare metodi su di esso, come `yield()`.
  - **USO**: `Thread.currentThread()`

### Attributi Utilizzati
- **`MAX_PRIORITY`**
  - **DESCRIZIONE**: Questo campo statico è utilizzato per impostare la priorità massima del thread.
  - **USO**: `Thread.MAX_PRIORITY`

## METODI E ATTRIBUTI DELLA CLASSE OBJECT
### Metodi Utilizzati
- **`yield()`**
  - **DESCRIZIONE**: Questo metodo svolge la funzione di forzare il thread corrente a cedere l'esecuzione ad altri thread.
  - **USO**: `Thread.currentThread().yield();`

## COMMENTO DELL'ESECUZIONE

1. **Creazione dei Giocatori**:
   - Vengono creati due oggetti `Giocatore` con ID univoci per ciascuno, `g1` e `g2`.

2. **Creazione dei Thread**:
   - `g1` è associato a un thread `t1`, a cui viene impostata la priorità massima. 
   - `g2` è avviato in un thread con priorità predefinita.

3. **Avvio dei Thread**:
   - Il thread `t1` viene avviato con `t1.start()`.
   - Un nuovo thread viene creato e avviato per `g2`.

4. **Esecuzione dei Giocatori**:
   - Entrambi i thread eseguono un ciclo infinito in cui stampano il loro ID e il numero di passaggi effettuati.

5. **Incremento dei Passaggi**:
   - Ad ogni iterazione del ciclo, il numero di passaggi, ovvero `numPassaggi`, viene incrementato.

6. **Utilizzo di `yield()`**:
   - Il metodo `yield()` è chiamato per permette
