function preventback(){
                        window.history.forward();
                    }
                    setTimeout("preventback()",0);
                    window.onunload = function(){null};
                   