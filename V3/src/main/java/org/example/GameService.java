package org.example;

import java.util.*;
public class GameService {
    private MapService mapService;
    private PlayerService playerService;
    private List<WaveService> waves;
    private LogService logService;
    private AuthService authService;

    public GameService() {
        this.mapService = new MapService();
        this.playerService = new PlayerService();
        this.waves = new ArrayList<>();
        this.logService = new LogService();
        this.authService = new AuthService();
    }

    public boolean login(String username, String password) {
        boolean authenticated = authService.authenticate(username, password);
        if (authenticated) {
            logService.logEvent("User " + username + " logged in");
        }
        return authenticated;
    }

    public void placeTower(TowerService tower, int x, int y) {
        mapService.placeTower(tower, x, y);
        logService.logEvent("Placed tower at (" + x + ", " + y + ")");
    }

    public void startWave() {
        WaveService wave = new WaveService();
        waves.add(wave);
        wave.start();
        logService.logEvent("Started a new wave");
    }

    public void gameState() {
        System.out.println(mapService);
        System.out.println("Puntuación: " + playerService.getScore());
        System.out.println("Vida de la base: " + playerService.getBaseHealth());
    }
}
