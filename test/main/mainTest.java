package main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class mainTest {
    private Aluno aluno;
    private Professor professor;
    private Disciplina disc;

    @Before
    public void setUp() throws Exception {
        aluno = new Aluno("0001", "José Bonifácio");
        professor = new Professor("0001", "Maria Lacerda");
        disc = new Disciplina(001, "Língua Inglesa I", "SEG/20H - QUI/18H");
    }

    @Test
    public void testaMatriculaAluno() throws Exception {
        //Assert.assertNull();
    }
}