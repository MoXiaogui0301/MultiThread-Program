package Reflection.demo1;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 通过一个对象获得完整的包名和类名
 */

class Demo{
    private int id;
    private int priority;
    private String name;

    public Demo(){

    }

    public Demo(int id,int priority,String name)    {
        this.id = id;
        this.priority = priority;
        this.name =name;
    }

    private int getPriority(){
        return priority;
    }
}

public class demo1 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.getClass());
        System.out.println(demo.getClass().getName());
        Field[] fields = demo.getClass().getFields();
        for (int i=0;i<fields.length;i++){
            int mo = fields[i].getModifiers();
            String priv = Modifier.toString(mo);
            Class<?> type = fields[i].getType();
            System.out.println(priv + " " + type.getName() + " " + fields[i].getName() + ";");
        }
        System.out.println(demo.getClass().getFields().toString());
    }
}
