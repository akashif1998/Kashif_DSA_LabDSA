package balanceBrackets;

public class Client {
public static void main(String[] args) {
	Balance balance = new Balance();
	boolean value = balance.isBalanced("([{}])");
	if(value) {
		System.out.println("This is Balanced String");
	}else {
		System.out.println("Not Balanced String");
	}
}
}
