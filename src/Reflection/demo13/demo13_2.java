package Reflection.demo13;

/**
 * 将反射应用于工厂模式
 * 示例2：通过反射实现工厂模式
 * 缺点是需要传入完整的包和类名，示例3将通过导入配置文件完善
 *
 * Result:
 * eat Apple2!
 *
 */

interface fruit2 {
    void eat();
}

class Apple2 implements fruit2    {
    @Override
    public void eat() {
        System.out.println("eat Apple2!");
    }
}

class Orange2 implements fruit2 {
    @Override
    public void eat() {
        System.out.println("eat Orange2!");
    }
}

class Factory2   {
    public static fruit2 getInstannce(String className) {
        fruit2 f = null;
        try {
            f = (fruit2) Class.forName(className).newInstance();
        } catch (Exception e)  {
            e.printStackTrace();
        }
        return f;
    }
}

public class demo13_2 {
    public static void main(String[] args) {
        fruit2 f = Factory2.getInstannce("Reflection.demo13.Apple2");
        if (f!=null)
            f.eat();
    }
}
