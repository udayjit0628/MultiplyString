public class MultiplyString{
public static void main(String[] args) {
        String A = "25";
        String B = "125";

        char[] a1 = A.toCharArray();
        char[] b2 = B.toCharArray();

        int result = 0;

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < b2.length; j++) {
                result += (a1[i] - '0') * (b2[j] - '0')
                        * (int) Math.pow(10, a1.length + b2.length - (i + j + 2));
            }
        }
        System.out.println(result);
    }
}