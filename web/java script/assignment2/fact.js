
function factorial(num) {
    var result = 1;
    for (var i = 2; i <= num; i++) {
        result *= i;
    }
    return result;
}
console.log(factorial(5))

var f=function factorial(num) {
    var result = 1;
    for (var i = 2; i <= num; i++) {
        result *= i;
    }
    console.log(result)
}
f(7)
console.log("invoke function");//in invoke function we need to put semecolum before make function
(function(num)//semecolumn is necessary
{
    var result = 1;
    for (var i = 2; i <= num; i++) {
        result *= i;
    }
    console.log(result)
})(5)
var fact1=(val1)=>{
    var result = 1;
    for (var i = 2; i <= num; i++) {
        result *= i;
    }
    console.log(result)
}
var i=fact1(5)
console.log(i)
