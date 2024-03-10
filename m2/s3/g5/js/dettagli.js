let url = new URLSearchParams(location.search)
let id = url.get("id")

fetch(`https://striveschool-api.herokuapp.com/api/product/${id}`, {
    headers : {
        "Content-type" : "application/json",
        "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViNTNlODJkN2IxMTAwMTkwZTdhMWQiLCJpYXQiOjE3MDk5MjEyNTYsImV4cCI6MTcxMTEzMDg1Nn0.F5UCT97J2pdS3T-JLLFT5h3-4velU_d-kw6CAb_bNUw"
    },
})

.then(res => res.json())
.then(product => {
    
let title = document.querySelector(".cardTitle")
let brand = document.querySelector(".cardBrand")
let price = document.querySelector(".cardPrice")
let description = document.querySelector(".cardDescription")
let img = document.querySelector(".img-fluid")

title.innerText = "Nome Prodotto: " + product.name
brand.innerText = "Brand : " + product.brand
price.innerText = "Prezzo : " + product.price
description.innerText = "Descrizione : " + product.description
img.src = product.imageUrl


})