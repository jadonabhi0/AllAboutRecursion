import java.util.HashMap;

public class GetStairPath {

    static HashMap<String,Long> dp = new HashMap<>();
    static long getPath( long end){
        String key = end+"@";
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        else if( end == 0 ){
            return 1;
        }
        else if (end<0){

            return 0;
        }else {
            dp.put(key, (getPath(end-1)+
                                getPath( end-2)+
                                getPath(end-3)));
        }
        return dp.get(key);
    }
    public static void main(String[] args){
        System.out.println(getPath( 40));
    }
}
