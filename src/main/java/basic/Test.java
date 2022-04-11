package basic;

/**
 * @author Donquixote
 * @date 2022/04/08
 **/
public class Test {
    public static void testIntegerCachePool() {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x == y);
        Integer z = Integer.valueOf(123);
        Integer k = Integer.valueOf(123);
        System.out.println(z == k);

        String s = new String("123");

        Integer i = 123;
        i.hashCode();
    }

    public static void testString() {
        String s = "hello world";
        System.out.println(s.hashCode());
    }

    public static void main(String[] args) {
        Test.testString();


//        short s = 1;
    }
}
