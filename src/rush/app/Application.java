package rush.app;

import rush.model.User;
import rush.service.UserService;

public class Application {
    private  final UserService userService;
    public Application(UserService userService){
        this.userService=userService;

    }
    public void run (){
        User[] users = {
                new User(1L, "Oleg", "oleg@gmail.com"),
                new User(2L, "Olga", "olga@gmail.com"),
                new User(3L, "Admin", "admin@gmail.com"),
        };
        for (User user:users) {
        userService.save(user);
    }
    User user = userService.find(2L);
    System.out.println(user);
}
}