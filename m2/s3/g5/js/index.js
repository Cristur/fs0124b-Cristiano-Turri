fetch("https://striveschool-api.herokuapp.com/api/product/",{
    headers: {
        'Content-type':'application/json',
        Authorization: "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZGEzYjJkN2IxMTAwMTkwZTZkZWYiLCJpYXQiOjE3MDk4OTAxMDcsImV4cCI6MTcxMTA5OTcwN30.zsDD5gyVPTazmEJrT1GPgji7WoRLj4nP93cUIwb1q3w "
    },

})
.then (res => res.json())
.then (nuovoProdotto => {
    for (let prodotto of nuovoProdotto){
        let card = generaClone()

        let title = card.querySelector( ".cardTitle")
        title.inneText = prodotto.name
        let brand = card.querySelector(".cardBrand")
        brand.inneText = prodotto.brand
        let price = card.querySelector(".cardPrice")
        price.inneText = prodotto.price
        let description = card.querySelector(".cardDescription")
        description.inneText = prodotto.description
        let image = card.querySelector(".card-img-top")
        image.src = prodotto.imageUrl
        let modificaBtn = card.querySelector(".modificaBtn")
        modificaBtn.href = `modifica.html?id=${prodotto._id}` 

        document.querySelector("#target").appendChild(prodotto)
    }
    })










function generaClone(){
    
    let template = document.querySelector('#cardTemplate')
    let clone = template.content.cloneNode(true)

    return clone;
}