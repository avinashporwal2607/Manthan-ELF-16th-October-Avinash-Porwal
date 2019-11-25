// var brands=["bmw","audi","benz"];
// brands.forEach(function(value,index)//i=0 will passs internally in index and give value 0th index as bmw
// {
//     console.log(value)
//     console.log(index)
// })//here parenthesis will close for function
// //we can remove index here also if we dont need index
// var brands=["bmw","audi","benz"];
// brands.push("ferrari")
// console.log("after push the array ==========================================",brands)
// brands.pop();
// console.log("after pop Array brands**************************************",brands)
// var s=brands.pop();
// console.log(s)
// var removelement=brands.shift("porche")//shift for remove first element and return string
// console.log("remove element is++++++++++++++++++++++++++++++++++++++++++++++++",removelement)
// var addelement=brands.unshift("porche")//unshift for add element on first place and return length 
// console.log("add element is===================================================",addelement)
// console.log(brands)
// var join=brands.join("***")
// console.log("before join^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^",brands)
// console.log("after join$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$",join)
// var index=brands.indexOf("audi",0)
// console.log(index)//it will return number
// var brands=["bmw","audi","benz"];
// brands.push("ferrari")
// brands.push("suzuki")
// brands.push("bugati")
// console.log("after push the array ",brands)

// var splice=brands.splice(1,0,"honda","jaguaar")//it modify original array
// console.log("remove elements",splice)
// console.log("brands after splice elements",brands)

// var slice=brands.slice(0)//it will delete from 0th index to end but if u want two parameter then it will by end-1th index
// console.log("remove elements are",slice)
// console.log("after are slice",brands)//no modification in original array

// console.log("filter function for filter the array values")
// var numbers=[100,200,300,400,500]//here internALLY  loop i=0 for 100
// var filternumbers=numbers.filter(function(value,index)
// {
//     if(value>100)
//     {
//     return true
//     }else
//     {
//         return false
//     }
// })
// console.log("filter numbers are "+filternumbers)

// console.log("using arrow function for filter number")
// var num=numbers.filter((value,index)=>value>100)
// console.log("filter number are "+num)

// console.log("map function for add element")
// var number=numbers.map(function(value,index)
// {
//     var val=value+50
//     return val
// })
// console.log("mapped numbers are"+number)

console.log("filter method example")
var items=[{name:"watch",id:1,price:500},{name:"eyeliner",id:2,price:400},{name:"trimmer",id:3,price:557}];
var filter=items.filter(item=>item.price>400)
console.log("filtered items is",filter)
var gst=filter.map(item=>item.price+50)
console.log("after gst price"+gst)
 
// var item=items.map(function(price,index)
// {
//     gst= items.price+50
//     return gst
// })
// console.log(item)

var mapitem=items.map(item=>
    {
       item = item.price+100
       return item
    })
    // console.log("afte map",mapitem)
    // console.log("items",item)

    // var mapItem=item.map(items=>
    //     {
    //         var i={
    //             name=item
    //         }
    //     })



//note: for array use , to see full array 
//note: if you will use +(concat) oprator it will show append message
 

var choclates=["parle","dairy milk","ferrero"]
var nuts=choclates.includes("mango bite")//it will check the value is present in array or not
console.log("nuts are",nuts)
console.log("=======================================")
var isArraychoc=Array.isArray(choclates)//it will check whether your type is array is not
console.log("choclate is array",isArraychoc)