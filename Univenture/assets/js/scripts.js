/*!
* Start Bootstrap - Shop Homepage v5.0.1 (https://startbootstrap.com/template/shop-homepage)
* Copyright 2013-2021 Start Bootstrap
* Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-shop-homepage/blob/master/LICENSE)
*/
// This file is intentionally blank
// Use this file to add JavaScript to your project
function validateForm() {
    var x = document.forms["enrollmentForm"]["fname"].value;
    var lname=document.forms["enrollmentForm"]["lname"].value;
    var numb=document.forms["enrollmentForm"]["numb"].value;
  
    if (x == ""
    || lname == ""
    || numb == ""
    ) 
    {
      alert("All text fields must be filled out");
      return false;
    } else {
      if (numb.length==11){ 
        if(isNaN(numb))
        {
          alert("Invalid Input. Your number format is wrong");
          return false;
        }
      } else if(numb.length!=11)
      {
        alert("Invalid Input. Incomplete/wrong phone number");
        return false;
      } 
    }
  }
  
  
  
  
