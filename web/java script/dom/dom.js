// var element=document.getElementById("demo")
// console.log(element)
// var c=element.textContent
// console.log("text of paragraph p",c)
// var change =element.textContent="good night"
// console.log("content change",change)

// var doc=document.querySelector("#demo")
// console.log(doc)
// var cont= doc.textContent="bye bye"
// console.log(cont)

// var tes=document.getElementsByClassName("test")//return in array format with one element
// console.log(tes)
// tes[0].style.color="red"
// doc.style.fontSize="80px"
// doc.style.color="green"



// var qelement=document.querySelectorAll(".test")//return in array format with all element but we ahve to write specific code for other element
// qelement[1].style.color="blue"
// qelement[1].style.fontSize="80px"


// qelement[2].style.color="blue"
// qelement[2].style.fontSize="80px"


var b=document.createElement("button")
b.textContent="click me!"
document.body.appendChild(b)//to add content in body
var add=document.createElement("p")
add.textContent="i m last child"
document.body.appendChild(add)//it  for append in last

document.write("hiii i dom")//for printing anything on DOM use this 
var ele=document.getElementById("add")
 ele.className="xyz"
//ele.classList="abc xyz"





