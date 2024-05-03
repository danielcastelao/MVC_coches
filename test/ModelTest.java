import cod.mvc.Coche;
import cod.mvc.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {
    private String matricula;
    private String modelo;
    private Integer velocidad;

    @BeforeEach
    void setUp() {
        Model.crearCoche("1234ABC", "ModeloTest1", 100);
    }

    @Test
    void testCrearCoche() {
        Coche coche = Model.crearCoche("5678DEF", "ModeloTest2", 200);
        assertNotNull(coche);
    }

    @Test
    void testGetCoche() {
        Coche coche = Model.getCoche();
        assertNotNull(coche);
    }

    @Test
    void testCambiarVelocidad() {
        Model.cambiarVelocidad("1234ABC", 150);
        Coche coche = Model.getCoche();
        assertEquals(150, coche.getVelocidad());
    }

    @Test
    void testGetVelocidad() {
        Integer velocidad = Model.getVelocidad("1234ABC");
        assertEquals(100, velocidad);
    }
}