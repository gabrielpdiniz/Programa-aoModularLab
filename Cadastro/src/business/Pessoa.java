package business;

public class Pessoa {

    private String nome;
    private float altura;
    private float peso;
    private LocalDate dataNascimento;
    private EstadoCivil estadoCivil;
    private FormaçaoAcademica formacaoAcademica;
    private Profissao profissao;
    private boolean vidaSocial;
    private boolean hobby;
    private int atividadeFisica;
    private int saude;

    
    public Pessoa(String nome, float altura, float peso, LocalDate dataNascimento, EstadoCivil estadoCivil,
            FormaçaoAcademica formacaoAcademica, Profissao profissao, boolean vidaSocial, boolean hobby,
            int atividadeFisica, int saude) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
        this.formacaoAcademica = formacaoAcademica;
        this.profissao = profissao;
        this.vidaSocial = vidaSocial;
        this.hobby = hobby;
        this.atividadeFisica = atividadeFisica;
        this.saude = saude;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public FormaçaoAcademica getFormacaoAcademica() {
        return formacaoAcademica;
    }
    public void setFormacaoAcademica(FormaçaoAcademica formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }
    public Profissao getProfissao() {
        return profissao;
    }
    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }
    public boolean isVidaSocial() {
        return vidaSocial;
    }
    public void setVidaSocial(boolean vidaSocial) {
        this.vidaSocial = vidaSocial;
    }
    public boolean isHobby() {
        return hobby;
    }
    public void setHobby(boolean hobby) {
        this.hobby = hobby;
    }
    public int getAtividadeFisica() {
        return atividadeFisica;
    }
    public void setAtividadeFisica(int atividadeFisica) {
        this.atividadeFisica = atividadeFisica;
    }
    public int getSaude() {
        return saude;
    }
    public void setSaude(int saude) {
        this.saude = saude;
    }


    
    

}