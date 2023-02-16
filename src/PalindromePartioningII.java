public class PalindromePartioningII {

    public int minCut(String s) {

        // tc -- > O(n^3) not an optimize sol

//        ---------------   FIRST APPROACH ---------------------


//        boolean[][] dp = new boolean[s.length()][s.length()];
//
//        for (int g = 0 ; g < s.length() ; g++){
//            for (int i = 0 ,j = g ; j < s.length() ; i++, j++ ){
//
//                if (g == 0){
//                    dp[i][j] = true;
//                }
//                else if(g ==1){
//                    if (s.charAt(i) == s.charAt(j)){
//                        dp[i][j] = true;
//                    }
//                }else{
//                    if (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
//                        dp[i][j] = true;
//                    }
//                }
//
//            }
//        }
//
//        int[][] storage = new int[s.length()][s.length()];
//        for (int g = 0 ; g < s.length() ; g++){
//            for (int i = 0 , j = g ; j < s.length() ; i++, j++){
//
//                if (g == 0){
//                    storage[i][j] = 0;
//                }
//                else if (g == 1){
//                    if (s.charAt(i) == s.charAt(j)){
//                        storage[i][j] = 0;
//                    }else{
//                        storage[i][j] = 1;
//                    }
//                }
//                else {
//                    int min = Integer.MAX_VALUE;
//                    if(dp[i][j]){
//                        storage[i][j] = 0;
//                    }else{
//                        for (int k = i ; k < j ; k++){
//                            int left = storage[i][k];
//                            int right = storage[k+1][j];
//                            if (left+right+1 < min){
//                                min = left+right+1;
//                            }
//                        }
//                        storage[i][j] = min;
//                    }
//                }
//            }
//        }
//        return storage[0][s.length()-1];


        // --------- SECOND APPROACH ------------

        return 0;

    }


    public static void main(String[] args) {

        PalindromePartioningII p = new PalindromePartioningII();
        System.out.println(p.minCut("abccbc"));
    }



}
