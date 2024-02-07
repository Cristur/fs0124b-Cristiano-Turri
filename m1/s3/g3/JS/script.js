let input = document.querySelector("input");
let aggiungi = document.querySelector("#aggiungiButton");
let elimina = document.querySelector("#eliminaButton")
let target = document.querySelector(".taskContainer");
let ul = document.createElement("ul");
target.append(ul);

aggiungi.addEventListener("click", () => {
  let li = document.createElement("li");
  let task = input.value;
  li.innerText = task;
  ul.append(li);
});


/*li.addEventListener("click", () => {
    let li = document.querySelector("li")
    li.innerText.style.text-decoration = "line-through";
})*/

elimina.addEventListener("click", () => {
    let li = document.querySelector("li");
    let task = input.value
        if(li.innerText == task){
            li.remove()
        }
    })
    
