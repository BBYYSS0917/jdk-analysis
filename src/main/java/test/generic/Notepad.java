package test.generic;

/**
 * @author Donquixote
 * @date 2022/04/12
 **/
public class Notepad<K,V>  {
    private K key;
    private V value;

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Notepad<String, Integer> notepad = null;
        notepad = new Notepad<String, Integer>();
    }
}
