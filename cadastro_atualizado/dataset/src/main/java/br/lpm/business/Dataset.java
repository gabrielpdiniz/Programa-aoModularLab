import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Dataset {
    private List<Pessoa> pessoas = new ArrayList<>();
    public static final int MAX_PESSOAS = 1000;  // define o tamanho max do dataset

    public void addPessoa(Pessoa pessoa) {
        if (pessoas.size() < MAX_PESSOAS) {
            pessoas.add(pessoa);
        } else {
            System.out.println("Ta cheio ja");
        }
    }

    public void removePessoa(Pessoa pessoa) { 
        pessoas.remove(pessoa);  //remove pessoa
    }

    public void removePessoaByName(String nome) {
        pessoas.removeIf(p -> p.getNome().equals(nome)); //remove pessoa por nome
    }

    public void replacePessoa(Pessoa oldPessoa, Pessoa newPessoa) {
        int index = pessoas.indexOf(oldPessoa);
        if (index != -1) {
            pessoas.set(index, newPessoa);  //substitui pessoa if index diferente de -1
        }
    }

    public Pessoa getPessoaByName(String nome) {  //saber o nome de alguem especifico
        return pessoas.stream()
                .filter(p -> p.getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }

    public List<Pessoa> getAll() {  //saber todo mundo da lista
        return new ArrayList<>(pessoas);
    }

    public void removeAll() { //remove geral da lista
        pessoas.clear();
    }

    public int size() { //tamanho da lista
        return pessoas.size();
    }

    public float maxAltura() { //verificar maior altura
        return pessoas.stream()
                .mapToDouble(Pessoa::getAltura)
                .max()
                .orElse(0);
    }

    public float minAltura() { //menor altura
        return pessoas.stream()
                .mapToDouble(Pessoa::getAltura)
                .min()
                .orElse(0);
    }

    public double avgAltura() { //altura media
        return pessoas.stream()
                .mapToDouble(Pessoa::getAltura)
                .average()
                .orElse(0);
    }
 
    public float maxPeso() { //maior pessoa
        return pessoas.stream()
                .mapToDouble(Pessoa::getPeso)
                .max()
                .orElse(0);
    }

    public float minPeso() { //menor pessoa
        return pessoas.stream()
                .mapToDouble(Pessoa::getPeso)
                .min()
                .orElse(0);
    }

    public double avgPeso() { //peso medio
        return pessoas.stream()
                .mapToDouble(Pessoa::getPeso)
                .average()
                .orElse(0);
    }

    public float percentAdult() { //porcentagem que é adulto. Adulto if idade > 18
        long adultos = pessoas.stream()
                .filter(p -> p.getIdade() >= 18)
                .count();
        return (float) adultos / pessoas.size() * 100;
    }

    public float percentEstadoCivil(EstadoCivil estadoCivil) { //porcentagem a respeito dos estados civis
        return (float) pessoas.stream()
                .filter(p -> p.getEstadoCivil() == estadoCivil)
                .count() / pessoas.size() * 100;
    }

    public EstadoCivil modeEstadoCivil() { //
        return pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getEstadoCivil, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public float percentFormacaoAcademica(FormacaoAcademica formacaoAcademica) { //porcentagem  cada formaçao academica
        return (float) pessoas.stream()
                .filter(p -> p.getFormacaoAcademica() == formacaoAcademica)
                .count() / pessoas.size() * 100;
    }

// retorna a formação acadêmica mais frequente entre as pessoas.
// usa stream para agrupar pessoas pela formaçao academica e contar quantas vezes cada formação aparece
// depois retorna a formaçao que mais apareceu
public FormacaoAcademica modeFormacaoAcademica() {
    return pessoas.stream()
            .collect(Collectors.groupingBy(Pessoa::getFormacaoAcademica, Collectors.counting()))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(null);
}

// calcula o percentual de pessoas que possuem uma determinada profissao
// filtra as pessoas pela profissao fornecida e conta o número de pessoas com essa profissão
// depois calcula a porcentagem em relação ao total de pessoas
public float percentProfissao(Profissao profissao) {
    return (float) pessoas.stream()
            .filter(p -> p.getProfissao() == profissao)
            .count() / pessoas.size() * 100;
}

// retorna a profissão mais frequente entre as pessoas
// quase igual ao metodo modeFormacaoAcademica, mas aqui para a profissão
// usa stream para agrupar pessoas pela profissao e contar quantas vezes cada profissao aparece
// e retorna a profissão que mais apareceu

public Profissao modeProfissao() {
    return pessoas.stream()
            .collect(Collectors.groupingBy(Pessoa::getProfissao, Collectors.counting()))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(null);
}

// calcula o percentual de pessoas com vida social ativa
// filtra as pessoas que têm vida social ativa e conta o número de tais pessoas
// depois calcula a porcentagem em relação ao total de pessoas
public float percentVidaSocial() {
    return (float) pessoas.stream()
            .filter(Pessoa::isVidaSocialAtiva)
            .count() / pessoas.size() * 100;
}

// calcula o percentual de pessoas que tem algum hobby
// filtra as pessoas que possuem hobbies e conta o número das tais pessoas
// e calcula a porcentagem em relação ao total de pessoas
public float percentHobby() {
    return (float) pessoas.stream()
            .filter(Pessoa::hasHobbies)
            .count() / pessoas.size() * 100;
}

// calcula a média de atividade física por semana entre as pessoas
// usa streams para mapear a atividade física por semana de cada pessoa e calcula a média
public double avgAtividadeFisica() {
    return pessoas.stream()
            .mapToInt(Pessoa::getAtividadeFisicaPorSemana)
            .average()
            .orElse(0);
}

// calcula o desvio padrao da atividade fisica por semana entre as pessoas

public double svdAtividadeFisica() {
    OptionalDouble avg = pessoas.stream()
            .mapToInt(Pessoa::getAtividadeFisicaPorSemana)
            .average();
    }


// calcula a media do estado de saude das pessoas
// usa streams para mapear o estado de saude de cada pessoa e calcula a media
public double avgSaude() {
    return pessoas.stream()
            .mapToInt(Pessoa::getEstadoSaude)
            .average()
            .orElse(0);
}

// calcula o desvio padrao do estado de saude das pessoas
// calcula a média do estado de saúde
public double svdSaude() {
    OptionalDouble avg = pessoas.stream()
            .mapToInt(Pessoa::getEstadoSaude)
            .average();
}
}