package leecode;

public class SQRT {
public int mySqrt(int x) {
	    
	if(x==0) return 0;
    int left = 1;
    int right = Integer.MAX_VALUE;
    while(true){
    	int mid = left+(right-left)/2;
    	System.out.println(mid+" "+left+" "+right);
    	if(mid>x/mid){
    		right=mid-1;
    	}else{
    		if((mid+1)>x/(mid+1)) return mid;
    		left=mid+1;
    	}
    }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(10/3);
		int a = 2;
		System.out.println(new SQRT().mySqrt(a));
	}

}
