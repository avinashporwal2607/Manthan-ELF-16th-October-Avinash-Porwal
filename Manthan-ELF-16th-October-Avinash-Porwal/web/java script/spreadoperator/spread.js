var person=[
{  
     id:2,
    name:"rahul",
    age:24

    
},
{
    id:5,
    name:"avi",
    age:23
}
]

person[0].id=10
console.log("after modification person object",person)

var details={...person[0]}//it will effect on main detail of object
console.log("0th detail",details)
details.id=25
console.log("details",person)
console.log("details 0th",details)
console.log("details",person)

var address={
    add:"btm",
    city:"bangalore"
}

var details={...person,...address}//it will combine properties of both object but will not effect on individual object
console.log(details)
//note : we can use spread operator for array also


console.log("============================================")
function sum(...args)//it will take more than one arguments and we can not write any thing after args
{
    let value=0;
    for(let i=0;i<args.length;i++)
    {
        value=value+args[i]
        console.log(value)
    }
}
sum(25,247)