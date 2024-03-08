fetch("https://striveschool-api.herokuapp.com/api/product/",{
    headers: {
        'Content-type':'application/json',
        "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViNTNlODJkN2IxMTAwMTkwZTdhMWQiLCJpYXQiOjE3MDk5MjEyNTYsImV4cCI6MTcxMTEzMDg1Nn0.F5UCT97J2pdS3T-JLLFT5h3-4velU_d-kw6CAb_bNUw"
    },

})
.then (res => res.json())
.then (nuovoProdotto => {
    console.log(nuovoProdotto)
    for (let prodotto of nuovoProdotto){

        let card = generaClone()
        

        let title = card.querySelector( ".cardTitle")
        title.innerText ="Nome Prodotto: " + prodotto.name

        let brand = card.querySelector(".cardBrand")
        brand.innerText ="Brand: " + prodotto.brand

        let price = card.querySelector(".cardPrice")
        price.innerText ="Prezzo: " + prodotto.price

        let description = card.querySelector(".cardDescription")
        description.innerText ="Descrizione: " + prodotto.description

        let image = card.querySelector(".card-img-top")
        image.src = prodotto.imageUrl

        let modificaBtn = card.querySelector(".modificaBtn")
        modificaBtn.href = `modifica.html?id=${prodotto._id}` 
    
        document.querySelector("#target").appendChild(card)
    }
    })

function generaClone(){
    
    let template = document.querySelector('#cardTemplate')
    let clone = template.content.cloneNode(true)

    return clone;
}