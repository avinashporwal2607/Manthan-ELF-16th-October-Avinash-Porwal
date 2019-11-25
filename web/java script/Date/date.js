//we can send the date to the frontend through date object
var date=new Date()//date is object type here created
console.log("todays date is ",date);//we can use , instead of concat opearator(+)
var date1=new Date(0)
console.log("daate in milisecond"+date1);
var date2=new Date("6 nov");
console.log("date string constructor");
var date3=new Date(1995,5,26)
console.log("date years months constructor"+date3)
var date4=date.getFullYear();
console.log("year is "+date4)
var date5=date.getMonth();
console.log("months is"+date5);
var date6=date.getHours();
console.log("hour is"+date6)
var date7=date.getMinutes();
console.log("minute is"+date7)
var date8=date.getDay();
console.log("day is"+date8)
console.log("*****************************************************")
var months=["jan","feb","march","april","may","june","july","aug","sept","oct","nov","dec"];
var currentmonth=months[date5]
console.log("current month is "+currentmonth);
var days=["sun","mon","tue","wed","thu","fri","sat"];
var currentdays=days[date8]
console.log("current day is "+currentdays)
    var str="10"
    var num=10
    if(str===num)
    {
        console.log("equal")
    }
    else
    {
        console.log("not eqal")
    }
    var age=12
    var voting=age?"eligible":"not eligible"
    console.log(voting)


