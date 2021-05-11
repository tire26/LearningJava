package classWork.lesson0304.wrapper;

public class Wrapper<T> {
    
    private final T field;

    public Wrapper(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }
    public static void main(String[] args) {
        Wrapper raw = new Wrapper(1);
        String str  = (String) raw.getField();

        Wrapper<String> strRaw = new Wrapper<String>("text");
        raw = strRaw;
        str = strRaw.getField();

    }

    
}
