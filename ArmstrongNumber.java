
public class ArmstrongNumber {
	public static void main(String[] args) {
	   System.out.println("Hlo!!");
	   int n=1436;
	   int t=n;
	   int t2=t;
	   int r,a=0,x=0;
	   int count=0;
	   while(n!=0) {
		   r=n % 10;
		   count++;
		   n =n/10;
	   }
	   
        while(t!=0){
        	r = t%10;
        	x=1;
        	for(int i=1;i<=count;i++) {
        		x=x*r;
        	}
        	a = a+x;
	t=t/10;
        }
        if(a==t2) {
        	System.out.println("Given number is Amstrong number");
        }
        else {
        	System.out.println("Given number is Not Amstrong number");
        }
	}

}
