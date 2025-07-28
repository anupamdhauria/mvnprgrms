This repository is all about maven project from cmd

life cycle of maven is:
1. clean(3 phases)
2. default(23 phases)
3. site(4 phases)

Command
=======
a. mvn package
>» Generates jar files in target folder having <projectname>-ver. jar file
b. mvn clean
» Cleans the project .. deletes target folder
c. mvn clean package
» Cleans the project and also creates jar file with latest code
d. mvn compile
>> compile the project code and generate the .class file in target folder.
