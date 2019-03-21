package Reflection.demo11;
/**
 *
 * 通过反射修改数组大小
 *
 * Result:
 * 数组长度为：15
 * 1 2 3 4 5 6 7 8 9 0 0 0 0 0 0 ====================
 * 数组长度为：8
 * a b c null null null null null
 * Process finished with exit code 0
 *
 */

import java.lang.reflect.Array;

public class demo11_2 {

    public static void main(String[] args) {
        int[] temp = {1,2,3,4,5,6,7,8,9};
        int[] newTemp = (int[])arrayInc(temp,15);
        print(newTemp);
        System.out.println("====================");
        String[] atr = {"a","b","c"};
        String[] str1 = (String[])arrayInc(atr,8);
        print(str1);
    }

    /**
     * 修改数组大小
     * @param obj
     * @param len
     * @return
     */
    public static Object arrayInc(Object obj,int len)   {
        Class<?> arr = obj.getClass().getComponentType();
        Object newArr = Array.newInstance(arr,len);
        int co = Array.getLength(obj);
        System.arraycopy(obj,0,newArr,0,co);
        return newArr;
    }

    /**
     * 打印
     * @param obj
     */
    public static void print(Object obj)    {
        Class<?> c = obj.getClass();
        if (!c.isArray()){
            return;
        }
        System.out.println("数组长度为：" + Array.getLength(obj));
        for (int i=0; i < Array.getLength(obj); i++)    {
            System.out.print(Array.get(obj,i) + " ");
        }
    }
}
