package leecode;

public class PlusOne {
	
public int[] plusOne(int[] digits) {
	for(int i = digits.length-1;i>=0;i--){
		if(digits[i]<9){
			digits[i]++;
			return digits;
		}else{
			digits[i]=0;
		}
	}
	
	int[] digits2 = new int[digits.length+1];
	digits2[0] = 1;
	for(int i=1;i<digits2.length;i++){
		digits2[i] = digits[i-1];
	}
	return digits2;
	
	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(('3'-'0' )==3);
	}

}
