package refactoring;

public class Multiplication<T extends Number> implements Operation<T> {
    @Override
    public Integer function(T first, T second) {
        return first.intValue() * second.intValue();
    }
}

