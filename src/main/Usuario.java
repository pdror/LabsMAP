package main;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private String matricula;
    private String nome;
    protected List<Disciplina> disciplinas;
    private List<String> horarios;

    public Usuario(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplinas = new ArrayList<Disciplina>();
        this.horarios = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<String> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<String> horarios) {
        this.horarios = horarios;
    }

    //MÉTODOS
    public void adicionarDisciplina(Disciplina disc) {
        this.disciplinas.add(disc);
    }

    public void adicionarHorario(String horario) {
        this.horarios.add(horario);
    }

    public void printDisciplinas() {
        for(Disciplina i : disciplinas) {
            System.out.println(i + "\t" + i.getHorario());
        }
    }

    public void printHorarios() {
        for(String i : horarios) {
            System.out.println(i);
        }
    }

    public abstract void listarHorarios();

    public abstract void listarDisciplinas();
}
