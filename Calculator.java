package realWorld;
import java.util.Scanner;
public class Calculator {
     public static void main(String args[]) {
    	 Scanner ss=new Scanner(System.in);
    	 int[] array=new int[5];
    	 char[] operator=new char[4];
    	 final int answer;
    	 
    	 for(int i=0;i<5;++i) {
    		 System.out.println("Enter a number");
    		 array[i]=ss.nextInt();
    		 
    		 if(i==1) {
    			 
    		 }
    		 
    		 if(i<4) {
    		 System.out.println("Enter a operator");
    		 operator[i]=ss.next().charAt(0);
    		 }
    		
    	 }
    	 
  
    	
    	 
    	ss.close();
     }
}
