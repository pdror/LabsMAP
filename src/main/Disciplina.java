package main;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private int id;
    private String nome;
    private String horario;
    private List<Aluno> alunos;
    private Professor professor;

    //CONSTRUTOR
    public Disciplina(int id, String nome, String horario) throws Exception {
        if(id < 0 || nome.equals("") || horario.equals(""))
            throw new Exception("Parametros incorretos");
        this.id = id;
        this.nome = nome;
        this.horario = horario;
        alunos = new ArrayList<Aluno>();
    }

    //GETTERS E SETTERS
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
        this.professor.adicionarDisciplina(this);
    }

    //MÉTODOS
    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
        aluno.adicionarDisciplina(this);
        aluno.adicionarHorario(this.horario);
    }

    public void listarAlunos() {
        System.out.println("Lista de alunos matriculados na disciplina " + getNome() + ": ");
        for(Aluno i : alunos)
            System.out.println(i);
    }

    public int totalAlunos() {
        return alunos.size();
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "\t Nome: " + getNome();
    }
}
