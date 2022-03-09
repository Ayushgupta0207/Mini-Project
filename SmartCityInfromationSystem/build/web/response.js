function getBotResponse(input) {
    if (input == "hello") {
        return " are you ?.User/Tourist (yes/no) ";
    } else if (input == "yes") {
        return  "are you looking for<br>2.Bank<br>3.Hotels<br>4.Tourist Places<br>5.Universities<br>press '2','3','4' or '5'";
    } else if (input == "bank" || input=="2" || input=="Bank") {
        return "6.In which City ?<br>7.About us<br>8.Contact Us<br> press '6','7' or '8'";                                                   
    } else if(input == "Hotels" || input=="3" || input=="hotels") {
        return "6.In which City ?<br>7.About us<br>8.Contact Us<br> press '6','7' or '8'"; 
    }  else if(input == "Tourist Places" || input=="4" || input=="tourist places") {
        return "6.In which City ?<br>7.About us<br>8.Contact Us<br> press '6','7' or '8'";
    }
    else if(input == "Universities" || input=="5" || input=="universities") {
        return "6.In which City ?<br>7.About us<br>8.Contact Us<br>press '6','7' or '8'";
    } else if (input == "" || input=="6"){
        return "9.Agra<br>10.Mathura<br>11.Delhi<br>12.Hyderabad<br>13.Mumbai<br>press '9','10','11','12' or '13'";
    }else if(input=="agra" || input =="9" || input=="Agra"){
        return "14.View Agra Maps<br>15. View Agra Details<br>press '14' or '15'";
    }
    else if(input=="mathura" || input=="10" || input=="Mathura"){
        return "16.View Mathura Maps<br>17. View Mathura Details<br>press '16' or '17'";
    }
    else if(input=="delhi" || input=="11" || input=="Delhi"){
        return "18.View Delhi Maps<br>19. View Delhi Details<br>press '18' or '19'";
    }
    else if(input=="hyderabad" || input=="12" || input=="Hyderabad"){
        return "20.View Hyderabad Maps<br>21. View Hyderabad Details<br>press '20' or '21'";
    }
    else if(input=="mumbai" || input=="13" || input=="Mumbai"){
        return "22.View Mumbai Maps<br>21. View Mumbai Details<br>press '22' or '23'";
    }
    
    else if(input=="" || input=="14" || input=="View Agra Maps"){
        return "Go to View Map link, select the city and see the map.<hr>"
    }
    else if(input=="" || input=="15" || input=="View Agra Details"){
        return "Go to all cities link ,select the city and see the details which you want.<hr>"
        
    }
    else if(input=="" || input=="16" || input=="View Mathura Maps"){
        return "Go to View Map link, select the city and see the map.<hr>"
    }
    else if(input=="" || input=="17" || input=="View Mathura Details"){
        return "Go to all cities link ,select the city and see the details which you want.<hr>"
        
    }
    else if(input=="" || input=="18" || input=="View Delhi Maps"){
        return "Go to View Map link, select the city and see the map.<hr>"
    }
    else if(input=="" || input=="19" || input=="View Delhi Details"){
        return "Go to all cities link ,select the city and see the details which you want.<hr>"
        
    }
    else if(input=="" || input=="20" || input=="View Hyderabad Maps"){
        return "Go to View Map link, select the city and see the map.<hr>"
    }
    else if(input=="" || input=="21" || input=="View Hyderabad Details"){
        return "Go to all cities link ,select the city and see the details which you want.<hr>"
    }
    else if(input=="" || input=="22" || input=="View Mumbai Maps"){
        
        return "Go to View Map link, select the city and see the map.<hr>"
        
    }
    else if(input=="" || input=="23" || input=="View Mumbai Details"){
        
        return "Go to all cities link ,select the city and see the details which you want.<hr>"
        
    }

    
    if (input == "hyy") {
        return "how are you sir! What's yours problem Kindly Mention Your problem";
    } else if (input == "goodbye") {
        return "Talk to you later!";
    } else {
        return "Try asking something else!";
    }
}