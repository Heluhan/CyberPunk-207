package login_system;

import login_system.usecase.AccountManager;

public class LogInController {
    private String username;
    private String password;
    private AccountManager manager;

    public LogInController() {
        this.manager = new AccountManager();
    }

    public void login(String username, String password) {
        if(manager.login(username, password)){
            //TODO: asd
        }
    }
}
