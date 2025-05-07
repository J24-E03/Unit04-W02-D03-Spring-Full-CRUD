const buttonElement = document.querySelector("#outside")

console.log(buttonElement)

buttonElement.addEventListener("click",()=>{
    console.log("You clicked the button")
})



const inputElement = document.querySelectorAll("input")

console.log(inputElement)


inputElement.forEach((oneInput)=>{
    oneInput.addEventListener("invalid",(e)=>{
        e.preventDefault()

        document.querySelector(`#${oneInput.id}Error`)
        .style.display="block"
       

    })
})