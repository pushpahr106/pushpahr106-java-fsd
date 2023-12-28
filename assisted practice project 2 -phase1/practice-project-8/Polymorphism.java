package assistedPractice;

public class Polymorphism {


	public static void add (int a, int b) {

	int res = a+b; 
	System.out.println(res);
	}
    public static void add (int a,int b,int c) {

	int res = a+b+c; 
	System.out. println (res);

	} 
    public static void main(String[] args){

	add (10, 20);

	add (10, 20,30);
	
	}


}
