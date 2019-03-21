package Reflection.demo11;

/**
 * 通过数组取得并修改反射信息
 *
 * Class<?> demo = temp.getClass().getComponentType();
 *
 * Result:
 * 数组类型：int
 * 数组长度：5
 * 数组的第一个元素：1
 * 修改之后数组第一个元素为：100
 *
 */

import java.lang.reflect.Array;

public class demo11_1 {
    public static void main(String[] args) {
        int[] temp = {1,2,3,4,5};
        Class<?> demo = temp.getClass().getComponentType();
        System.out.println("数组类型：" + demo.getName());
        System.out.println("数组长度：" + Array.getLength(temp));
        System.out.println("数组的第一个元素：" + Array.get(temp,0));
        Array.set(temp,0,100);
        System.out.println("修改之后数组第一个元素为：" + Array.get(temp,0));
    }
}
