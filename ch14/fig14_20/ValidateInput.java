package ch14.fig14_20;
// Valida informações de usuário utilizando expressões regulares

/*
 * [] -> Define um conjunto de caracteres
 * (-) > Define um intervalo de caracteres
 * (+) -> Um ou mais caracteres
 * (*) -> Zero ou mais caracteres
 * (?) -> Zero ou um caractere
 * {n} -> Exatamente n caracteres
 * {n,} -> n ou mais caracteres
 * {n,m} -> Entre n e m caracteres
 * (^) -> Início da string
 * ($) -> Fim da string
 * (.) -> Qualquer caractere
 * (\s) -> Espaço em branco
 * (\d) -> Dígito
 * (\w) -> Palavra (letra, dígito ou underscore)
 * (\D) -> Não dígito
 * (\W) -> Não palavra (não letra, dígito ou underscore)
 * (\S) -> Não espaço em branco
 * (|) -> Ou
 * ([a-zA-Z]) -> Qualquer letra (minúscula ou maiúscula)
 * ([a-zA-Z]+) -> Uma ou mais letras
 * () -> Agrupamento
 * 
 */
public class ValidateInput {
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]*");
    }

    public static boolean validateLastName(String lastName) {
        return lastName.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
    }

    public static boolean validateAddress(String address) {
        return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateCity(String city) {
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateState(String state) {
        return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateZipCode(String zipCode) {
        return zipCode.matches("\\d{5}-\\d{3}");
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }
}
