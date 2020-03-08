package com.example.jvmecture.jvm;

/**
 * 冒泡查询
 */
public class TestBubble {
    public static void main(String[] args) {
        int array[] = {12, 1, 3, 4, 24, 11, 9, 30, 28};
        int temp = 0;
        int count = 0;
        boolean flag = true;

        for (int i = 0; i < array.length; i++) {
            count++;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]){  //如果第一个值大于第二个
                    temp = array[j];        //将第一个值存放到变量 temp 中。
                    array[j] = array[j+1];  //将第二个值赋值给第一个值 。
                    array[j+1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
        System.out.println("比较的次数:"+count);
    }
}
