package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class PlayerServiceTest {

    private PlayerService playerService;

    @BeforeEach
    public void setUp() {
        playerService = new PlayerService();
    }

    @Test
    public void testInitialScore() {

        int expectedScore = 0;

        int actualScore = playerService.getScore();

        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testInitialBaseHealth() {

        int expectedBaseHealth = 100;

        int actualBaseHealth = playerService.getBaseHealth();

        assertEquals(expectedBaseHealth, actualBaseHealth);
    }

    @Test
    public void testGetScore() {

        int expectedScore = 0;

        int actualScore = playerService.getScore();

        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testGetBaseHealth() {

        int expectedBaseHealth = 100;

        int actualBaseHealth = playerService.getBaseHealth();

        assertEquals(expectedBaseHealth, actualBaseHealth);
    }
}
