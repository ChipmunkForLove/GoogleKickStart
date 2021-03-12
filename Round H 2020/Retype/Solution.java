import java.io.IOException;
import java.util.*;
public class Solution{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int testcase =in.nextInt();
        in.nextLine();
        for(int i=0;i<testcase;i++){
            String line = in.nextLine();
            int N = Integer.parseInt(line.split(" ")[0]);
            int K = Integer.parseInt(line.split(" ")[1]);
            int S = Integer.parseInt(line.split(" ")[2]);
            int toK = K-1;
            int toS = (K-S<S)?K-S:S;
            int StoN=N-S+1;
            int answer=toK+toS+StoN;
            System.out.println("Case #"+(i+1)+": "+answer);
        }
    }
}
