class Solution {
    public static  int[] productExceptSelf(int nums[]) {
        int ans = 1 ; 
        int arr[] = new int[nums.length] ;
        for(int i = 0 ; i<nums.length  ; i++){
            ans *= nums[i] ;
        }
        for(int i = 0 ; i<nums.length ; i++){
            arr[i] = ans / nums[i]; 
        }
         for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
         }
         return  arr ; 
    }

}