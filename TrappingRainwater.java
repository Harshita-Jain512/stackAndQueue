public class TrappingRainwater {
    public static int find(int []arr){
        int totalWater = 0;
        for(int i = 0; i < arr.length; i++){
            int maxLeft = 0;
            int maxRight = 0;
            for(int j = 0; j <= i; j++){
                if(arr[j] > maxLeft){
                    maxLeft = arr[j];
                }
            }
            for(int j = i; j < arr.length; j++){
                if(arr[j] > maxRight){
                    maxRight = arr[j];
                }
            }
               totalWater += Math.min(maxLeft, maxRight) - arr[i];
        }
        return totalWater;
    }
    public static void main(String[] args) {
        int []arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(find(arr));
    }
}
