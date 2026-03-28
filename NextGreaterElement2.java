
public class NextGreaterElement2 {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int []result = new int[n];
        for(int i = 0; i < n; i++){
            result[i] = -1;
        }
        for(int i = 0; i<n; i++){
            int current = nums[i];
            for(int j = 1; j < n; j++){
                int nextIndex = (i + j) % n;
                if(nums[nextIndex] > current){
                    result[i] = nums[nextIndex];
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String []args){
        int []nums = { 5, 7, 1, 7, 6, 0};
        int []result = nextGreaterElements(nums);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i] + " ");
        }
    }
}