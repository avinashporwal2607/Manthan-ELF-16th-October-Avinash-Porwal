class person
{
    constructor(name,age)
    {
        this.name=name
        this.age=age
    }
    getName()
    {
       return this.name
    }
}
const person1=new person("anushka",34)
const person2=new person("deepika",32)
console.log("person 1 name is",person1.name)
let pname=person2.getName()
console.log("person2 name",pname)
console.log("================inheriting concept=================")

class teacher extends person
{
    constructor(name,age,subject)
    {
    super(name,age)
    this.subject=subject
    }
    getSubject()
    {
        return this.subject
    }
}
const tea=new teacher("shubam",25,"physics")
console.log("teacher subject is",tea.subject)
const teach=tea.getSubject()
const per=tea.getName()

console.log("detail is",teach)

console.log("person 2 name",pname)
console.log("person 2 name",per)


