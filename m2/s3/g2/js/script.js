let input = document.querySelector("input")
let btnSalva = document.querySelector("#salvaBtn")
let btnCancella = document.querySelector("#cancellaBtn")
let valoreSalvato = document.querySelector("#valoreSalvato")


btnSalva.addEventListener("click", () =>{

    localStorage.setItem("contenutoSalvato", input.value)
valoreSalvato.innerText = localStorage.getItem("contenutoSalvato")
input.value = ""
})
btnCancella.addEventListener("click", () => {
    localStorage.removeItem("contenutoSalvato")
    valoreSalvato.innerText = ""
    input.value = ""
})


function timer(){
    let div = document.querySelector("#timer")
    let i = 0;

    setInterval(() => {
        i++
        sessionStorage.setItem("tempoPassato", i)
        div.innerHTML = sessionStorage.getItem("tempoPassato")
    }, 1000);
    

}
timer()