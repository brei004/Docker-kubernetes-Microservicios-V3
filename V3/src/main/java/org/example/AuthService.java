package org.example;
import java.util.HashMap;
import java.util.Map;
public class AuthService {
    private Map<String, String> users;
    public AuthService() {
        users = new HashMap<>();
        users.put("player1", "password1");
        users.put("player2", "password2");
    }
    public boolean authenticate(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}