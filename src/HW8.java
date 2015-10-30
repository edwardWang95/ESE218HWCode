/**
 * Created by edwardwang on 10/30/15.
 *
 * Use code to find state table
 */
import java.util.Scanner;

public class HW8 {
    private static int d0;
    private static int d1;
    private static int i_z;
    private static int i_x;
    private static int i_q0;
    private static int i_q1;

    public static void main(String [] args){
        String s_continueValue;
        Scanner input = new Scanner(System.in);

        while(true) {
             /*
             System.out.print("Do you wish to enter values [y/n]: ");
             s_continueValue = input.next();
             if (s_continueValue.equals("n")) {
                 break;
             }
             */
            System.out.print("Enter Value for X: ");
            i_x = input.nextInt();
            System.out.print("Enter Value for Q1: ");
            i_q1 = input.nextInt();
            System.out.print("Enter Value for Q0: ");
            i_q0 = input.nextInt();

            System.out.println("Value for D1-D0-Z: "+returnD1(i_x, i_q0, i_q1)+returnD0(i_x, i_q0, i_q1)+returnZ(d1, d0, i_x));

            reset();
        }
    }

    private static int returnD1(int x, int q0, int q1){
        d1 = (q0 * x) + (q1 * getComplement(x));
        return d1;
    }

    private static int returnD0(int x, int q0, int q1){
        d0 = (getComplement(q1) * x) + (q0 * getComplement(x));
        return d0;
    }

    private static int returnZ(int d1, int d0, int x){
        i_z = (d1 * d0 * x);
        return i_z;
    }

    private static int getComplement(int x){
        if(x == 0){
            return 1;
        }else if(x == 1) {
            return 0;
        }
        return 0;
    }

    private static void reset(){
        i_x = 0;
        i_q0 = 0;
        i_q1 = 0;
        d0 = 0;
        d1 = 0;
        i_z = 0;
    }

}

