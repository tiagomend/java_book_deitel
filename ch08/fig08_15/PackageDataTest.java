// Acesso de pacote
public class PackageDataTest {

    public static void main(String[] args) {
        PackageData packageData = new PackageData();
        
        System.out.printf("After instantiation:%n%s%n", packageData);

        // Muda os dados de acesso de pacote
        packageData.number = 77;
        packageData.string = "Goodbye";

        System.out.printf("%nAfter changing values:%n%s%n", packageData);

    }
}

// Classe com variáveis de instância de acesso de pacote
class PackageData {
    int number;
    String string;

    public PackageData(){
        number = 0;
        string = "Hello";
    }

    @Override
    public String toString() {
        return String.format("number: %d; string: %s", number, string);
    }   
}