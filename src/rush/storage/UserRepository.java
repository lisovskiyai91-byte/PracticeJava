package rush.storage;

import rush.model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserRepository implements  Repository<Long, User> {
    private final Map<Long, User> users;

    public UserRepository(Map<Long, User> users) {
        this.users = users;
    }

    @Override
    public User get(Long key) {
        return users.get(key);
    }

    @Override
    public Collection<User> getAll() {
        return users.values();
    }

    @Override
    public void save(Long key, User value) {
    users.put(key, value);
    }

    @Override
    public void delete(Long key) {
    users.remove(key);
    }

    @Override
    public void update(Long key, User value) {
    users.put(key, value);
    }
}
