package Java;

public class ReverseANumber {
	public static void main(String[] args) {
		  int r,sum=0,temp;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder 454%10=4
		   sum=(sum*10)+r;    //(0*10)+4 =4
		   n=n/10;    		//454/10 =45
		  }    
		  
		  if(temp==sum)    //454=454
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
}
