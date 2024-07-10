public class A4 {
    
    public int zoho(int[] A, int target){
        int low =0, high =A.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if (A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }

    public static void main(String[] args) {
        A4 a = new A4();
        int[] nums = {1,3,5,6}; 
        int target=7;
        System.out.println(a.zoho(nums, target));
    }
}
