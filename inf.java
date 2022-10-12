import java.util.Scanner;
public class inf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сообщение из 7 цифр '0' и '1': ");
        int num = in.nextInt();
        if (num >= 10000000 || num < 1000000)
            System.out.println("Ошибка");
        else {
            char[] e = ("" + num).toCharArray();
            int[] elements = new int[7];
            for (int i = 0; i < 7; i++)
                elements[i] = e[i] - '0';
            for (int i : elements){
                if (i==2 || i==3 || i==4 || i==5 || i==6 || i==7 || i==8 || i==9)
                System.out.println("Ошибка");
                break;
            }
            for (int i : elements){
                if (i==0 || i==1){
            int s1 = (elements[0] + elements[2] + elements[4] + elements[6]) % 2;
            int s2 = (elements[1] + elements[2] + elements[5] + elements[6]) % 2;
            int s3 = (elements[3] + elements[4] + elements[5] + elements[6]) % 2;
            int syndromS = s1 * 100 + s2 * 10 + s3;
            switch (syndromS) {
                case 0:
                    System.out.print("Ошибок нет");
                    break;
                case 1:
                    System.out.print("Ошибка в бите r3");
                    if (elements[3] == 0) {
                        elements[3] = 1;
                    } else elements[3] = 0;
                    break;
                case 10:
                    System.out.print("Ошибка в бите r2");
                    if (elements[1] == 0) {
                        elements[1] = 1;
                    } else elements[1] = 0;
                    break;
                case 11:
                    System.out.print("Ошибка в бите i3");
                    if (elements[5] == 0) {
                        elements[5] = 1;
                    } else elements[5] = 0;
                    break;
                case 100:
                    System.out.print("Ошибка в бите r1");
                    if (elements[0] == 0) {
                        elements[0] = 1;
                    } else elements[0] = 0;
                    break;
                case 101:
                    System.out.print("Ошибка в бите i2");
                    if (elements[4] == 0) {
                        elements[4] = 1;
                    } else elements[4] = 0;
                    break;
                case 110:
                    System.out.print("Ошибка в бите i1");
                    if (elements[2] == 0) {
                        elements[2] = 1;
                    } else elements[2] = 0;
                    break;
                case 111:
                    System.out.print("Ошибка в бите i4");
                    if (elements[6] == 0) {
                        elements[6] = 1;
                    } else elements[6] = 0;
                    break;
            }
            System.out.print("\n");
            int res = elements[2] * 1000 + elements[4] * 100 + elements[5] * 10 + elements[6];
            if (res == 1 || res == 0) {
                System.out.println("000" + res);
            } else if (res == 10 || res == 11) {
                System.out.println("00" + res);
            } else if (res == 101 || res == 100 || res == 110 || res == 111) {
                System.out.println("0" + res);
            } else System.out.println(res);
        }
             break;
    }
}}}

