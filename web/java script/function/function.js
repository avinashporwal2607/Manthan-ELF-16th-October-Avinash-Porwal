//Named Function apply
console.log("named function__________________________________")
add(10,20)
function add(num1,num2)//var is not require to given for num1 and num2
{
    var sum=num1+num2
    console.log("sum is"+sum)
}


console.log("***************************************anonymous function")

var mul=function(n1,n2)//here function name is not required
{
   var m= n1*n2
    console.log("multiply is"+m)
}
mul(2,4);


console.log("-----------------------------------invoke function");//in invoke function we need to put semecolum before make function
(function(n1,n2)//semecolumn is necessary
{
    sum=n1+n2
    console.log(sum)
})(5,5)

console.log("======================================arrow function")//division is function name here

var division=(val1,val2)=>{
    var div=val1/val2
    console.log(div)
}
var i=division(10,5)
console.log(i)

