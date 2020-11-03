# CaseStudy2_ATM

The code contains 4 classes
1. Solution.java : The program starts executing through the main method in the class , static methods menu(), mainMenu(), and login() are defined here
and they act as interfaces for the user. ArrayList of Bankcustomers is created here.
2. BankCustomer.java : Contains all the attributes of the object BankCustomer like name, balance, accountnumber, pin and setter and getter functions for these variables
3. Tasks.java : This is an interface that has methods to perform the tasks like cash withdraw and deposit, changing pin, displayin data.
4. TasksImplementor : This class implements the interface Tasks.

STEPS to run the program:
The program is a menu driven program ( no GUI ) ,just run the program and perform the tasks using the options provided in the menu.
The program already assumes 10 customers for the bank whose details are provided below
s.no     name        accountnumber     pin    balance
1        Ram           56894         2356     10000
2		     Arun Kumar    89756         4589     29563.29
3		     Rakesh        23589         2020     5123
4		     Geetha        12589         7945     78456
5	     	 Prasad        78945         8945     1000000
6		     Mahesh        32132         5623     0
7    		 Kumar         89564         4512     89466
8		     Chaithanya    12578         1984     49005
9		     Sundar        25793         3287     25000
10   		 Sree kanth    65894         2089     79000
