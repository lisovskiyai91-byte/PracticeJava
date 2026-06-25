package rush.service;

import rush.model.User;
import rush.storage.Repository;

public class UserService {
    private final Repository <Long,User> repository;
    public UserService(Repository <Long, User> repository) {
        this.repository = repository;
    }
    public User find (Long key) {
        return repository.get(key);
    }
    public void save (User user) {
        boolean valid = validateModel(user);
        if (valid) {
            repository.save(user.getId(), user);}
        else {
            throw new IllegalStateException("Invalis user" + user);
        }
    }

    private boolean validateModel(User user) {
    return user.getEmail()!= null&& user.getEmail().contains("@") &&
    user.getName() != null && user.getName().length()>2 &&
            user.getId() != null && user.getId()>0;
    }
}
