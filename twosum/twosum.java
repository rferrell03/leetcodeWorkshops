import java.util.HashMap;

public class twosum{

    public static void main(String[] args){
        int[] in = {2,7,11,15};
        int[] solution = twoSum(in,9);
        int[] solution2 = twoSumEfficient(in,9);



        System.out.println("[" + solution[0] + " , " + solution[1] + "]");       
        System.out.println("[" + solution2[0] + " , " + solution2[1] + "]");


        
    }

    //Brute force solution
    public static int[] twoSum(int[] nums, int target){
        
        for(int i = 0; i < nums.length; i++){
            int a = nums[i];
            for(int j = 0; j < nums.length; j++){
                int b = nums[j];
                if(a + b == target){
                    int[] out = {i,j};
                    return out;
                }
            }
        }


        return null;
    }



    public static int[] twoSumEfficient(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int a = nums[i];
            map.put(a,i);
        }

        for(int i = 0; i < nums.length; i++){
            int tmp = target - nums[i];

            if(map.containsKey(tmp) && map.get(tmp) != i){
                return new int[]{i,map.get(tmp)};
            }
        }




        return new int[]{0,0};
    }
}
