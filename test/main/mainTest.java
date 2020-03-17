package main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

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
        Assert.assertEquals(disc.getAlunos().size(), 0);
        disc.matricularAluno(aluno);
        Assert.assertEquals(disc.getAlunos().size(), 1);
        Assert.assertTrue(disc.getAlunos().contains(aluno));
    }

    @Test
    public void testaProfessor() throws Exception {
        Assert.assertNull(disc.getProfessor());
        disc.setProfessor(professor);
        Assert.assertNotNull(disc.getProfessor());
        String expected = "Matrícula: " + professor.getMatricula() + "\t Nome: " + professor.getNome();
        Assert.assertEquals(disc.getProfessor().toString(), expected);
    }

    @Test
    public void testaDisciplinasMinistradas() throws Exception {
        disc.setProfessor(professor);

        Disciplina disc01 = new Disciplina(002, "Disciplina de Teste I", "SEG/18H - SEX/18H");
        Disciplina disc02 = new Disciplina(003, "Disciplina de Teste II", "QUA/08H - SEX/11H");

        disc01.setProfessor(professor);
        disc02.setProfessor(professor);

        //String expected = "Disciplinas ministradas por: " + professor.getNome() + "\n" +
        //                    "ID: " + disc.getId() + "\t Nome: " + disc.getNome() + "\t " + disc.getHorario() + "\n" +
        //                    "ID: " + disc01.getId() + "\t Nome: " + disc01.getNome() + disc01.getHorario() + "\n" +
        //                    "ID: " + disc02.getId() + "\t Nome: " + disc02.getNome() + disc02.getHorario();

        String[] expected = new String[3];
        expected[0] = "ID: " + disc.getId() + "\t Nome: " + disc.getNome();
        expected[1] = "ID: " + disc01.getId() + "\t Nome: " + disc01.getNome();
        expected[2] = "ID: " + disc02.getId() + "\t Nome: " + disc02.getNome();

        System.out.println(professor.getDisciplinas());
        Assert.assertEquals(professor.getDisciplinas().toString(), expected);
    }
}