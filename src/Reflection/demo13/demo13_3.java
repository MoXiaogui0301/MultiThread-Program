package Reflection.demo13;

import java.io.*;
import java.util.Properties;

/**
 * 将反射应用于工厂模式
 * 示例3：通过反射和配置文件实现工厂模式
 *
 * Result:
 * eat Apple3!
 *
 */

interface fruit3 {
    void eat();
}

class Apple3 implements fruit3 {
    @Override
    public void eat() {
        System.out.println("eat Apple3!");
    }
}

class Orange3 implements fruit3 {
    @Override
    public void eat() {
        System.out.println("eat Orange3!");
    }
}

class Factory3 {
    public static fruit3 getInstance(String className) {
        fruit3 f = null;
        try {
            f = (fruit3) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}

//操作属性文件
class init {
    public static Properties getPro() throws FileNotFoundException, IOException {
        Properties pro = new Properties();
        File f = new File("src/Reflection/demo13/fruit.properties");
        if (f.exists())
            pro.load(new FileInputStream(f));
        else {
            pro.setProperty("apple", "Reflection.demo13.Apple3");
            pro.setProperty("orange", "Reflection.demo13.Orange3");
            pro.store(new FileOutputStream(f), "FRUIT CLASS");
        }
        return pro;
    }
}

public class demo13_3 {
    public static void main(String[] args) {
        Properties pro = null;
        try {
            pro = init.getPro();
        } catch (Exception e)   {
            e.printStackTrace();
        }
        fruit3 f = Factory3.getInstance(pro.getProperty("apple"));
        if (f!=null)
            f.eat();
    }
}
