function getData(){
  tsr=""
  for(i=1;i<5;i++){
    fetch('https://jsonplaceholder.typicode.com/todos/'+i)
    .then(response=>response.json())
    .then(json=>{
      per=json
      tsr=tsr+"<tr style='border: blue 1px solid;'>"
      for(x in per){
        console.log(per[x],x)
        
        tsr=tsr+"<td style='border: blue 1px solid;'>"+per[x]+"</td>"
      }
      console.log("----------")
      tsr=tsr+"</tr>"
      document.getElementById("tb").innerHTML=tsr
    })
    .catch(err=>console.log(err))
  }
}