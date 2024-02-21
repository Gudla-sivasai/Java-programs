
public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		  int count=0;
		int i;
		for(i=2; i<=n;  i++){
		   if(n%i==0){
		   count++;
		}
		}
		if(count==1 && n>1 ){
		System.out.println("Prime");
		}
		else{
		System.out.println("not Prime");
		}
	}
}

