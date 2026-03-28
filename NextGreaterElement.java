import java.util.*;
public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []result = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int index = -1;
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    index = j;
                    break;
                }
            }
            for(int j = index + 1; j < nums2.length; j++){
                if(nums2[j] > nums1[i]){
                    result[i] = nums2[j];
                    break;
                }
            }

            if(result[i] == 0){
                result[i] = -1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int []nums1 = {2,4};
        int []nums2 = {1,2,3,4};
        int []result = nextGreaterElement(nums1, nums2);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i] + "");
        }
    }
}