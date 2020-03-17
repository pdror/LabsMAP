package main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DisciplinaTest {

    private Disciplina disc;

    @Before
    public void setUp() throws Exception {
        disc = new Disciplina(001, "Métodos Avançados", "SEG/20H - QUI/18H");
    }

    @Test
    public void criaDisciplina() throws Exception {
        try {
            new Disciplina(-1, "Métodos Avançados", "SEG/20H - QUI/18H");
        } catch (Exception e) {
            Assert.assertEquals("Falha", "Parametros incorretos", e.getMessage());
        }

        try {
            new Disciplina(002, "", "SEG/20H - QUI/18H");
        } catch (Exception e) {
            Assert.assertEquals("Falha", "Parametros incorretos", e.getMessage());
        }

        try {
            new Disciplina(002, "Métodos Avançados", "");
        } catch (Exception e) {
            Assert.assertEquals("Falha", "Parametros incorretos", e.getMessage());
        }
    }
}