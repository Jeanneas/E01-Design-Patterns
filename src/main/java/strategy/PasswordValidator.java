package strategy;

public class PasswordValidator {

    private PasswordStrategy strategy;

    public void setStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

    // FIXME só aceita um tipo de validação (por tamanho)
    public boolean validate(String password) {

        if (strategy == null){
            throw new IllegalStateException("Strategy não definida");
        }
        return strategy.validate(password);
    }

}
