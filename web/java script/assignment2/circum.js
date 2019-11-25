function circle(radius)
{
    this.radius = radius;
  
    this.area = function () 
    {
        return Math.PI * this.radius * this.radius;
    };
  
    this.circumference = function ()
    {
        return 2*Math.PI*this.radius;
    };
}
var c = new circle(3);
console.log('Area =', c.area())
console.log('circumference =', c.circumference());

console.log("by with out name function")
var cir=function circle(radius)
{
    this.radius = radius;
  
    this.area = function () 
    {
        return Math.PI * this.radius * this.radius;
    };
  
    this.circumference = function ()
    {
        2*Math.PI*this.radius
    };
}
 cir(3);
