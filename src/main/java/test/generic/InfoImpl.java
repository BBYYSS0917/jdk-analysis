package test.generic;

/**
 * @author Donquixote
 * @date 2022/04/12
 **/
public class InfoImpl<T> implements Info<T>{
    private T var;

    public InfoImpl(T var) {
        this.var = var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public T getVar() {
        return null;
    }
}
