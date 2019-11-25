//it is object creation with curly braces
var person={
fname:"avinash",
lname:"porwal",
age:24,
email:"aviporwal2607@gmail.com",
eat:function()
{
    console.log("eating butter")
},
getfullname:function()
{
    return this.fname+" " +this.lname;
}
}
var firstname=person.fname;
var lastname=person.lname;
var age1=person.age;
var email1=person.email;
person.eat();
person.getfullname();
var fullname=person.getfullname();
console.log("first name is "+firstname);
console.log("last name is "+lastname);
console.log("age is "+age1);
console.log("email is "+email1);
console.log(fullname)

