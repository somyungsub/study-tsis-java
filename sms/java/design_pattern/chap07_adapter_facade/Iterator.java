package design_pattern.chap07_adapter_facade;

public interface Iterator<E> {
    boolean hasNext();

    E next();

    void remove();
}
