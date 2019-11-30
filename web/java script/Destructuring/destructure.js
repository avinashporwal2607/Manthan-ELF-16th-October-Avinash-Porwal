var person={
    name: "avinash",
    age :24,
    hobbies:["cricket","travell","surfing"]

}
let{name,hobbies}=person//it will return only those values which ever key passed and key shoud same
console.log("hobbies",hobbies)
console.log("name",name)

dispalyName(person)
function dispalyName({name,hobbies})
{
    console.log("hobbies",hobbies)
    console.log("name",name)
}
