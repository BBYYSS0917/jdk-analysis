package test.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Donquixote
 * @date 2022/04/14
 **/
public class B extends A{
    @Override
    public void test() {
        super.test();
    }

    @Deprecated
    public void oldMethod() {

    }

    @SuppressWarnings("rawtypes")
    public List processList() {
        List list = new ArrayList<>();
        return list;
    }
}
