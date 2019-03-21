package Reflection.demo13;

/**
 * 将反射应用于工厂模式
 * 示例1：原始工厂模式
 * 将对象创建交由工厂类执行，但添加子类必须修改工厂类
 *
 * Result:
 * eat orange!
 *
 */

interface fruit {
    public void eat();
}

class Apple implements fruit    {
    @Override
    public void eat() {
        System.out.println("eat apple!");
    }
}

class Orange implements fruit   {
    @Override
    public void eat() {
        System.out.println("eat orange!");
    }
}

//工厂类
class Factory {
    public static fruit getInstance(String fruitName)   {
        fruit f = null;
        if ("Apple".equals(fruitName))
            f = new Apple();
        if ("Orange".equals(fruitName))
            f = new Orange();
        return f;
    }
}

public class demo13_1 {
    public static void main(String[] args) {
        fruit f = Factory.getInstance("Orange");
        f.eat();
    }
}
