let url = new URLSearchParams(location.search)
let id = url.get("id")

fetch(`https://striveschool-api.herokuapp.com/api/product/${id}`,{
    headers:{
        'Content-type':'application/json',
        "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViNTNlODJkN2IxMTAwMTkwZTdhMWQiLCJpYXQiOjE3MDk5MjEyNTYsImV4cCI6MTcxMTEzMDg1Nn0.F5UCT97J2pdS3T-JLLFT5h3-4velU_d-kw6CAb_bNUw"
    },
})

.then(res => res.json())
.then(product => {

    let name = document.querySelector("#name")
    let brand = document.querySelector("#brand")
    let price = document.querySelector("#price")
    let imgUrl = document.querySelector("#imgUrl")
    let description = document.querySelector("#description")

    name.value = product.name
    brand.value = product.brand
    price.value = product.price
    imgUrl.value = product.imageUrl
    description.value = product.description

})

let modificaBtn = document.querySelector(".modificaBtn")
modificaBtn.addEventListener("click", (e) => {
    e.preventDefault()

    let name = document.querySelector("#name").value
    let brand = document.querySelector("#brand").value
    let price = document.querySelector("#price").value
    let imgUrl = document.querySelector("#imgUrl").value
    let description = document.querySelector("#description").value

    let product = {
        name: name,
        description: description,
        brand : brand,
        imageUrl: imgUrl,
        price: price,
    }
    fetch(`https://striveschool-api.herokuapp.com/api/product/${id}`,{
        method:'PUT',
                headers:{
                    'Content-type':'application/json',
                    "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViNTNlODJkN2IxMTAwMTkwZTdhMWQiLCJpYXQiOjE3MDk5MjEyNTYsImV4cCI6MTcxMTEzMDg1Nn0.F5UCT97J2pdS3T-JLLFT5h3-4velU_d-kw6CAb_bNUw"
                },
             body:JSON.stringify(product)
    })
    .then(res => res.json())
    .then(product => {
        location.href ="index.html"
})
})

let eliminaBtn = document.querySelector(".eliminaBtn")
eliminaBtn.addEventListener("click", (e) => {
    e.preventDefault()
    fetch(`https://striveschool-api.herokuapp.com/api/product/${id}`,{
                method:'DELETE',
                headers:{
                    'Content-type':'application/json',
                    "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViNTNlODJkN2IxMTAwMTkwZTdhMWQiLCJpYXQiOjE3MDk5MjEyNTYsImV4cCI6MTcxMTEzMDg1Nn0.F5UCT97J2pdS3T-JLLFT5h3-4velU_d-kw6CAb_bNUw",
                }
            })
            .then(res => res.json())
            .then(res => {
                location.href = 'index.html'
            })
})
