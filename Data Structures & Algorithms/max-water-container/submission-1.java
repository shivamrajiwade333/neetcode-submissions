public class Solution {
    public static int maxArea(int arr[]) {
        int b = Integer.MIN_VALUE ; 
        int a = 0 ; 
        for(int i = 0 ; i<arr.length-1 ; i++){
            int c= 1 ; 
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[i]>=arr[j]){
                     a = c  * arr[j];
                     c++;
                    
                }
                else {
                     a = c * arr[i];
                     c++ ; 
                     
                }

                b = Math.max(b, a) ;
            }
        }
        return b ; 
    }
}