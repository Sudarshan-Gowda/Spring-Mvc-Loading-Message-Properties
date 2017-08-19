# loading-message-properties-thymeleaf-spring
 
 This repository contains example projects for the loading list of message property file and displaying message from loaded property file by using both ThymeLeaf as well as Java.
 
  ## Technology Used
   * Spring 
   * ThymeLeaf
   
 ## Discription Of this Repository
 
 `Step 1`: To load message property by using key which is registered in .property file, we need to use thymeLeaf `th:text="#{key}"` .
            Based on the key ResourceBundleMessageSource will search in list of property file based of preferrerence and it will load the             data/message.
            
 `Step 2`: To load/register/read list of property file , use message-propert.xml file.
 
 `Step 3`: To find key by using Java instead of using thymeleaf also covered in this repository. For detail description go through the                Controoler of this repository.
 
 `Step 4`: Once you maven imported the project, run through server(Ex; Wildfly) and hit the URL
          (EX: http://localhost:8085/loading-message-properties-thymeleaf-spring/) to see the result.
 
 
   If you get any issues regarding this repository feel free to comment.
   
   Thank u guys have a good day.
   
   
   
 
          
 
 
  
  

