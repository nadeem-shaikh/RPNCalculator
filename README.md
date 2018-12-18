# RPNCalculator
Reverse Polish Calculator with Undo Functionality

# Solution Overview

Factory Pattern is used which delegates the responsibility of initializing a class to a particular factory class. We have an Operator interface which isimplemented by several operator classes. An OperatorFactory is be used to create and fetch objects.

# Steps to Run
1.  git clone https://github.com/nadeem-shaikh/RPNCalculator.git
2.  cd RPNCalculator
3.  mvn package
4.  java -jar target/RPNCalculator-0.0.1-SNAPSHOT.jar
