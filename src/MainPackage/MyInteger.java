package MainPackage;

public class MyInteger {
	
	//Create integer data field
	private int value;
	
	//Create integer using "MyInteger" constructor
	public MyInteger(int value){
		this.value = value;
	}
	
	//Create "get...()" method to return the integer value
	int getValue(){
		return value;
	}
	
	//Create "isEven()" method
	public boolean isEven(){
		//Return true if value is even
		if ((this.getValue()%2) == 0){
			return true;
		}
		//Return false if value is odd
		else{
			return false;
		}
		
	}
	
	//Create "isOdd()" method
	public boolean isOdd(){
		//Return true if "value" is odd
		if (this.getValue() == 1){
			return true;
		}
		//Return false if value is even
		else {
			return false;
		}
	}
	
	//Create "isPrime()" method
	public boolean isPrime(){
		//Eliminate the case where "value" is 0
		if (this.getValue() == 0){
			return false;
		}
		//Move on
		else{
			//Establish accumulator and initiate "while" loop
			int a = 1;
			while (a <= Math.ceil(Math.sqrt(this.value))){
				//Return false if a evenly divides "value"
				if ((this.getValue())%a == 0){
					return false;
				}
				//Increment a by 1 if a did not evenly divide value
				else{
					a = a + 1;
				}
			}
			//If "value" passes our prime test, return true
			return true;
			
		}
	}
	
	//Create "isEven(int ...)" method
	public static boolean isEven(int value){
		//Return true if value is even
		if ((value%2) == 0){
			return true;
		}
		//Return false if value is odd
		else{
			return false;
		}
	}
	
	//Create "isOdd(int ...)" method
	public static boolean isOdd(int value){
		//Return true if "value" is odd
		if (value%2 == 1){
			return true;
		}
		//Return false if value is even
		else {
			return false;
		}
	}
	
	//Create "isPrime(int ...)" method
	public static boolean isPrime(int value){
		//Eliminate the case where "value" is 0
		if (value == 0){
			return false;
		}
		//Move on
		else{
		//Establish accumulator and initiate "while" loop
			int a = 1;
			while (a <= Math.ceil(Math.sqrt(value))){
				//Return false if a evenly divides "value"
				if ((value)%a == 0){
					return false;
				}
				//Increment a by 1 if a did not evenly divide value
				else{
					a = a + 1;
				}
			}
			//If "value" passes our prime test, return true
			return true;
		}
	}
	
	//Create "isEven(MyInteger ...)" method
	public static boolean isEven(MyInteger my_int){
		//Return true if "my_int" is even
		if (my_int.getValue()%2 == 0){ 
			return true;
		}
		//Return false if "my_int" is odd
		else{
			return false;
		}
	}
	
	//Create "isOdd(MyInteger ...)" method
	public static boolean isOdd(MyInteger my_int){
		//Return true if "my_int" is even
		if (my_int.getValue()%2 == 1){
			return true;
		}
		//Return false if "my_int" is odd
		else{
			return false;
		}
	}
	
	//Create "isPrime(MyInteger ...)" method
	public static boolean isPrime(MyInteger my_int){
		//Eliminate the case where "value" is 0
		if (my_int.getValue() == 0){
			return false;
		}
		//Move on
		else{
		//Establish accumulator and initiate "while" loop
			int a = 1;
			while (a <= Math.ceil(Math.sqrt( my_int.getValue() ))){
			//Return false if a evenly divides "value"
				if (( my_int.getValue() )%a == 0){
					return false;
				}
				//Increment a by 1 if a did not evenly divide value
				else{
					a = a + 1;
				}
			}
			//If "value" passes our prime test, return true
			return true;
		}
	}
	
	//Create parseInt(char[]) method
	public static int parseInt(char[] array){
		//Create variable "result" to hold value
		int result = 0;
		//Create accumulator 
		int j;
		
		//Loop through each entry in "array"
		for (j = 0; j < array.length; j++){
			//Convert each entry to an integer value
			int i = Integer.valueOf(array[j]);
			//Add value to "result"
			result = result + i;
		}
		/*Return "result" i.e. the integer sum of all character 
		 * entries in "array"
		 */
		return result;		
	}
	
	//Create parseInt(String)
	public static int parseInt(String my_string){
		return Integer.parseInt(my_string);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
