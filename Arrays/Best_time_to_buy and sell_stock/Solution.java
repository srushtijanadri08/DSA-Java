class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minprice=prices[0];
        int maxprofit=0;
        for(int i=0;i<n;i++){
            int currentprice=prices[i];
            if(currentprice < minprice){
                minprice=currentprice;
            }else{
                int profit=currentprice-minprice;
    
            
            if(profit>maxprofit){
                maxprofit=profit;
            }
            }
        }
    
    return maxprofit;    
        
    }
}
