# Cricket-commentary-using-UDP

The following project is used to execute the communication between a server and multiple clients usind UDP protocol
The main java file is the server file which access the score card. Here the score card has been extracted from the website mentioned below :
https://www.espncricinfo.com/

Use the web scraping technique of selecting the required css element by inspecting the webpage.
The web scraping is done by using python and the extracted score card of the overs have been stored into a CSV file.

After completing the procedures mentioned above, now get onto the main java code and access the score card by specifying it's local path.
Several notepad files have been created to store commentaries of different innings, which can be used as a record for the commentaries.

Since the score card has the info on the score of the particular over with the wicket count, for example : "34/2". We have to find the difference between 
the score and wicket from the current and previous over. At this point, execute all the client files, so that the server can store the port number of all the clients to communication purpose. Generate the random number from 0-3 to send the score to the client ie., 
  
  0 - client 1,  1 - client 2,  2 - client 3,  3 - client 4

Send the score difference by converting it into bytes as a datagram packet to the client. Each client has 9 different testcases with commentaries. There are 36 pre defined commentaries for all 4 clients. 

At each instance, the score would be sent to the client in the mentioned random number. In return, the commentary which satisfies the test case has been chosen and sent to the server as a datagram packet. This process is done every over of the match. The 20th over score difference of the two teams have calculated and which team has the greater score is selected and displayed with the final score difference

In addition, the innings report was also web scrapped from the website and it is displayed too.
