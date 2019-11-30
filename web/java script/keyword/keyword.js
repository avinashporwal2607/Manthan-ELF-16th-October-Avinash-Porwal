// var a;
// var b=10
// var a=20
// console.log(a)
// console.log(b)

// if(10<20)
// {
//     var d=54
//     console.log("inside block d is",d)
// }
// console.log("out side block d is",d)//so here var can use out side the block also

// for(var i=0;i<3;i++)
// {
//     var f=89
//     console.log("f value inside loop",f)
// }
// console.log("f value outside the loop",f)

//***********************************let keyword********************* */
// let c=22
// let b1=45
// //let c=56 we can not re declare here c again but we can re initialise
// console.log("c value",c)
// console.log("b value is",b1)
// console.log("redeclare",c)
// c=65;
// console.log(c)
// if(10<20)
// {
//     let to=22
//     console.log("inside the  block",to)
// }
// console.log("out side the block",to)// so let keyword can not use outside the block

const x=45 //we have to assign value here
console.log(x)
//x=89                  //we can not re initialize it again
//console.log(x)
if(10<20)
{
    const one=32
    console.log("inside the block scope",one)
}
//console.log("out side the block scope",one) //we can not use const keyword out side the block
const arr=[10,20,30]
arr.push(39)
console.log("we can modify the array for const keyword",arr)

//note: always try to use "let" and "const" keyword