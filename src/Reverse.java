
public class Reverse <T> {

	public void reverseGeneric (T varTemp1) {
		if(varTemp1 instanceof String){	
			System.out.println("Input String:"+varTemp1+". Reversed String : "+ new StringBuffer((String) varTemp1).reverse());
		}
		if(varTemp1 instanceof Integer){
			int reverse =0;
			int input = (Integer) varTemp1;
			while(input != 0){
	            reverse = (reverse*10)+(input%10);
	            input = input/10;
	        }
			System.out.println("\nInput Number:"+varTemp1+". Reversed Number : "+reverse);
		}
	}

	public static void main(String[] args) {
		Reverse<String> objStr = new Reverse<>();
		objStr.reverseGeneric("Captain");
		Reverse<Integer> objInt = new Reverse<>();
		objInt.reverseGeneric(3452);
	}
}
