package test.reflection;

import java.io.Serializable;
import java.lang.reflect.Constructor;

/**
 * @author Donquixote
 * @date 2022/04/17
 **/
public class ConstructionTest implements Serializable {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = null;

        clazz = Class.forName("test.reflection.User");


        User user = (User) clazz.newInstance();
        user.setAge(20);
        user.setName("Jack");
        System.out.println(user);

        System.out.println("--------------------------------------------");



        //取得指定带int和String参数构造函数,该方法是私有构造private
        Constructor cs2=clazz.getDeclaredConstructor(int.class,String.class);
        //由于是private必须设置可访问
        cs2.setAccessible(true);
        //创建user对象
        User user2= (User) cs2.newInstance(25,"hiway2");
        System.out.println("user2:"+user2.toString());

        System.out.println("--------------------------------------------");

    }
}
