package BaiTap.HienThiCacLoaiHinh;
import java.util.Scanner ;
public class Print {
    public static void main(String[] args) {
        int choice = -1 ;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("1.in hình chữ nhật");
            System.out.println("2.in hình tam giác vuông, có cạnh góc vuông ở botton-left ");
            System.out.println("3.In hình tam giác vuông, có cạnh góc vuông ở top-left ");
            System.out.println("4.In hình tam giác vuông cân ");
            System.out.println("0.Thoát");
            choice = input.nextInt();
            if (choice == 1) {
                Scanner inputwidth = new Scanner(System.in);
                Scanner inputheight = new Scanner(System.in);
                System.out.println("nhập chiều rộng");
                int width = inputwidth.nextInt();
                System.out.println("nhập chiều dài");
                int height = inputheight.nextInt();
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
            }else if(choice == 2) {
                Scanner inputheight = new Scanner(System.in);
                System.out.println("nhập chiều dài");
                int height = inputheight.nextInt();
                for (int i = 0; i < height; i++) {
                    for (int j = -1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
            }else if(choice == 3) {
                Scanner inputheight = new Scanner(System.in);
                System.out.println("nhập chiều dài");
                int height = inputheight.nextInt();
                for (int i = 0; i < height; i++) {
                    for (int j = height-i; j > 0; j--) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
            }else if (choice == 4){
                Scanner inputheight = new Scanner(System.in);
                System.out.println("nhập chiều dài");
                int height = inputheight.nextInt();
                for (int i = 0; i < height; i++) {
                    for (int j = -1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                for (int k = 0; k < height-1; k++) {
                    for (int l = height-k-1; l > 0; l--) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
            }else if (choice == 0){
                System.exit(0);
            }
        } while (choice!=0) ;
    }
}
