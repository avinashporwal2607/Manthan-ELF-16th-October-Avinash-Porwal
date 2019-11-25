const person=
{
    name: "sundari",
    age:33,
    weight:60,
    hobbies:["music","singing"]


}
const JSONObject=JSON.stringify(person)//it will convert js object to JSON object
console.log("JSON object is ",JSONObject)
const jsObject=JSON.parse(JSONObject)//it will convert JSON OBJECT convert to js object
console.log("java script object is",jsObject)