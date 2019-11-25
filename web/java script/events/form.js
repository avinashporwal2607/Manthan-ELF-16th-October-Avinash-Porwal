function validateForm()
{
     
    let usernameEle=document.forms['mylogin']['username']
    let passwordEle=document.forms['mylogin']['password']
    if(usernameEle.value.trim().length>5)//trim here will not save space 
    {
        let pEle=document.getElementById("pele")
        pEle.style.display="none"
        
    }
    else{
        let pEle=document.getElementById("pele")
        pEle.style.display="block"

        //alert("fill the form")
        
    }
    if( passwordEle.value.trim().length>5)
    {
        let pwd=document.getElementById("pwd")
        pwd.style.display="none"
    }
    else{
        let pwd=document.getElementById("pwd")
        pwd.style.display="block"
    }
    if(usernameEle.value.trim().length>5 && passwordEle.value.trim().length>5)
    {
        alert("data saved succesfully")
    
        return true
    }
    else
    {
        return false
    }

    //console.log(login)
    // if(20>10)
    // {
    //     return false
    // }
    // else{
    //    return true
    // }
}