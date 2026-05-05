class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else{
            int rev=0;
            int str=x;
		    while(x!=0){
		        int l=x%10;           
		        rev=rev*10+l;
		        x=x/10;
		    }
            return rev==str;
        }
    }
}
