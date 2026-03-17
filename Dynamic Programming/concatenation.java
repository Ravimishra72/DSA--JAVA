import java.util.*;
public class concatenation {
    static List<List<Integer>> list = new ArrayList<>();
    public static void permutation(int n,List<Integer> curr){
        if(curr.size() == n){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int i=1; i<=n; i++){
            if(curr.contains(i)) continue;
            curr.add(i);
            permutation(n,curr);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> curr = new ArrayList<>();
        permutation(n, curr);
        int arr[] = new int[list.size()*n];
        int k=0;
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<n; j++){
                arr[k++] = list.get(i).get(j);
            }
        }
        int target = (n*(n+1))/2;
        int count=0;
        for(int i=0; i<=arr.length-n; i++){
            int sum = 0;
            for(int j=i; j<i+n; j++){
                sum += arr[j];
            }
            if(sum == target){
                    count++;
                }
        }
        System.out.println(count%998244353);
    }
}
