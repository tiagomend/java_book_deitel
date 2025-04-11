// Exceções encadeadas
public class UsingChainedExceptions {

    public static void main(String[] args) {
        try {
            method1(); // Chama o método 1
        } catch (Exception exception) {
            exception.printStackTrace(); // Exibe a pilha de chamadas
        }
    }

    // chama method2: lança exceções de volta para main
    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception exception) {
            throw new Exception("Exceção lançada em method1", exception); // Lança uma nova exceção
        }
    }
    // chama method3: lança exceções de volta para method1
    public static void method2() throws Exception {
        try {
            method3();
        } catch (Exception exception) {
            throw new Exception("Exceção lançada em method2", exception); // Lança uma nova exceção
        }
    }
    // lança uma exceção de volta para method2
    public static void method3() throws Exception {
        throw new Exception("Exceção lançada em method3"); // Lança uma nova exceção
    }
}
