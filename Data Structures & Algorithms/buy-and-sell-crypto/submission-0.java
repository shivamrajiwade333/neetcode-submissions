class Solution {
    public int maxProfit(int[] prices) {
        int curr = 0 ; 
        int max = 0 ; 
        int i = 0 ;
        int j = prices.length-1 ; 
        while(j>i){
            curr = prices[j] - prices[i]  ; 
            max = Math.max(max,curr);
            i++ ; 
            j-- ; 
        }
        return max ; 
    }
}
