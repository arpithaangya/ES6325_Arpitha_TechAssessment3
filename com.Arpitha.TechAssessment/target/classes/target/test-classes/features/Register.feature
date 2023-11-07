Feature:  Register page of OpenCart 

Scenario: To register with required Fields 

  	

Given Open Url of OpenCart
When User selects Gender and enters FirstName 

	|gender   |firstname   |
  |Female   |	Apps		   |
  
And User enters Lastname , Email 
	| lastname    |Email 						     |   
  |  Sri		    |abc@gmail.com			   |  


And User enters Pass and Confirm

 | Pass 			   | confirm  |
 |	abc@123		   | abc@123  |
 
And Click on Register

Then User gets registered 

