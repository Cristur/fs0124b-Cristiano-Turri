/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per visualizzare l'output, lancia il file HTML a cui è collegato e apri la console dagli strumenti di sviluppo del browser. 
- Utilizza dei console.log() per testare le tue variabili e/o i risultati delle espressioni che stai creando.
*/

/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/

/* Stringa: datatype che contine principalmente una serie di caratteri, possono essere concatenate e le riconosciamo dal fatto che il contenuto è racchiuso fra singolo o doppio apice
   Numero: datatype che contine numeri con cui posso svolgere operazioni matematiche tramite operatori quali (+ - * /) possiamo riconoscerlo dal fatto che il contenuto non è racchiuso in apici
   Booleano: datatype che riconosciamo perchè può avere soltanto due valori, true o false, utilizzato spesso per la verifica di condizioni
   Array: dataype che può contenere un insieme di valori e lo riconosciamo perchè è seguito da parentesi []
   Oggetto: datatype che indica un contenitore di valori con delle proprietà, lo riconosciamo perchè seguito da parentesi {} */
   
/* ESERCIZIO 2
 Crea una variable chiamata "myName" e assegna ad essa il tuo nome, sotto forma di stringa.
*/
let myName="Cristiano";
console.log(myName);

/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/
let a=12;
let b=20;
let c= a+b;
console.log(c);

/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
*/

let x=12;
console.log(x);

/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "myName" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/

myName="Turri";
console.log(myName);

/* Const è una parola chiave che per definizione non permette il riassegnamento del proprio valore, se provo infatti a riassegnare una variabile costante in questo modo:
 const nome= "io"
 nome="tu";
 la console identifica un errore scrivendo "Uncaught TypeError: Assignment to constant variable."*/

/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

let d;
d=4-x;
console.log(d)

/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/

let name1= "jhon";
let name2= "Jhon";
console.log(name1 == name2);
console.log(name1.toLowerCase() == name2.toLowerCase());
