package test.generic;

/**
 * Java generic test
 *
 * @author Donquixote
 * @date 2022/04/11
 **/
public class GenericTest {

    public static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        //泛型的本质是为了参数化类型
        // （在不创建新的类型的情况下，通过泛型指定的不同类型来控制形参具体限制的类型）。
        // 也就是说在泛型使用过程中，操作的数据类型被指定为一个参数，这种参数类型可以用在类、接口和方法中，分别被称为泛型类、泛型接口、泛型方法。

        // 意义：适用于多种数据类型执行相同的代码
        // 提供编译前的检查
        // 泛型类，泛型接口，泛型方法

        System.out.println(GenericTest.add(1.1, 2.2));

    }

    // 泛型中隐含的转换问题 Java泛型假如了类型参数的上下边界机制 <? extends A> 编译时擦除到类型A。即用A类型代替类型参数
    // 泛型上下限的引入

    //<?> 无限制通配符
    //<? extends E> extends 关键字声明了类型的上界，表示参数化的类型可能是所指定的类型，或者是此类型的子类
    //<? super E> super 关键字声明了类型的下界，表示参数化的类型可能是指定的类型，或者是此类型的父类
    //
    // 使用原则《Effictive Java》
    // 为了获得最大限度的灵活性，要在表示 生产者或者消费者 的输入参数上使用通配符，使用的规则就是：生产者有上限、消费者有下限
    //1. 如果参数化类型表示一个 T 的生产者，使用 < ? extends T>;
    //2. 如果它表示一个 T 的消费者，就使用 < ? super T>；
    //3. 如果既是生产又是消费，那使用通配符就没什么意义了，因为你需要的是精确的参数类型。

    // 类型检查就是编译时完成的，new ArrayList()只是在内存中开辟了一个存储空间，可以存储任何类型对象，而真正涉及类型检查的是它的引用
}
