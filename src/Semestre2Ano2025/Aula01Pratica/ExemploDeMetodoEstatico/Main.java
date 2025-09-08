package Semestre2Ano2025.Aula01Pratica.ExemploDeMetodoEstatico;

public class Main {
    public static void main(String[] args) {

        // Exemplo do uso de um método estático
        // A diferença aqui é que conseguimos chamar o método diretamente sem se importar com a instância do objeto
        int resultadoDaSomaDaCalculadoraComMetodoEstatico = CalculadoraComMetodoEstatico.somar(2, 2);
        System.out.println("RESULTADO DA CALCULADORA COM MÉTODO ESTATICO");
        System.out.println(resultadoDaSomaDaCalculadoraComMetodoEstatico);

        // Exemplo do uso de um método tradicional
        // A diferença aqui é que sempre devemos instanciar o objeto antes de usar seus comportamentos (que são os métodos)
        CalculadoraNormal calculadora = new CalculadoraNormal();
        int resultadoDaSomaDaCalculadoraNormal = calculadora.somar(2, 2);
        System.out.println("RESULTADO DA CALCULADORA NORMAL");
        System.out.println(resultadoDaSomaDaCalculadoraNormal);
    }
}
