package lockerProject;
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {

		 	System.out.println("****************************************************************"); 
	        System.out.println("Welcome to Locker.com Project ");
	        System.out.println("****************************************************************"); 
	        System.out.println("By Rishav Ranjan");
	        System.out.println("****************************************************************"); 
	        
	 Scanner sc=new Scanner(System.in);
	        Features.mainMenu();
	        while(true) {            
	                try {	        	
	              int option=sc.nextInt();
	              switch(option) {
	                case 1 :
	                    System.out.println("|---      files in ascending        ---|");
	                    Features.listingFile();
	                    break;
	                    
	                case 2 :
	                	Features.fileMenuOperations();
	                	break;
	                    
	                case 3 :
	                   System.out.println("|---       Application closed        ---|");

	                   System.exit(option);
	                    break;
	                default:
	                    System.out.println(" Enter valid number ");
	                    break;

	            }
	        }catch(Exception e){
	          System.out.println(" Enter valid number ");
	          main(args);
	        }
	                
	        }
	 }
}
