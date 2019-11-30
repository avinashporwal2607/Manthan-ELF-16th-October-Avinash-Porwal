// let cre=document.createElement('h1')//here we give as global variable so it will calll only once insid ethe function
// function greet(msg)
// {
// let name="how are you?"
// //alert(msg+" "+name)
// //alert(`${msg} ${name}`)//treat as always expression
// console.log(`${2+2}`)//treat as expression will give 4 
// console.log("2+2")

// }
// function changeFont()
// {
//     let element=document.getElementById("test")
//     element.style.fontSize="50px"
// }
// function changeFontToOld()
// {
//     let element=document.getElementById("test")
//     element.style.fontSize="10px"
// }
// function showData()
// {
//     console.log("key pressed ")
// }
// function showData()
// {
//     console.log("key released ")
// }

// function showElement()
// {
   
//     cre.textContent="create h1 heading"
//     document.body.appendChild(cre)
// }

var ele=document.getElementById("click")
ele.onclick=function()
{
    
    var head = document.createElement("h1")
       head.textContent="create heading here now "
       document.body.appendChild(head)
       var ele=document.getElementById("heading")
        ele.className="event"

    // ele.addEventListener('click',function(){
    //     alert("cliked already done")
    // })
}
