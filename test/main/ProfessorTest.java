package main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProfessorTest {
    private Professor professor;

    @Before
    public void setUp() throws Exception {
        professor = new Professor("0001", "Sabrina Souto");
    }

    @Test
    public void criarProfessor() throws Exception {
        try {
            new Professor("", "Heron Monteiro");
            Assert.fail("Esperava exceção. Campo de matrícula nulo");
        } catch (Exception e) {
            Assert.assertEquals("Falha", "Parametros incorretos", e.getMessage());
        }

        try {
            new Professor("0002", "");
            Assert.fail("Esperava exceção. Campo de nome nulo");
        } catch (Exception e) {
            Assert.assertEquals("Falha", "Parametros incorretos", e.getMessage());
        }
    }
}