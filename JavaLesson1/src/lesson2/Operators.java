package lesson2;

import java.util.Arrays;

public class Operators {
    public static void main(String[] args) {
        int m = 10, n = 2;
        System.out.println(m + n);
        System.out.println(m - n);
        int k = m * n;
        System.out.println(k);
        int l = n / m;
        int b = n % m;
        System.out.println("l = " + l);
        System.out.println("b = " + b);
        l = b++;
        System.out.println("l = " + l);
        l = ++b;
        System.out.println("l = " + l);
        System.out.println("b = " + b);
        int num = (++m - n--);
        System.out.println(num);
        System.out.println(n);
        System.out.println(m);
        boolean isM10 = m == 10;
        System.out.println(isM10);
        boolean lIsnot4 = b != 4;
        System.out.println(lIsnot4);
        System.out.println(l >= 2);
        System.out.println(l <= 4);
        System.out.println(l == 4);
        System.out.println(m > l);
        System.out.println(m < n);
        boolean z = (b == 4) && (m > l);
        System.out.println(z);
        boolean r = z || (m == 11);
        System.out.println(r);
        System.out.println(m | n);
        System.out.println(m & n);
        System.out.println(m ^ n);
        int[] arr = new int[20];
        System.out.println(arr.length);
        arr[19] = 3;
        System.out.println(arr[arr.length - 1]);
        int[][] tArray = {{3, 0, 4}, {2, 3, 1}, {3, 6, 9}};
        System.out.println(tArray[1][0]);
        System.out.println("//////xndir///////");
// xndir
        int count = 1;
        int[] numArr = {4, 3, 4, 8, 2, 4, 8, 7, 3, 9, 8};//{2,3,3,4,4,4,7,8,8,8,9}
        Arrays.sort(numArr);
        for (int s = 0; s < numArr.length - 1; s++) {
            if (numArr[s] == numArr[s + 1]) {
                count++;
            } else if (count % 2 != 0) {
                count = 1;
                System.out.println(numArr[s]);
            } else {
                count = 1;
            }
        }
        if (count % 2 != 0) {
            System.out.println(numArr[numArr.length - 1]);
        }


//        for (int s = 0; s < numArr.length; s++) {
//
//            int count = 0;
//            for (int i = 0; i < numArr.length; i++) {
//                if(numArr[s]==numArr[i]){
//                    count++;
//                }
//                if(i==numArr.length-1 && count%2!=0){
//                    System.out.println("+ +"+numArr[s]);
//                }
//            }
//
//            }


    }
}
