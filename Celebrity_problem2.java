public class Celebrity_problem2 {
    public static int findCelebrity(int [][]arr){
        int top = 0;
        int bottom = arr.length - 1;
        while(top < bottom){
            if(arr[top][bottom] == 1){
                top++;
            }else if(arr[bottom][top] == 1){
                bottom--;
            }else{
                top ++;
                bottom--;
            }
        }
        if(top > bottom){
            return -1;
        }else{
            for(int i = 0; i < arr.length; i++){
                if(arr[top][i] == 0 && arr[i][top] == 1 && i != top){
                    return top;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int [][] arr =  {
         {0, 1, 1, 0}, 
         {0, 0, 0, 0}, 
         {1, 1, 0, 0}, 
         {0, 1, 1, 0}
    };
System.out.println(findCelebrity(arr));
    }
}
