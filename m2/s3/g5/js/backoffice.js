let form = document.querySelector("form")

form.addEventListener("submit",(e) => {
    e.preventDefault()
    let nome = document.querySelector("#name")
    let brand = document.querySelector("#brand")
    let prezzo = document.querySelector("#price")
    let imgUrl = document.querySelector("#imgUrl")
    let descrizione = document.querySelector("#description")
    
    let nuovoProdotto = {
        name: nome.value,
        brand : brand.value,
        description: descrizione.value,
        price: prezzo.value,
        imageUrl: imgUrl.value,
    }
    fetch('https://striveschool-api.herokuapp.com/api/product/', {

    method: 'POST',
    body: JSON.stringify(nuovoProdotto),
    headers: {
        'Content-Type': 'application/json',
        'Authorization': "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViMjQ3NDJkN2IxMTAwMTkwZTc4MDAiLCJpYXQiOjE3MDk5MDkxMDgsImV4cCI6MTcxMTExODcwOH0.5obxCI0Z8HG2dnVO4zpWQTMu1p_n5pesJoee1Lc2Wlc"
    },
})

.then(res => res.json())
.then(_res => {

    location.href = 'index.html'
})






})