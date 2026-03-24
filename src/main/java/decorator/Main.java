package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente produto = new Pao(
                new Ketchup(
                        new Bacon(
                                new Queijo(
                                        new Salada()
                                )
                        )
                )
        );

        System.out.println("Ingredientes:" + produto.imprimeIngrediente());
        System.out.println("Valor total: R$" + produto.valorDoIngrediente());

    }
}
