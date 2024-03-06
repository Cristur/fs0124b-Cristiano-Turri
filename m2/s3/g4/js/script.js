
fetch('https://striveschool-api.herokuapp.com/books')
.then(response => response.json())
.then(dati => {

    console.log(dati);
    let target = document.querySelector("#target")
    for(let libro of dati){
        let div = document.createElement("div")
        div.classList.add("col-3")
        
        div.innerHTML =
    `
         <div class="card" style="width: 18rem">
           <img src="${libro.img}" class="card-img-top" alt="libro" />
           <div class="card-body">
             <h5 class="card-title">${libro.title}</h5>
           </div>
           <ul class="list-group list-group-flush">
             <li class="list-group-item">${libro.category}</li>
             <li class="list-group-item">${libro.price}</li>
           </ul>
           <div class="card-body">
             <button type="button" class="btn btn-danger">Scarta</button>
             <button type="button" class="btn btn-success">Compra Ora</button>
           </div>
         </div>`;
        target.append(div)
    }

})
