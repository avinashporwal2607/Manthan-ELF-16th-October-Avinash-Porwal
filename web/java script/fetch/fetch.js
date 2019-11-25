function getData()
{
fetch('https://jsonplaceholder.typicode.com/todos')//it is promising to giving data and we are fetching by fetch method
  .then(response => response.json())
  .then(json => console.log(json))
  .catch(Error=> console.log("Error"))
  
}