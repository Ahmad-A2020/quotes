### Lab: 08 - OO Design and GSON:
in this lab we created an application to read the json file using File class(method readAllBytes to save all data in string type).
After that we created an instance gson of GSON class to use fromJson method that parse the string to object. 
for the object passed in the  aforementioned method, it is created to cover the content of the jason file date including Author name and the test of the quote. 
The next step is generate a random number using nextInt method (we create random instance of Random class to use this method). Finally, we reached the random quote object exist in the array and print the author and test properties.

### Lab: 09 - Web requests: 
in this lab, we had created a new feature, which is make a hit (Request) for online API to get a random quote, and then read it a jason file and convert it using GSON to Java instance. The second step is to write the quote as jason object to the 
Json file. As for lab  08 code , it will used when the response failed to generate and print random quote. 
