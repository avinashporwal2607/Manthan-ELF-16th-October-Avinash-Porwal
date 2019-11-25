var unorederList=document.createElement("ul")
var list1=document.createElement("li")
var list2=document.createElement("li")
var list3=document.createElement("li")
var list4=document.createElement("li")
list1.textContent="Physics"
list2.textContent="Simulation"
list3.textContent="Graphics"
unorederList.appendChild(list1)
unorederList.appendChild(list2)
unorederList.appendChild(list3)
unorederList.appendChild(list4)

var ul1=document.body.appendChild(unorederList)
console.log(ul1)
var ele=document.getElementById("add")
ele.className="list"
list4.textContent="DBMS"


var ol=document.createElement("ol")
var li1=document.createElement("li")
var li2=document.createElement("li")
var li3=document.createElement("li")
var li4=document.createElement("li")
li1.textContent="BMW"
li2.textContent="Mercedz"
li3.textContent="Ducati"
li4.textContent="ferrari"
ol.appendChild(li1)
ol.appendChild(li2)
ol.appendChild(li3)
ol.appendChild(li4)
document.body.appendChild(ol)
console.log(ol)

// var ul1=`<ul>
//             <li>Pizza</li>
//             <li>burger</li>
//             <li>icecream</li>
//             <li>butter</li>
//         </ul>
// `
// var divele=document.getElementById("list")
// divele.innerHTML=ul1

