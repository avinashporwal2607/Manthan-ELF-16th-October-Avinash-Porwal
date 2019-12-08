// this is my  array of strings of hex colors
var colors = [
    '#ff4f79',
    '#ffb49a',
    '#ffff00',
    '#006666',
    '#7b7554',
    '#17183b',
    '#a11692',
  ];
  // this is my variable to holding present color index
  var presentColor = 0;
  
  /* now i have to  add an event listener to the window - Every time
  so  i can  click in the window, and i will execute the click function */
  window.addEventListener('click', click);
  
  // this is my click function
  function click() {
     /* i need to check if the current color is the last object
      in the array. If it is, i set the value back to 0 (the
      first color in the array. Otherwise, i have to increment the
      current color by 1. */
     
    if (presentColor == colors.length-1) presentColor = 0;
    else presentColor++; 
    //  here now  i can set the body's style - backgroundColor to the new color. 
    document.body.style.backgroundColor = colors[presentColor];
  }
  //    when the window has finished loading, update the body to the first color 
  window.onload = function() {
    document.body.style.backgroundColor = colors[presentColor];
  }
  
  
  