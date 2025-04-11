public class UsingExceptions {

    public static void main(String[] args) {
        try { // tenta executar o código
            method1(); // chama method1
        } catch (Exception exception) { // captura exceções lançadas por method1
            System.out.printf("%s%n%n", exception.getMessage()); // imprime mensagem de erro
            exception.printStackTrace(); // imprime rastreamento de pilha

            // Obtém informações sobre a pilha de chamadas
            StackTraceElement[] stackTraceElements = exception.getStackTrace(); // obtém pilha de chamadas

            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");

            // Faz um loop por stackTraceElements e imprime informações
            for (StackTraceElement element : stackTraceElements) {
                System.out.printf("%s\t", element.getClassName()); // imprime nome da classe
                System.out.printf("%s\t", element.getFileName()); // imprime nome do arquivo
                System.out.printf("%s\t", element.getLineNumber()); // imprime número da linha
                System.out.printf("%s%n", element.getMethodName()); // imprime nome do método
            }

        }
    }
    
    // chama method2: lança exceções de volta para main
    public static void method1() throws Exception {
        method2(); // chama method2
    }

    // chama method3: lança exceções de volta para method1
    public static void method2() throws Exception {
        method3(); // chama method3
    }

    // lança Exception de volta para method2
    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3"); // lança exceção
    }
}
