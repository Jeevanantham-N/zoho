public class A8 {
    public int zoho (String str1, String str2){
        int num = 0;
        for(int i=0; i<str2.length(); i++){
            if(str1.indexOf(str2.charAt(i)) != -1)
                num++;
        }
        return num;
    }

    public static void main(String[] args) {
        A8 a = new A8();
        System.out.println(a.zoho("aA", "aAAbbbb"));
    }
}
