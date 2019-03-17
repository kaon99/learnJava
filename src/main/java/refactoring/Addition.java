package refactoring;

public class Addition<T extends Number> implements Operation<T> {





    @Override
    public Integer function(T first, T second) {

        return first.intValue() + second.intValue();
    }

    public String function (String one,String two){
        return one.concat(two);
    }
}
