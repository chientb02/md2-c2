package BaiTap.HienThiSnt;
import java.util.Scanner;
public class TwentyPrime {
    public static void main(String[] args) {
        Scanner numbercount = new Scanner(System.in);
        System.out.println("nhập số lượng số nguyên tố cần in");
        int count = numbercount.nextInt() ;
        int N = 2 ;
        for (int i = 0; i < count; ) {
            boolean flag = true ;
            for (int j = 2; j < N ; j++) {
                if(N % j == 0 ) {
                    flag = false ;
                    break;
                }
            }

            if (flag){
                System.out.println(N);
                i++ ;
            }
            N++ ;
        }
    }
}
