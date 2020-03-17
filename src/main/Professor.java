package main;

public class Professor extends Usuario {

    public Professor(String matricula, String nome) throws Exception {
        super(matricula, nome);
        if(matricula.equals("") || nome.equals(""))
            throw new Exception("Parametros incorretos");
    }

    @Override
    public void listarHorarios() {
        System.out.println("Horários do professor: " + getNome());
        if(super.getHorarios().isEmpty()) {
            System.out.println("Nenhum horário registrado");
        } else {
            super.printHorarios();
        }
    }

    @Override
    public void listarDisciplinas() {
        System.out.println("Disciplinas ministradas por: " + super.getNome());
        if(super.getDisciplinas().isEmpty()) {
            System.out.println("Nenhuma disciplina registrada");
        } else {
            super.printDisciplinas();
        }
    }


}
