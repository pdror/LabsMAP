package main;

public class main {
    public static void main(String[] args) throws Exception {
        Aluno aluno01 = new Aluno("0001", "Pedro");
        Aluno aluno02 = new Aluno("0010", "Joyce");
        Aluno aluno03 = new Aluno("0011", "Mikaela");
        Aluno aluno04 = new Aluno("0100", "Henrique");
        Aluno aluno05 = new Aluno("1000", "Ferreira");

        Professor prof01 = new Professor("0002", "Sabrina Souto");
        Professor prof02 = new Professor("0021", "Rony Marcolino");
        Professor prof03 = new Professor("0022", "Luciana Queiroz");

        Disciplina disc01 = new Disciplina(0001, "Métodos Avançados", "SEG/20H - QUI/18H");
        Disciplina disc02 = new Disciplina(0002, "Programação WEB", "SEG/18H - QUI/20H");
        Disciplina disc03 = new Disciplina(0003, "Interface Gráfica", "QUA/18H - SEX/20H");
        Disciplina disc04 = new Disciplina(0004, "Tópicos em Programação", "QUA/20H - SEX/18H");

        disc01.setProfessor(prof01);
        disc02.setProfessor(prof01);

        //MATRICULANDO ALUNOS
        disc01.matricularAluno(aluno01);
        disc01.matricularAluno(aluno02);
        disc01.matricularAluno(aluno03);
        disc01.matricularAluno(aluno04);

        printLine();

        //LISTANDO ALUNOS
        disc01.listarAlunos();
        System.out.println("Total de alunos matriculados: " + disc01.totalAlunos());

        printLine();

        //PROFESSOR
        prof01.listarDisciplinas();

        printLine();

        aluno01.listarDisciplinas();

        printLine();

        aluno05.listarDisciplinas();

        printLine();

        aluno01.listarHorarios();

        disc02.matricularAluno(aluno01);

        aluno01.listarHorarios();
    }

    public static void printLine() {
        System.out.printf("%n");
        System.out.println("=======================================================");
    }
}
