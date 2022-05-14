public class GetMazePath {
    static int getMazePath(int sr, int sc, int dr, int dc){
       if(sr == dr || sc == dc){
           return 1;
       }else if(sr>dr || sc>dc  ){
           return 0;
        }else {
           return getMazePath(sr+1,sc,dr,dc)+getMazePath(sr,sc+1,dr,dc);
       }
    }

    public static void main(String[] args){
        System.out.println(getMazePath(0, 0, 2, 2 ));
    }
}
