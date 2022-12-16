public class AllStringPermutations {
    public static void strPerm(String str,String perm){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i = 0 ; i < str.length() ; i++){
            var curchar = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            strPerm(newstr,perm+curchar);
        }
        
        
    }
    public static void main(String[] args){
        strPerm("abc","");
    }
}
