package br.lpm.business;


public class Pessoa {

    String nome;
    float altura;
    float peso;
    LocalDate dataNascimento;
    EstadoCivil estadoCivil;
    FormaçaoAcademica formacaoAcademica;
    Profissao profissao;
    boolean vidaSocial;
    boolean hobby;
    int atividadeFisica;
    int saude;


    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        if (nome.matches("[a-zA-Z ]+")) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Apenas letras e espaços");
        }
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        if (altura > 0 && altura < 3) {
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("Altura deve estar entre 0 e 3 metros.");
        }
    }
    
    public float getPeso() {
        return peso;
    }
    
    public void setPeso(float peso) {
        if (peso > 0 && peso < 500) {
            this.peso = peso;
        } else {
            throw new IllegalArgumentException("peso deve estar entre 0 e 500 kg.");
        }
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento.isBefore(LocalDate.now())) {
            this.dataNascimento = dataNascimento;
        } else {
            throw new IllegalArgumentException("data de nascimento deve ser anterior ao dia de hoje.");
        }
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
        if (atividadeFisica >= 0 && atividadeFisica <= 7) {
            this.atividadeFisica = atividadeFisica;
        } else {
            throw new IllegalArgumentException("Atividade física deve estar entre 0 e 7 dias na semana.");
        }
    }
    
    public int getSaude() {
        return saude;
    }
    
    public void setSaude(int saude) {
        if (saude >= 1 && saude <= 10) {
            this.saude = saude;
        } else {
            throw new IllegalArgumentException("Saúde deve estar entre 1 e 10.");
        }
    }
    

}