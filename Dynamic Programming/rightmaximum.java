
import java.util.*;

public class rightmaximum {

    public static int max(List<Integer> list) {
        int maximum = Integer.MIN_VALUE;
        int ans = -1;
        for (int i = 0; i < list.size(); i++) {
            maximum = Math.max(maximum, list.get(i));
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == maximum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            List<Integer> list = new ArrayList<>();
            for (int k = 0; k < arr.length; k++) {
                list.add(arr[k]);
            }
            int count = 0;
            while (!list.isEmpty()) {
                int point = max(list);
                for (int j = list.size()-1; j >= point; j--) {
                    list.remove(j);
                }
                count++;
            }
            System.out.println(count);
        }
    }
}
