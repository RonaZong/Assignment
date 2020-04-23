package Lambda.Example1;

public interface CheckPerson {
    boolean test(Person p);
}

interface Predicate<T> {
    boolean test (T t);
}
