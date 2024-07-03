package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class TowerServiceTest {

    @Test
    public void testGetSymbol() {

        char expectedSymbol = 'T';
        TowerService towerService = new TowerService(expectedSymbol);

        char actualSymbol = towerService.getSymbol();

        assertEquals(expectedSymbol, actualSymbol);
    }

    @Test
    public void testConstructor() {

        char expectedSymbol = 'X';

        TowerService towerService = new TowerService(expectedSymbol);

        assertNotNull(towerService);
        assertEquals(expectedSymbol, towerService.getSymbol());
    }
}
