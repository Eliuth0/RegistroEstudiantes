
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;


public class test1{
    @Test
    public void testEstudianteAprueba() {
        Estudiante estudiante = new Estudiante("Juan", 20, 7.5);
        assertTrue(estudiante.aprueba());
    }

    @Test
    public void testEstudianteReprueba() {
        Estudiante estudiante = new Estudiante("Ana", 18, 5.0);
        assertFalse(estudiante.aprueba());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEdadInvalida() {
        new Estudiante("Pedro", 3, 8.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalificacionInvalida() {
        new Estudiante("Laura", 22, 11.0);
    }
}




