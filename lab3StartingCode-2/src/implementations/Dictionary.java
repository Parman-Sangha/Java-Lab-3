package implementations;
import java.util.HashMap;
import utilities.DictionaryADT;

//Parman.S and Ranjit.L

public class Dictionary<K, V> implements DictionaryADT<K, V> {

    private HashMap<K, V> data;

    public Dictionary() {
        data = new HashMap<>();
    }

    @Override
    public void addEntry(K key, V value) throws KeyAlreadyExistsException {
        if (data.containsKey(key)) {
            throw new KeyAlreadyExistsException(); 
        }
        data.put(key, value);
    }

    @Override
    public void deleteEntry(K key) throws KeyMissingException {
        if (!data.containsKey(key)) {
            throw new KeyMissingException();
        }
        data.remove(key);
    }

    @Override
    public void replaceValue(K key, V value) throws KeyMissingException {
        if (!data.containsKey(key)) {
            throw new KeyMissingException();
        }
        data.put(key, value);
    }

    @Override
    public V retrieve(K key) throws KeyMissingException {
        if (!data.containsKey(key)) {
            throw new KeyMissingException(); 
        }
        return data.get(key);
    }

    @Override
    public int entryCount() {
        return data.size();
    }

    @Override
    public boolean isDictionaryEmpty() {
        return data.isEmpty();
    }

    @Override
    public void removeAll() {
        data.clear();
    }
}