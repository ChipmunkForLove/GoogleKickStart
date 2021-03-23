import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int N=sc.nextInt();//string length
            int K=sc.nextInt();//goal score
            int curscore=0;
            int len=N-1;
            int start=0;
            sc.nextLine();
            String str = sc.nextLine();
            while(start<len){
                if(str.charAt(start)!=str.charAt(len)) curscore++;
                start++;
                len--;
            }
            int res=0;
            if(curscore==K) res=0;
            else if(curscore>K) res= curscore-K;
            else res=K-curscore;
            System.out.println("Case #"+(i+1)+": "+res);
        }
    }
}
