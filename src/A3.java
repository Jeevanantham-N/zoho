public class A3 {
    public boolean zoho(int[] arr) {
        if(arr.length < 3) return false;
        int l=0;
        int r=arr.length-1;
        while(l+1< arr.length - 1 && arr[l] < arr[l+ 1]){l++; } 
        while(r- l>0 && arr[r] < arr[r-1]) {r--;}
        return l == r;
    }

    public static void main(String[] args) {
        A3 a = new A3();
        int[] ab = {0,3,2,1};
        System.out.println(a.zoho(ab));
    }
}