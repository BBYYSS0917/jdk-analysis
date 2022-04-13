package test.generic;

/**
 * @author Donquixote
 * @date 2022/04/12
 **/
public class GenericMethodTest {
    // 泛型方法，是在调用方法的时候指明泛型的具体类型。
    // 最前面必须加一个<T> 来生命这是一个泛型方法
    // 泛型方法要求的参数是Class<T>类型，而Class.forName()方法的返回值也是Class<T>
    // 型的对象，因此调用泛型方法时，变量c的类型就是Class<User>
    // 为什么要使用泛型方法呢？因为泛型类要在实例化的时候就指明类型，如果想换一种类型，不得不重新new一次，
    // 可能不够灵活；而泛型方法可以在调用的时候指明类型，更加灵活。
    public <T> T getObject(Class<T> c) throws IllegalAccessException, InstantiationException {
        T t=c.newInstance();
        return t;
    }
}
