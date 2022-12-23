package day09;
public class testtt {
	
	public static void main(String[] args) {
        boolean res = sameFirstLast(new int[] {});
        System.out.println(res);
    }

    public static boolean sameFirstLast(int[] nums) {
       if(nums.length==0) {
    	   return false;
       }
        else if(nums[0]==nums[nums.length-1]) {
    		return true;
    	}else {
    		return false;
    	}
    	
    	
    	
    }
	
	    
	    
	
	
		
}
