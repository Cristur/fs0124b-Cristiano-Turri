let tabelloneElement = document.querySelector(".tabellone");
let extractionButton = document.querySelector(".btn");

let numbersToExtract = [];
console.log(numbersToExtract)

for(let i=1; i<=76; i++){
    let tabellaElement = document.createElement("div");
    tabellaElement.classList.add("tabella");
    tabellaElement.innerText = i;
    tabelloneElement.append(tabellaElement);
    numbersToExtract.push(tabellaElement);
}


extractionButton.addEventListener("click", function(){
    let randomNumber = Math.floor(Math.random()*77);
    let extractedNumber = (numbersToExtract.find((element) => element.innerText == randomNumber))
    extractedNumber.classList.add("estratto")
    /*provo a eliminare il numero estratto per non ciclcare più di una volta sullo stesso numero
    numbersToExtract.splice(numbersToExtract.indexOf(extractedNumber), 1);*/
    
})


