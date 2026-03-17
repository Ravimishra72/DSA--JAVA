import java.util.*;

public class spring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {

            long arr[] = new long[4];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextLong();
            }

            long[] ans = new long[3];

            for (long j = 1; j <= arr[3]; j++) {

                if (j % arr[0] == 0 && j % arr[1] == 0 && j % arr[2] == 0) {
                    ans[0] += 2;
                    ans[1] += 2;
                    ans[2] += 2;
                }

                else if (j % arr[0] == 0 && j % arr[1] == 0) {
                    ans[0] += 3;
                    ans[1] += 3;
                }

                else if (j % arr[0] == 0 && j % arr[2] == 0) {
                    ans[0] += 3;
                    ans[2] += 3;
                }

                else if (j % arr[1] == 0 && j % arr[2] == 0) {
                    ans[1] += 3;
                    ans[2] += 3;
                }

                else if (j % arr[0] == 0) {
                    ans[0] += 6;
                }

                else if (j % arr[1] == 0) {
                    ans[1] += 6;
                }

                else if (j % arr[2] == 0) {
                    ans[2] += 6;
                }
            }

            System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
        }
    }
}
