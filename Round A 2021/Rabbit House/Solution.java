import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] dx={-1,0,1,0};
        int[] dy={0,-1,0,1};
        for(int i=0;i<T;i++){
            int R = sc.nextInt();
            int C = sc.nextInt();
            int[][] matrix = new int[R][C];
            long res=0;
            PriorityQueue<Item> pq =new PriorityQueue<>(Comparator.comparingInt(x->-x.val));
            for(int j=0;j<R;j++){
                for(int k=0;k<C;k++){
                    matrix[j][k]=sc.nextInt();
                    pq.add(new Item(j,k,matrix[j][k]));
                }
            }
            while(pq.size()>0){
                Item cur = pq.poll();
                if(matrix[cur.r][cur.c]!=cur.val) continue;
                for(int l=0;l<4;l++){
                    int nx=cur.c+dx[l];
                    int ny=cur.r+dy[l];
                    if(nx<C && nx>=0 && ny<R && ny>=0 && matrix[ny][nx]<cur.val-1){
                        res+=cur.val-matrix[ny][nx]-1;
                        matrix[ny][nx]=cur.val-1;
                        pq.add(new Item(ny,nx,cur.val-1));
                    }
                }
            }
            System.out.printf("Case #%d: %d\n", (i+1), res);
        }
    }
    static class Item{
        public int r;
        public int c;
        public int val;
        public Item(int r,int c,int val){
            this.r=r;
            this.c=c;
            this.val=val;
        }
    }
}
