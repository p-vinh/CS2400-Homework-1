public interface Iterator<T> {
    public boolean hasNext();

    T next();
    
    default void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
