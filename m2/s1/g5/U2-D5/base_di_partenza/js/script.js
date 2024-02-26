let menu = document.querySelector(".menu")
let start = document.querySelector(".start")
window.addEventListener("scroll", function(){
    let top = window.scrollY
    if(top >375){
        menu.style.background = "white"
        start.style.background = "#009900"
    }
    else{
  menu.style.background = "#ffc017"
  start.style.background = "black"
    }
})