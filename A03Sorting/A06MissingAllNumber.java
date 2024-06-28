import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A06MissingAllNumber
 */
public class A06MissingAllNumber {
    public static void main(String[] args) {
        int[] arr=  {0,2,3,1};
        List<Integer>ans = findDisappearedNumbers(arr);
        System.out.println(Arrays.toString(ans));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0 ;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }

        List <Integer> ans = new ArrayList<>();
        for(int index = 0; index<nums.length; index++){
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }

}