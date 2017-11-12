import java.text.NumberFormat;

import presentation.Console;

public class CustomerTypeApp {

    public static void main(String[] args) {
        // display a welcome message
        Console.printToConsole("Welcome to the Customer Type Test application\n");
        CustomerType retail = CustomerType.RETAIL_CUSTOMER;
        CustomerType trade = CustomerType.TRADE_CUSTOMER;
        CustomerType college = CustomerType.COLLEGE_CUSTOMER; 
    	        
        NumberFormat nf = NumberFormat.getPercentInstance();        
        
        String choice = "y"; 
        while (choice.equalsIgnoreCase("y")) {
            // get and display the discount percent for a customer type
            int custType = Console.getInt("Enter customer type (1-Retail, 2-Trade, 3-College):\t", 1, 3);
            //double discPct = 0.0;
            String m = "";
            if (custType == 1) {
            	m = calculateDisountAndBuildDisplayText(custType, retail, nf); 
    		} else if (custType == 2) {
            	m = calculateDisountAndBuildDisplayText(custType, trade, nf);
    		} else if (custType == 3) {
            	m = calculateDisountAndBuildDisplayText(custType, college, nf);
    		}
        	
            // display the value of the toString method of a customer type
    		Console.printToConsole(m);
    		
    		choice = Console.getString("Continue? y/n:\t", "y", "n");
        }
        Console.printToConsole("Bye!\n");
    }

    // a method that accepts a CustomerType enumeration
	public static double discountPercent(CustomerType ct) {
		double d = 0.0;
		if (ct.equals(CustomerType.RETAIL_CUSTOMER)) {
			d = .1;
		} else if (ct.equals(CustomerType.TRADE_CUSTOMER)) {
			d = .3;
		} else if (ct.equals(CustomerType.COLLEGE_CUSTOMER)) {
			d = .2;
		}
		return d;
	}
	
	public static String calculateDisountAndBuildDisplayText(int custType, CustomerType ct, NumberFormat pctNF) {    	double discPct = discountPercent(ct);
    	pctNF.setMinimumFractionDigits(1);
 		return "You entered " + custType + " for " + ct.toString()  + ".\n" + 
               "toString: " + ct.toString() + "\n" + //Returns enumeration for customer type
	    	   "Discount percent: " + pctNF.format(discPct);
	}
	
}