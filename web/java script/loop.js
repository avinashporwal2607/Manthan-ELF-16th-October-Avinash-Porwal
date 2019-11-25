var fruits=[
    "apple","plum","pinaple","blackberry"
];

//for of loo[]
for( f of fruits)//note:in forof loop here no colon should come after f
{
    console.log(f)
}
//for in loop
for(var i in fruits)
{
    console.log(i)//return index
    console.log(fruits[i])//return value
}
console.log("====================")
//accessing detail employee object by for in loop
var emp=
{
name:"avi",
age:24,
color:"white",
hobbies:["travell","cricket"]
}

for(i in emp)
{
    console.log(emp[i])
}

var fruits={
    name:"apple",
    taste:"sweet",
    price:240,
    breed:["kashmir","himachal"]
}
for(i in fruits)
{
console.log(fruits[i])
}