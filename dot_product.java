public class dot_product {
    public static void main(String[] args) {
        // 내적 문제
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        int answer = 0;
        for(int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        System.out.println("answer = " + answer);
    }
}
