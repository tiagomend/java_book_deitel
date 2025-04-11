package ch11.fig11_05;
// Mecanismo de tratamento de exceção try... catch... finally
public class UsingExceptions {
    public static void main(String[] args) {
        try {
            throwsException();
        } catch (Exception exception) { // captura a exceção
            System.err.println("Exception handled in main method.");
        }

        doesNotThrowException(); // não lança exceção
    }

    // Demonstra try... catch... finally
    public static void throwsException() throws Exception {
        try { // tenta executar o código
            System.out.println("Method throwsException() called.");
            throw new Exception("Exception thrown in method throwsException()");
        } catch (Exception exception) { // captura a exceção
            System.err.printf("%s%n", exception.getMessage());
            throw exception; // relança a exceção
        } finally { // executa sempre, independentemente de uma exceção ser lançada ou não
            System.err.println("Finally block executed.");
        }

    } // fim do método throwsException

    // Demonstra finally quando nenhuma exceção ocorrer
    public static void doesNotThrowException() {
        try { // tenta executar o código
            System.out.println("Method noException() called.");
        } catch (Exception exception) { // captura a exceção
            System.err.printf("%s%n", exception.getMessage());
        } finally { // executa sempre, independentemente de uma exceção ser lançada ou não
            System.err.println("Finally block executed.");
        }

        System.out.println("End of method noException.");
    } // fim do método noException
}
