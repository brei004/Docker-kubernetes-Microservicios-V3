package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
public class LogService {
    private static final String LOG_FILE = "/app/data/log.txt";
    public void logEvent(String event) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(LocalDateTime.now() + " - " + event + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}