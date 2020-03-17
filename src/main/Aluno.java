package main;

public class Aluno extends Usuario {
    public Aluno(String matricula, String nome) throws Exception {
        super(matricula, nome);
        if(matricula.equals("") || nome.equals(""))
            throw new Exception("Parametros incorretos");
    }

    @Override
    public void listarDisciplinas() {
        System.out.println("Disciplinas matriculadas por: " + super.getNome());
        if(super.getDisciplinas().isEmpty()) {
            System.out.println("Nenhuma disciplina registrada");
        } else super.printDisciplinas();
    }

    @Override
    public void listarHorarios() {
        System.out.println("Horários do aluno: " + getNome());
        if(super.getHorarios().isEmpty()) {
            System.out.println("Nenhum horário registrado");
        } else {
            super.printHorarios();
        }
    }

    @Override
    public String toString() {
        return "Matrícula: " + super.getMatricula() + "\t Nome: " + super.getNome();
    }
}
