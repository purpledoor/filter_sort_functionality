# filter_sort_functionality
1. The project was built using Selenium and Java on Eclipse IDE.
2. I understand that the user might be using different kinds of OS while executing the project so I have tried to make it as simple as possible.
3. Only 2 browsers are supported on the project Google Chrome and Mozilla Firefox.
4. All the paths should be complete, i.e., include the filename.
5. Please add the chromedriver path for using Chrome browser or GeckoDriver path for using FireFox browser in the second argument of setProperty method.
6. To install chromedriver on MacOS, execute the below command in terminal - 
                                    brew install chromedriver     
   The resulting driver should be available in /usr/local/bin/chromedriver for use.     
   Execute the below commands in terminal to make sure the chromedriver does not throw any errors while execution -                                     
                                    which chromedriver      
   The result should display the path of the chromedriver. Copy the chromedriver path and execute the following command on the terminal -                                                               xattr -d com.apple.quarantine /usr/local/bin/chromedriver
7. To install geckodriver on MacOS, execute the below command in terminal -                                     
                                    brew install geckodriver    
   The resulting driver should be available in /usr/local/bin/geckodriver for use
8. To use chrome on Windows machine download the required chromdriver.exe according to the chrome version. The same path can be used for automation test execution. Add the path to the second argument of System.setProperty method.
9. To use firefox on Windows machine download the geckodriver.exe. The same path can be used for automation test execution. Add the path to the second argument of System.setProperty method.
10. For the sorting functionality use the text as visible on the site for the criteria due to Selenium's limitations.
11. The screenshot of the final result is saved in the path defined by the user which can later be used as a test artifact.
12. Please add all the Jars attached in this mail to the project as referenced libraries. To add jars Right Click on the project name in Eclipse -> Build Path -> Configure Build Path -> Libraries ->Add External JARs -> Select all the Jars from the file location -> Open -> Apply and Close
