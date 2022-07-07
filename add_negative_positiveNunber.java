public class add_negative_positiveNunber {
    public static void main(String[] args) {
        // 음양 더하기
        int[] absolutes = {4,7,12};
        boolean[] sign = {true, false, true};
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++) {
            if (sign[i] == false) {
                absolutes[i] = (int)(absolutes[i]*-1);
            }
            answer += absolutes[i];
        }
        System.out.println("answer = " + answer);
    }
}
