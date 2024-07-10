public class A5 {
    public boolean zoho(int[] arr, int n) {
        int count = 0;
        for (int i=0; i< arr.length; i++) {
            if (arr[i] == 0) {
            boolean l = (i == 0) || (arr[i-1] == 0);
            boolean r = (i == arr.length-1) || (arr[i+1] == 0);
            if (l && r) {
                arr[i] = 1;
                count++;
                }
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        A5 a = new A5();
        int[] nm = {1,0,0,0,1};
        int n = 1;
        System.out.println(a.zoho(nm, n));
    }
}