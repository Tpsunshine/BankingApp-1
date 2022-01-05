//Java Program to illustrate a basic approach
//in banking transaction system

package myprojects.com;

public class bankApp1 {
	
	//Initial balance $100
	int total = 100;

	
	/* Money withdrawal method. Withdraw only if total money
	 * is greater than or equal to the money requested for withdrawal
	 */
	
	//Method to withdraw money
	void withdrawn(String name,int withdrawal) {
		
		if (total>= withdrawal) {
			System.out.println(name + " withdrawn " + withdrawal);
			
			total = total - withdrawal;
			System.out.println("Balance after withdrawal: " + total);
			
			//Making the thread to sleep for 1 second after each withdrawal
			try {
				Thread.sleep(1000);
			}
			
			//Catch block to handle the exceptions
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		else {
			System.out.println(name + " you cannot withdraw " + withdrawal);
			
			//Making the thread to sleep for 1 second after each transaction failure
			try {
				Thread.sleep(1000);
			}
			
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	/* Method to deposit money and accept money whenever deposited */
	void deposit(String name, int deposit) {
		
		System.out.println("Balance after deposit: " + total);
		
		//Making the thread to sleep for 1 second after each deposit
		try {
			Thread.sleep(1000);
		}
		
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		/* Declaring an object of bank class and calling the 
		 * withdrawn and deposit methods with suitable parameters
		 */
		bankApp1 obj = new bankApp1();
		
		//Adding Custom input
		obj.withdrawn("John", 20);
		obj.withdrawn("Paul", 30);
		obj.deposit("Mike", 35);
		obj.withdrawn("Sam", 80);
		obj.withdrawn("Annah", 40);

	}

}
