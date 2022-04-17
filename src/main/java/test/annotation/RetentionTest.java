package test.annotation;

/**
 * @author Donquixote
 * @date 2022/04/14
 **/
public class RetentionTest {

    @SourcePolicy
    public void sourcePolicy() {

    }

    @ClassPolicy
    public void classPolicy() {}

    @RuntimePolicy
    public void runtimePolicy() {

    }
}
