public class AgendaProvas {
    private String nome;
    private String curso;
    private String disciplina;
    private String polo;
    private String data;
    private char turno;
    
    public AgendaProvas(String nome, String curso, String disciplina, String polo, String data, char turno) {
        this.nome = nome;
        this.curso = curso;
        this.disciplina = disciplina;
        this.polo = polo;
        this.data = data;
        this.turno = turno;
    }
    
    public void remarcaProvas(String data, char turno) {
        this.data = data;
        this.turno = turno;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public void setPolo(String polo) {
        this.polo = polo;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public void setTurno(char turno) {
        this.turno = turno;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getCurso() {
        return this.curso;
    }
    
    public String getDisciplina() {
        return this.disciplina;
    }
    
    public String getPolo() {
        return this.polo;
    }
    
    public String getData() {
        return this.data;
    }
    
    public char getTurno() {
        return this.turno;
    }
    
    public void exibeDados() {
        System.out.println("AGENDAMENTO DA PROVA CONFIRMADO:");
        System.out.println("Aluno: " + getNome());
        System.out.println("Curso: " + getCurso());
        System.out.println("Disciplina: " + getDisciplina());
        System.out.println("Polo da prova: " + getPolo());
        System.out.println("Data da prova: " + getData());
        System.out.println("Turno: " +  getTurno());
    }
}