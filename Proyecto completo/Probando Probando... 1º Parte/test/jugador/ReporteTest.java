/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package jugador;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 34633
 */
public class ReporteTest {
    
    public ReporteTest() {
    }
 @Test
    public void testFormularioValido() {
        
        Reporte Freporte = new Reporte();

        Freporte.setNickReportado("Player");

        Freporte.getMotivos().add("Palabras malsonantes");

        Freporte.getMotivos().add("Comentarios racistas");

        Freporte.setComentario("El jugador ha estado insultando durante toda la partida.");
        assertTrue(Freporte.formularioValido());    
        System.out.println(Freporte.formularioValido());
}
}
