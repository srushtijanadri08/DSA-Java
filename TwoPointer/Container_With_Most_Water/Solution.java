class Solution {
    public int maxArea(int[] height) {
        int i=0;

        int j=height.length-1;
        
        
        int maxarea=0;
        while(i<j){
           
            int width=j-i;
            int hie=Math.min(height[i],height[j]);
            int area=width*hie;
        
        if(area>maxarea){
            maxarea=area;
        }
        if(height[i]<height[j]){
            i++;
        }else{
            j--;
        }
        }

    return maxarea;

    }
}