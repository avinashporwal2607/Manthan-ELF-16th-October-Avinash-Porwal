const promise =new Promise(function(resolve,reject)
{
    if(20>10)
    {
        resolve("success")//if it accept the condition pass as data to then other wise else execute and pass data to catch block
    }
    else
    {
        reject("Error")
    }
})
promise.then(function(data)
{
    console.log("data",data)
}).catch(function(Error)
{
    console.log("Error",Error)
})

const personData=new Promise(function(resolve,reject)//Promise is Object 
{
if(20>10)
{
    let data=[10,20,30,40,50]
    resolve(data)
}
else
{
    reject("no data")
}
})

personData.then(function(pdata)
{
    console.log("data",pdata)
    pdata=pdata.push(34,889)
    return pdata
}).then(function(planetdata)
{
console.log("planet data",planetdata)
}).catch(function(Error)
{
    console.log("error",Error)
})
