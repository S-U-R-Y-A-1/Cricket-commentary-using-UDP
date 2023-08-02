# Cricket-commentary-using-UDP

The following project is used to execute the communication between a server and multiple clients usind UDP protocol
The main java file is the server file which access the score card. Here the score card has been extracted from the website mentioned below :
https://www.espncricinfo.com/

Use the web scraping technique of selecting the required css element by inspecting the webpage.
The web scraping is done by using python and the extracted score card of the overs have been stored into a CSV file.

After completing the procedures mentioned above, now get onto the main java code and access the score card by specifying it's local path.
Several notepad files have been created to store commentaries of different innings, which can be used as a record for the commentaries.

Since the score card has the info on the score of the particular over with the wicket count, for example : "34/2". We have to find the difference between 
