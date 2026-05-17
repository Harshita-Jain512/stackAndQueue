public class Celebrity_Problem{

    public static int findCelebrity(int [][]arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            boolean rowCheck = true;
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 1){
                    rowCheck = false;
                    break;
                }
            }
            if(!rowCheck){
                continue;
            }
            boolean colCheck = true;
            for(int z = 0; z < n; z++){
                if(arr[z][i] == 0 && z!=i){
                    colCheck = false;
                    break;
                }
            }

            if(colCheck){
                return i;
            }
        }
            
        return -1;
    }
    public static void main(String[] args){
        int [][] arr = {{0, 1},
    {1,0},
};
System.out.println(findCelebrity(arr));
    }
}