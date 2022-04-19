package test.reflection;

/**
 * @author Donquixote
 * @date 2022/04/17
 **/
public class GetClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(User.class);
        System.out.println(new User().getClass());
        System.out.println(Class.forName("reflection.User"));
    }
}
