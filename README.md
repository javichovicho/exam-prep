# exam-prep
Question A
A1 You are asked to develop an application to determine the day for servicing a car. The application
prompts the user to enter the service and the branch location (in lowercase letters). Next, the
application computes the day for the car servicing according to the rules from the following table:
Service Branch-Location Day
full    blanchardstown Monday
        stillorgan Tuesday
interim blanchardstown Wednesday
        stillorgan Thursday
pre-nct blanchardstown Friday
        stillorgan Saturday
        
1. Develop an instantiable class for this application which contains:
A class definition
Suitable data members (instance variables)
A constructor
All necessary setter methods to set the details provided by the user
A compute method to determine the day for servicing the car
A getter method to return the day
Name the instantiable class CarServicing.
For example, if the instantiable class receives:
 that the service is "full" and branch location is “stillorgan” then the compute method
should determine that the day is “Tuesday”
 that the service is "pre-nct" and branch location is “blanchardstown” then the compute
method should determine that the day is “Friday”

2. Develop an application that uses an object/ instance of the CarServicing class (the
instantiable class previously developed) to determine the day of servicing a car for an interim
service to be conducted at the stillorgan branch. The application will display the day of the service
on the screen. In the application class, please add a short comment for each method of the
CarServicing class that you use/call in the application to explain why that method is needed.
Name the application class CarServicingApp.

A2 Add a method to the CarServicing (the instantiable class previously developed) which takes in
as a parameter a word. The method produces a new word by applying the next two rules:
 replace the letter 'a' with the character '@'
 do not include the letters 'm', 'n', 'p' and 'r'
The method should return the new word.
For example, if the method takes in
 the word “Java” it should create and return the new word “J@v@”
 the word “program” it should create and return the new word “og@”

Question B
B1 A meteorological consulting company has an application that provides statistics about the
temperature recorded over a period of time at noon. The application prompts the user to enter the
temperature recorded each day for the last 3 weeks. Next the application calculates the average
temperature recorded per week.
1. Develop an instantiable class for this application which contains:
A class definition
Suitable data members (instance variables)
A constructor
A setter method to set the temperature values given by the user
A compute method to calculate the average temperature recorded per week
A getter method to return the average temperature values
 Name the instantiable class Temperature.

 For example, if the instantiable class receives:
 the two-dimensional array with the following values
7 5 6 7 8 3 4
1 4 6 10 3 5 6
-2 -4 0 3 8 7 12
it should compute the average temperatures recorded per week which are {5.7, 5.14, 3.4}.

2. Develop an application that uses an object/ instance of the Temperature class (the
instantiable class previously developed) to determine the average temperature recorded per
week for the last 3 weeks. The application will display the average temperature per week. In
the application class, please add a short comment for each method of the Temperature class
that you use/call in the application to explain why that method is needed.
Name the application class TemperatureApp.
Note: You should not write the code to read the temperature recorded each day for the last 3 weeks.
Instead use a suitable variable to store the next temperatures recorded for the last 3 weeks in your
application:
1 2 3 4 5 6 7
7 6 5 4 3 2 1
1 2 3 4 3 2 1
