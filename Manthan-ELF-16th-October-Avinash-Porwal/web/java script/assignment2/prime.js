function test_prime(n)
{

  if (n===1)
  {
    console.log("false")
  }
  else if(n === 2)
  {
    console.log("true")
  
  }else
  {
    for(var x = 2; x < n; x++)
    {
      if(n % x === 0)
      {
        console.log("false");
      }
    }
    console.log("true")
  }
}

console.log(test_prime(37))
console.log("function is with out name")
var number=function test_prime(n)
{

  if (n===1)
  {
    console.log("false")
  }
  else if(n === 2)
  {
    console.log("true")
  
  }else
  {
    for(var x = 2; x < n; x++)
    {
      if(n % x === 0)
      {
        console.log("false");
      }
    }
    console.log("true")
  }
}
number(23)
console.log("invoke fuction");
((function))

