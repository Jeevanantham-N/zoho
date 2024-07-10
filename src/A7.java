
import java.util.Arrays;

public class A7 {
    public String buildArray(int[] nums){
        int[] ans = new int[nums.length];
        for(int i=0; i< nums.length;i++)
            ans[i] = nums[nums[i]];
        return Arrays.toString(ans);
    }

    public static void main(String[] args) {
        A7 a = new A7();
        int[] arr = {0,2,1,5,3,4}; 
        System.out.println(a.buildArray(arr));
    }
}
