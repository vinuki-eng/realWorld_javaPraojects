package realWorld;
import java.util.Scanner;
public class LoanService {
	public static Scanner ss=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Press #170# to get a loan");
		
		String code=ss.nextLine();
		
		if(code=="#170#" ) {
		
		    Common.mainMassages();

		}else {
			System.out.println(Invalid.invalid);
			
		}
	}
}


class Common{
    // Common use cases
	public static String[] commonArr = {
			"Back",
			"Exit",
	};
	
	public static String[] loanValues= {
			"512MB(Anytime)",
			"1.1GB(Anytime)",
			"1.5GB(Anytime)",
	};
	
	public static String thanking="Thank You";
	
	public static String validity14="Validity 14 days";
	
	public static String validity7="Validity 7 days";
	
	public static String tax="+TAX";
	
	public static String processingFee="Processing fee Rs.";
	
	public static String activation="You have subscribed to the feature successfully";
	
	public static String balanceError="Your account balance should be less than Rs.5 to enjoy this service";
	
	public static String unpaidLoan="Sorry, You have to pay the credit first";
	
	public static String timeDuration="You have to be connected with Mobitel for more tvaluehan 6 months to enjoy this Data Loan Value.Please try a lesser loan ";
	
	static void mainMassages() {
		
		// Creating Objects for each class
		
		CheckBalance cb=new CheckBalance();
		AnytimeData ad=new AnytimeData();
		UnlimitedCombo uc=new UnlimitedCombo();
		SocialMediaCombo smc=new SocialMediaCombo();
		AviatorHDPlan ap=new AviatorHDPlan();
		UnlimitedSocialMedia usm=new UnlimitedSocialMedia();
		DataLoan dl=new DataLoan();
		SpecialOffers so=new SpecialOffers();
		Other oo=new Other();
		Common cc=new Common();

	    String[] mainMassages= {
			"Check Balance",
			"Anytime Data",
			"Unlimited Combo",
			"Social Media Combo",
			"Aviator HD Plan",
			"Unlimited Social Media",
			"Data Loan",
			"Special Offers",
			"Other",
	   };
	
		   for(int i=1;i<=9;++i) {
			  System.out.println(i+". "+mainMassages[i-1]);
		   }
	   
	   
	   int firstNum=LoanService.ss.nextInt();
		
		switch(firstNum) {
		   case 1:
			   break;
		   case 2:
			   break;
		   case 3:
			   
		   case 4:
			   break; 
		   case 5:
			   break; 
		   case 6:
			   break;	
		   case 7:
			   dl.loanOptions();
			   break; 
		   case 8:
			   break;
		   case 9:
			   break;
		  default:
			  System.out.println(Invalid.invalid);
			  break;
		}
	 }
	
	void dataPacDetails() {
		
	}
	
}


class CheckBalance{
	
}

class AnytimeData{
	
}

class UnlimitedCombo{
	
}

class SocialMediaCombo{
	
}

class AviatorHDPlan{
	
}

class UnlimitedSocialMedia{
	
}

class DataLoan{
	
	int secondNum;
    
