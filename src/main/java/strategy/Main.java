package strategy;

public class Main {
    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();

        validator.setStrategy(new LengthStrategy());
        System.out.println("LengthStrategy válido: " + validator.validate("12121212")); //true
        System.out.println("LengthStrategy não válido: " + validator.validate("121212")); //false


        validator.setStrategy(new UpperCaseStrategy());
        System.out.println("UpperCaseStrategy válido: " + validator.validate("ABCDEFGJ")); //true
        System.out.println("LengthStrategy não válido: " + validator.validate("abcdefgj")); //false


        validator.setStrategy(new SpecialCharStrategy());
        System.out.println("SpecialCharStrategy" + validator.validate("123456J@")); //true
        System.out.println("LengthStrategy não válido: " + validator.validate("123456J")); //false



    }
}
