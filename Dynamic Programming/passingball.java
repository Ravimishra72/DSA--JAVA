import java.util.Scanner;
public class passingball {
    public static int solve(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'L'){
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(solve(s));
        }
    }
}
