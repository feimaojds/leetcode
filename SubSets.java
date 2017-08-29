package leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {

	public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        
        Arrays.sort(S);
        for(int i : S) {
        	System.out.println(res.size());
            List<List<Integer>> tmp = new ArrayList<>();
            for(List<Integer> sub : res) {
                List<Integer> a = new ArrayList<>(sub);
                a.add(i);
                tmp.add(a);
            }
            res.addAll(tmp);
            System.out.println(res.size());
         
        }
        System.out.println(res.size());
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[]{1,2,3};
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(1,2,3));
		//System.out.println(li.size());
		
		new SubSets().subsets(a);
	}

}
