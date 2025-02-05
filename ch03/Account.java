// Figure 3.1: Account.java

public class Account {
    // Variáveis de instância de uma classe armazenam
    // dados para cada objeto (isto é, cada instância)
    // da classe. (p. 56)
    private String name;

    // Método para definir (set) o nome no objeto
    public void setName(String name) {
        this.name = name;
    }

    // Método para recuperar (get) o nome do objeto
    public String getName() {
        // Passa o valor de instância name de volta ao chamador. (p. 59)
        return name;
    }
}

/*
 * A palavra chave public é um modificador de acesso. (p. 57)
 * A declaração de variáveis de instância com o modificador de acesso private é
 * conhecida como ocultamento de dados ou ocultamento de informação. (p. 63)
 */