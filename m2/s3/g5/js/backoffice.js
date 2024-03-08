let saveBtn = document.querySelector(".saveBtn")

saveBtn.addEventListener("click",(e) => {
    e.preventDefault()

    let nome = document.querySelector("#name").value
    let brand = document.querySelector("#brand").value
    let prezzo = document.querySelector("#price").value
    let imgUrl = document.querySelector("#imgUrl").value
    let descrizione = document.querySelector("#description").value
    
    let nuovoProdotto = {
        name: nome,
        description: descrizione,
        brand : brand,
        imageUrl: imgUrl,
        price: prezzo,
    }
    fetch('https://striveschool-api.herokuapp.com/api/product/', {

    method: 'POST',
    headers: {
        'Content-Type': 'application/json',
        "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViNTNlODJkN2IxMTAwMTkwZTdhMWQiLCJpYXQiOjE3MDk5MjEyNTYsImV4cCI6MTcxMTEzMDg1Nn0.F5UCT97J2pdS3T-JLLFT5h3-4velU_d-kw6CAb_bNUw"
    },
    body: JSON.stringify(nuovoProdotto),
})

.then(res => res.json())
.then(res => {

    location.href = 'index.html'
})






})