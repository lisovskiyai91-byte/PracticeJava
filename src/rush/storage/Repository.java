package rush.storage;

import java.util.Collection;

public interface Repository <K,V> {

    V get(K key);
    Collection <V> getAll();
    void save (K key, V value);
    void delete (K key);
    void update (K key, V value);

}
