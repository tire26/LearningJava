package test.test2.filter;

public class LongFilter implements  Filter<Long>{

    @Override
    public boolean apply(Long o) {
        return o <= 10;
    }
}
