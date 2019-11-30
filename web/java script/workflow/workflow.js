function first(callback)
{
    setTimeout (function(){//note setTimeout will execute first here thn callback is here
    console.log(" first function executed")
    callback()
    },0)
    //time is in milisecond
console.log("good morning")
}
function second()
{
    console.log("second function executed")
}
first(second)

