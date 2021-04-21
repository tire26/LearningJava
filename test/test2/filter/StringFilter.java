package test.test2.filter;

public class StringFilter implements Filter<String>{

    @Override
    public boolean apply(String o) {
        return !(o.startsWith("i") || o.startsWith("I"));
    }
}
