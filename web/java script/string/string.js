var str="Hello world   "
str.toLowerCase()//it is immutable here so we have to store in variable
console.log(str)

s=str.toLowerCase()
console.log(s)

s1=str.toUpperCase()
console.log(s1)

s2=str.indexOf("w")//it will give the index of w
console.log(s2)

s3=str.includes("or",1)//it will check the value present or not
console.log(s3)

s4=str.substring(1,6)//will give the value between start index and end-1 index
console.log(s4)

s5=str.trim()//it will remove all the spaces from left side and right side but it will not remove middle space
console.log(s5)

s6=str.substr(3,4)//it will start from 3rd index and fetech after 3rd index 4 charater
console.log(s6)
