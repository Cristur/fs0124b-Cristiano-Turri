let saveBtn = document.querySelector(".saveBtn")

saveBtn.addEventListener("click",(e) => {
    e.preventDefault()

    let name = document.querySelector("#name").value
    let brand = document.querySelector("#brand").value
    let price = document.querySelector("#price").value
    let imgUrl = document.querySelector("#imgUrl").value
    let description = document.querySelector("#description").value
    
    let newProduct = {
        name: name,
        description: description,
        brand : brand,
        imageUrl: imgUrl,
        price: price,
    }
    fetch('https://striveschool-api.herokuapp.com/api/product/', {

    method: 'POST',
    headers: {
        'Content-Type': 'application/json',
        "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViNTNlODJkN2IxMTAwMTkwZTdhMWQiLCJpYXQiOjE3MDk5MjEyNTYsImV4cCI6MTcxMTEzMDg1Nn0.F5UCT97J2pdS3T-JLLFT5h3-4velU_d-kw6CAb_bNUw"
    },
    body: JSON.stringify(newProduct),
})

.then(res => res.json())
.then(res => {

    location.href = 'index.html'
})






})