	// Showing Data Loan Options
	void loanOptions() {
		String [] loanOptions={
				"  Rs.58",
				"  Rs.118",
				"Data and Voice - Rs.129",
				" Rs.159",
		};
		
		for(int l=1;l<=6;++l) {
			if(l<5) {
				
					System.out.println(l+". "+Common.loanValues[l-1]+" -"+loanOptions[l-1]);
				
			}else {
				switch(l) {
				  case 5:
					 System.out.println(l+". "+Common.commonArr[0]);
					 break; 
					
			     case 6:
			    	 System.out.println(l+". "+Common.commonArr[1]);
				   break;
				   
				 default:
					 System.out.println(Invalid.invalid);
			   }
				
			}
		}
		// Getting second user input
	     secondNum=LoanService.ss.nextInt();
		if(secondNum<5) {
			loanChoice();
		}else {
			switch(secondNum) {
			case 5:
				Common.mainMassages();
				break;
				
			case 6:
				System.out.println(Common.thanking);
				break;
				
			default:
				System.out.println(Invalid.invalid);
				break;
			}
		}
	}
	
	
	// Confirming Data Loan
	void loanChoice() {
		String [] loanChoice={
				"Information",
				"Activate",
		};
		
		for(int j=1;j<=4;++j) {
			if(j<3) {
				System.out.println(j+" "+loanChoice[j-1]);
			}else {
				switch(j) {
				  case 3:
					 System.out.println(j+". "+Common.commonArr[0]);
					 break; 
					
			     case 4:
			    	 System.out.println(j+". "+Common.commonArr[1]);
				   break;
				   
				 default:
					 System.out.println(Invalid.invalid);
			   }
			}
		}
		
		// Getting third user input
		int thirdNum=LoanService.ss.nextInt();
		if(thirdNum<3) {
			switch(thirdNum) {
			  case 1:
				  switch(secondNum) {
				    case 1:
				    	 System.out.println(Common.loanValues[0]+", "+Common.validity7+", "+Common.processingFee+"5.00"+Common.tax);
				    	break;
				    case 2:
				    	 System.out.println(Common.loanValues[1]+", "+Common.validity14+", "+Common.processingFee+"7.00"+Common.tax);
				    	break;
				    case 3:
				    	 System.out.println(Common.loanValues[2]+", "+Common.validity14+", "+Common.processingFee+"7.00"+Common.tax);
				    	break;
				    case 4:
				    	 System.out.println(Common.loanValues[2]+", "+Common.validity14+", "+Common.processingFee+"13.00"+Common.tax);
				    	break;
				    default:
				    	System.out.println(Invalid.invalid);
				    	break;
				  }
				  
				  for(int k=1;k<3;++k) {
					  System.out.println(k+". "+Common.commonArr[k-1]);
				  }
				  break;
				  
			  case 2:
				  if(Balance.balance<5 && Balance.isUnpaidLoanBalance==false && Balance.duration>6) {
					  System.out.println(Common.activation);
				  }else if(Balance.balance>5){
					  System.out.println(Common.balanceError);
				  }else if(Balance.isUnpaidLoanBalance == true) {
					  System.out.println(Common.unpaidLoan);
				  }else if(Balance.duration<6) {
					  System.out.println(Common.timeDuration);
				  }else {
					 System.out.println("An Unknown Error Occured");
				  }
				  break;
				  
			  default:
				  System.out.println(Invalid.invalid);
				  break;
			}
				
		}else {
			switch(thirdNum) {
			case 3:
				Common.mainMassages();
				break;
				
			case 4:
				System.out.println(Common.thanking);
				break;
				
			default:
				System.out.println(Invalid.invalid);
				break;
			}
		}
		
		//Getting forth user input
		int forthNum=LoanService.ss.nextInt();
		if(thirdNum==1) {
			switch(forthNum) {
			 case 1:
				 Common.mainMassages();
				 break;
			 case 2:
				 System.out.println(Common.thanking);
				 break;
			 default:
				 System.out.println(Invalid.invalid);
				 break;
			}
		}
	}
	
}


class SpecialOffers{
	void offerValidity() {
	  for(int i=0;i<3;++i) {
	      if(Balance.month==Balance.offersMonth[i]) {
			System.out.println("");
		  }else {
			  System.out.println("Sorry,No Special offers available for you at the moment.");  
			  for(int j=1;j<3;++j) {
				  System.out.println(j+". "+Common.commonArr[j-1]);
			  }
			  int fifthNum=LoanService.ss.nextInt();
			  switch(fifthNum) {
			    case 1:
			    	Common.mainMassages();
			    	break;
			    case 2:
			    	 System.out.println(Common.thanking);
			    	break;
			    default:
			    	System.out.println(Invalid.invalid);
			    	break;
			  }
		  }
	  }
	}
}


class Other{
	
}


 class Balance{
	 public static final double balance=3.0;
	 public static final boolean isUnpaidLoanBalance=false;
	 public static final double duration=7;
	 public static final String month="February";
	 public static String[] offersMonth= {
			 "January",
			 "April",
			 "December",
	 };
	 
 }
 
 
 class Invalid{
	 // Invalid Cases
	 public static String invalid="System Error or Invalid Code/Number";
 }
 
 