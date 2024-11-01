package utilities;

public interface DictionaryADT<K, V> {

    class KeyAlreadyExistsException extends Exception {
        private static final long serialVersionUID = 1L;
    }

    class KeyMissingException extends Exception {
        private static final long serialVersionUID = 1L;
    }

    void addEntry(K key, V value) throws KeyAlreadyExistsException;
    void deleteEntry(K key) throws KeyMissingException;
    void replaceValue(K key, V value) throws KeyMissingException;
    V retrieve(K key) throws KeyMissingException;
    int entryCount();
    boolean isDictionaryEmpty();
    void removeAll();
}