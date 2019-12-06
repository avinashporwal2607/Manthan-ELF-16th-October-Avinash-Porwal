package com.manthan.hotel.main;

import java.util.Scanner;
import java.util.logging.Logger;

import com.manthan.hotel.functions.CustomerFunctions;
import com.manthan.operations.data.OperationOnDatabase;
import com.manthan.user.billing.UserBilling;

public class HotelMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Logger log=Logger.getLogger("mylogger");
		log.info("Hello User, Welcome in This Hotel\n");
		
		log.info("Press 1 to 'show all food items'");
		log.info("Press 2 to 'take order from customers'");
		log.info("Press 3 to 'operate on food items'");
		log.info("Press 4 to 'total bill of the day\n'");
	
		

		log.info("Please Enter Your Choice- ");
		int choice=sc.nextInt();
		
		sc.nextLine();
		
	
		CustomerFunctions cf=new CustomerFunctions();
		OperationOnDatabase opdb=new OperationOnDatabase();
		UserBilling ub=new UserBilling();

		switch (choice) {
		case 1:
			
			cf.showAllFood();
			break;
			
		
		case 2:
			int input=sc.nextInt();
			switch(input)
			{
			case 1:
				System.out.println("press 1 for adding orders");
				System.out.println("press 0 for genrate bills");
				
				
				for(int j=0;j<choice;j++)
					
				{
					if(input==1)
				
					{
						
					System.out.println("order is taking ");
					cf.addFood();
					
				}
				else if (input==0)
				{
					System.out.println("request generate bill");
					ub.userTotalBill();
					break;
				
				}
				}
			}
			
		case 3: 
			log.info("Operations on Hotel Database");
			log.info("Press A to 'Add food item'");
			log.info("Press B to 'remove food item'");
			log.info("Press C to 'modify food item'");
		
			log.info("Please Enter Your Choice : ");
			char input1=sc.next().charAt(0);

			switch (input1) {
			case 'A':
				opdb.addFood();
				break;
			case 'B':
				opdb.removeFood();
				break;
			case 'C':
				opdb.modifyFood();
				break;

			default:
				log.info("Oops! Sorry ,Wrong Choice!!");
				break;
			}

			break;
		case 4: 
			ub.userTotalBill();
			
		
		default:
			log.info("Oops ! Sorry, Wrong Choice!!");
			break;
		}

	}// End of mainMethod
}// End of class HotelMain



