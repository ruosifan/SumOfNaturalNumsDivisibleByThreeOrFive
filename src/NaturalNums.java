public class NaturalNums {

	int result = 0;
	
	public boolean isItDivisible(int number){
		
		if(number % 3 == 0 || number % 5 == 0){
			return true;
		} else {
			return false;
		}
		
	}
	
	public int run(int largeNum){
		
		for(int i=0; i<largeNum; i++){
			if(isItDivisible(i)==true){
				result = result + i;
			}
		}
		return result;
		
	}

	public static void main(String[] args){
		
		int largeNum = 1000;
		NaturalNums nn = new NaturalNums();
		System.out.println("Our result is " + nn.run(largeNum));
		
	}
	
}
