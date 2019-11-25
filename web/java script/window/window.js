console.log(window)
console.log(this)

console.log(window==this)
var a=10
console.log("with out window"+a)
console.log("with window"+window.a)

function add()
{
    console.log("add mehtod")
}
add()

// this.alert("this site may contain harmful contents")
//var sure=confirm("Are you want to exit")
//console.log("yes sure"+sure)
var age=prompt("enter ur age")
console.log("age is" +age)
