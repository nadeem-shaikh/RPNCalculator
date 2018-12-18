# RPNCalculator
Reverse Polish Calculator with Undo Functionality

# Set Up

You will need below tools before you run this application

1.  git - https://git-scm.com/
2.  java version "1.8.0_191" - https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
3.  Apache Maven 3.6.0 - https://maven.apache.org/download.cgi


# Solution Overview

Factory Pattern is used which delegates the responsibility of initializing a class to a particular factory class. We have an Operator interface which isimplemented by several operator classes. An OperatorFactory is be used to create and fetch objects.

# Steps to Run
1.  git clone https://github.com/nadeem-shaikh/RPNCalculator.git
2.  cd RPNCalculator
3.  mvn package
4.  java -jar target/RPNCalculator-0.0.1-SNAPSHOT.jar

# Tests
The Examples in the test are covered in the test cases.

# Possible Improvements
More test cases can be added. For Example test case for each and every invalid operator/character in the input.
