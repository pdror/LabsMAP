package main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlunoTest {

    private Aluno aluno;

    @Before
    public void setUp() throws Exception {
        aluno = new Aluno("0001", "Pedro Ramos");
    }

    @Test
    public void criarAluno() throws Exception {
        try {
            new Aluno("", "Joyce Mikaela");
            Assert.fail("Esperava exceção. Campo de matrícula nulo");
        } catch (Exception e) {
            Assert.assertEquals("Falha", "Parametros incorretos", e.getMessage());
        }

        try {
            new Aluno("0002", "");
            Assert.fail("Esperava exceção. Campo de nome nulo");
        } catch (Exception e) {
            Assert.assertEquals("Falha", "Parametros incorretos", e.getMessage());
        }
    }

    @Test
    public void listarDisciplinas() {
    }

    @Test
    public void listarHorarios() {
    }
}