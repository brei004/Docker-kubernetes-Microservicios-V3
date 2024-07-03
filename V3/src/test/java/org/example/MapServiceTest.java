package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MapServiceTest {

    private MapService mapService;

    @Mock
    private TowerService towerService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mapService = new MapService();
    }

    @Test
    public void testPlaceTower() {
        when(towerService.getSymbol()).thenReturn('T');

        mapService.placeTower(towerService, 2, 3);

        String expectedGrid =
                        "[ ][ ][ ][ ][ ]\n"
                        + "[ ][ ][ ][ ][ ]\n"
                        + "[ ][ ][ ][T][ ]\n"
                        + "[ ][ ][ ][ ][ ]\n"
                        + "[ ][ ][ ][ ][ ]\n";
        assertEquals(expectedGrid, mapService.toString());
    }

    @Test
    public void testToString() {
        String actualGrid = mapService.toString();

        String expectedGrid =
                        "[ ][ ][ ][ ][ ]\n"
                        + "[ ][ ][ ][ ][ ]\n"
                        + "[ ][ ][ ][ ][ ]\n"
                        + "[ ][ ][ ][ ][ ]\n"
                        + "[ ][ ][ ][ ][ ]\n";
        assertEquals(expectedGrid, actualGrid);
    }
}
