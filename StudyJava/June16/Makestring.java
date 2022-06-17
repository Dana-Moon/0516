package June16;

import java.util.*;

public class Makestring {
    public static void main(String[] args) {
        System.out.println("test");

        String name1 = "name1";
        String name2 = "name2";
        System.out.println(name1);
        System.out.println(System.identityHashCode(name1));
        System.out.println(name2);
        System.out.println(System.identityHashCode(name2));



        //배열의 주소값
        int[] arr = null;
        int[] arr_1 = null;
        System.out.println(arr);
        //이렇게하면 null이라고 나온다.
        System.out.println(arr[0]);
        //이렇게 하면 NullException이 나온다.
        arr = new int[3];
        arr_1 = new int[3];
        System.out.println(arr);
        System.out.println(arr_1);
        //배열 0번째의 위치를 주소값으로 알려준다.



        // 배열의 복사와 주소값
        int[] arr1 = {100, 200, 300};
        int[] arr3 = null;
        //배열로 선언된 변수끼리 대입연산자?
        //배열 주소를 대입한다.(주소와 주소값은 다르다.??)힙에 있는 주소를 공유하고 있다.
        arr3 = arr1;
        System.out.println("arr3 : " + arr3);
        System.out.println("arr1 : " + arr1);
        arr3[0] = 400;
        System.out.println("arr3 : " + Arrays.toString(arr3));
        System.out.println("arr1 : " + Arrays.toString(arr1));
        arr1[0] = 900;



        // //가능하면 Arrays를 쓰는 게 그대로 카피할 수 있어서 안전하게 데이터를 가져올 수 있다.
        // int [] arr1 = {100, 200, 300};
        // System.out.println("arr1 : " + arr1);

        // int[] arr2 = null;
        // System.out.println("arr2 :" + arr2);
        // System.out.println(Arrays.toString(arr1));

        // arr2 =Arrays.copyOf(arr1, arr2.length);
        // System.out.println("arr2 :" + arr2);
        // System.out.println(Arrays.toString(arr2));

    }
}
