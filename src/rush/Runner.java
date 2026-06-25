package rush;

import rush.app.Application;
import rush.model.User;
import rush.service.UserService;
import rush.storage.UserRepository;

import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        Application application = buildAplication();
        application.run();
    }

    private static Application buildAplication() {
        HashMap<Long, User> storage = new HashMap<>();
        UserRepository repository = new UserRepository(storage);
        UserService userService = new UserService(repository);
        return new Application(userService);
    }
}
