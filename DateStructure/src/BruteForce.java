public class BruteForce {
    public static int bruteForceSearch(String text,String pattern) {
        int n = text.length();
        int m = pattern.length();
        int i;
        int j=0;
        for (i = 0; i <= n - m; i++) {
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) ;
                break;
            }
        }
        if (j == m) {
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String text="hallo world";
        String pattern="world";
        int result = bruteForceSearch(text, pattern);
        if (result!=-1){
            System.out.println("匹配成功，位置在： "+result);
        }else {
            System.out.println("匹配失败");
        }
    }
}
