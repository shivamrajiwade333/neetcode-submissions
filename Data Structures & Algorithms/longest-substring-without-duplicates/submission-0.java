class Solution {
    public static int lengthOfLongestSubstring(String s ){
        int ans = 0 ; 
        int i = 0 ; 
         int j = 1 ; 
         while(j<s.length()){
            if(s.charAt(i)!= s.charAt(j)){
                j++ ;
            }
            else if (s.charAt(i)==s.charAt(j)){
                 ans = j - i ; 
                i++;
                j++;
            }
           
        }
         int max = Math.max(ans, j-i) ;
         return max ; 
    }
    public static void main(String[] args) {
        String s = "zxyzxyz";
       System.out.println(lengthOfLongestSubstring(s));;
    }
}