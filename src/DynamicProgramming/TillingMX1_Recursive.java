package DynamicProgramming;

public class TillingMX1_Recursive {
    static int tilling(int flen, int fbre, int tlen, int tbre){
        if(flen == 0 || fbre == 0){
            return 1 ;
        }else if(flen < 0 || fbre < 0){
            return 0;
        }else {
            int out1 = 0;
            int out2 = 0;
            int out3 = 0;
            int out4 = 0;
            if (flen > tbre) {
                out1 = tilling(flen - tbre, fbre - tlen, tlen, tbre) +
                        tilling(flen - tlen, fbre - tbre, tlen, tbre);
            }
            else if(flen < tbre){
               out4 =  tilling(flen-tlen,fbre,tlen,tbre);
            }
            else if(fbre<tbre){
                out2 = tilling(flen-tbre,fbre,tlen,tbre);
            }
            else {
                out3 = tilling(flen - tlen, fbre - tbre, tlen, tbre);
            }
            return out1 + out2 + out3;
        }
    }
    public static void main(String[] args){
        System.out.println(tilling(8, 3, 1, 3));
    }
}
