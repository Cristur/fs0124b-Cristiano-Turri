/* ESERCIZIO 1
 Scrivi una funzione di nome "area", che riceve due parametri (l1, l2) e calcola l'area del rettangolo associato.
*/

function area(l1, l2){
    return l1*l2
}

console.log(area(4, 3))
/* ESERCIZIO 2
 Scrivi una funzione di nome "crazySum", che riceve due numeri interi come parametri.
 La funzione deve ritornare la somma dei due parametri, ma se il valore dei due parametri è il medesimo deve invece tornare
 la loro somma moltiplicata per tre.
*/

function crazySum(a, b){
    if(a==b){
        return (a+b)*3
    }
    return a+b;
}
console.log(crazySum(3,3))

/* ESERCIZIO 3
 Scrivi una funzione di nome "crazyDiff" che calcola la differenza assoluta tra un numero fornito come parametro e 19.
 Deve inoltre tornare la differenza assoluta moltiplicata per tre qualora il numero fornito sia maggiore di 19.
*/

function crazyDiff(a){
    if(a>19){
        return (Math.abs(a-19))*3
    }
    return Math.abs(a-19)
}
console.log(crazyDiff(20))

/* ESERCIZIO 4
 Scrivi una funzione di nome "boundary" che accetta un numero intero n come parametro, e ritorna true se n è compreso tra 20 e 100 (incluso) oppure
 se n è uguale a 400.
*/

function boundary(n){
    if(20 < n && n <=100 || n == 400){
        return true;
    }
    return false;
}
console.log(boundary(101))

/* ESERCIZIO 5
 Scrivi una funzione di nome "epify" che accetta una stringa come parametro.
 La funzione deve aggiungere la parola "EPICODE" all'inizio della stringa fornita, ma se la stringa fornita comincia già con "EPICODE" allora deve
 ritornare la stringa originale senza alterarla.
*/

function epify(a){
    if(a.indexOf("EPICODE") == 0){
        return a;
    }
    return ("EPICODE" + a);
}
console.log(epify("EPICODE è una figata"))

/* ESERCIZIO 6
 Scrivi una funzione di nome "check3and7" che accetta un numero positivo come parametro. La funzione deve controllare che il parametro sia un multiplo
 di 3 o di 7. (Suggerimento: usa l'operatore modulo)
*/

function check3and7(a){
    if(a%3==0){
        return a + " è un multiplo di 3"
    }
    else if(a%7==0){
        return a + " è un multiplo di 7"
    }
    return a + " non è un multiplo nè di 3 nè di 7"
}
console.log(check3and7(8))

/* ESERCIZIO 7
 Scrivi una funzione di nome "reverseString", il cui scopo è invertire una stringa fornita come parametro (es. "EPICODE" --> "EDOCIPE")
*/

function reverseString(a){
    let reverse="";
    for(let i=a.length-1; i>=0; i--){
        reverse = reverse + a[i];
    }
    return reverse;
}
console.log(reverseString("EPICODE"))

/* ESERCIZIO 8
 Scrivi una funzione di nome "upperFirst", che riceve come parametro una stringa formata da diverse parole.
 La funzione deve rendere maiuscola la prima lettera di ogni parola contenuta nella stringa.
*/
function upperFirst(a){
    let upper;
    upper = a.split(" ");
    for(let i=0; i<upper.length; i++){
      upper[i] = upper[i].charAt(0).toUpperCase() + upper[i].substring(1);
    }
    upper = upper.join(" ");
    return upper
}
console.log(upperFirst("mi chiamo cristiano"))


/* ESERCIZIO 9
 Scrivi una funzione di nome "cutString", che riceve come parametro una stringa. La funzione deve creare una nuova stringa senza il primo e l'ultimo carattere
 della stringa originale.
*/

function cutString(a){
    let cut;
    cut= a.slice(1, a.lastIndexOf())
    return cut;
}
console.log(cutString("ciao"))

/* ESERCIZIO 10
 Scrivi una funzione di nome "giveMeRandom", che accetta come parametro un numero n e ritorna un'array contenente n numeri casuali inclusi tra 0 e 10.
*/

function giveMeRandom(n){
    let random =[n]
    for(let i=0; i<n; i++){
        random[i] = Math.floor(Math.random()*11)
    }
    return random;
}
console.log(giveMeRandom(10))


