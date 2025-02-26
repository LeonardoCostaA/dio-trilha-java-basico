import java.util.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {

        resumoOperadores();

    }

    public static void resumoOperadores() {
        //operador de atribuição
        String nome = "Leonardo";
        int idade = 30;
        double peso = 80.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date(1994, 12, 16);

        //operadores aritméticos
        double soma = 10.5 + 15.8;
        int subtracao = 113 - 46;
        int multiplicacao = 5 * 90;
        int divisao = 45 / 5;
        int modulo = 42 % 5;
        double resultado = (multiplicacao * soma) + (divisao / subtracao);

        String nomeCompleto = "Leonardo" + " " + "Rocha";
        System.out.println(nomeCompleto);

        //análise comportamento operador aritméticos com strings
        String concatencacao = "?";

        concatencacao = 1 + 1 + 1 + "1";
        System.out.println(concatencacao);
        
        concatencacao = 1 + "1" + 1 + 1;
        System.out.println(concatencacao);
        
        concatencacao = 1 + "1" + 1 + "1";
        System.out.println(concatencacao);
        
        concatencacao = "1" + 1 + 1 + 1;
        System.out.println(concatencacao);
        
        concatencacao = "1" + (1 + 1 + 1);
        System.out.println(concatencacao);

        //operadores unários
        //+ números são positivos mesmo se ele não for explicitamente informado
        int numero = 5; //+5
        //- nega número ou expressão aritmética
        System.out.println(- numero);
        numero = - numero;
        System.out.println(numero);
        numero = - numero;
        System.out.println(numero);
        //++ incremento de 1
        System.out.println(numero++); //incremento após
        System.out.println(numero); //resultado
        System.out.println(++numero); //incremento pré
        //-- decremento de 1
        System.out.println(numero--); //decremento após
        System.out.println(numero); //resultado
        System.out.println(--numero); //decremento pré
        //! nega valor booleano
        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);

        //operadores ternário
        int a, b;
        a = 6;
        b = 6;
        String resultadoTernario = a == b ? "verdadeiro" : "falso";
        System.out.println(resultadoTernario);
        a = 5;
        resultadoTernario = a == b ? "verdadeiro" : "falso";
        System.out.println(resultadoTernario);

        //operadores racionais
        int numero1, numero2;
        numero1 = 1;
        numero2 = 2;        
        boolean simNao;
        
        //== verifica igualdade
        simNao = numero1 == numero2;
        System.out.println("Número 1 é igual ao número 2? " + simNao);
        //!= verifica diferença
        simNao = numero1 != numero2;
        System.out.println("Número 1 é diferente ao número 2? " + simNao);
        //> verifica se o primeiro valor é maior
        simNao = numero1 > numero2;
        System.out.println("Número 1 é maior que o número 2? " + simNao);
        //>= verifica se o primeiro valor é maior ou igual
        simNao = numero1 >= numero2;
        System.out.println("Número 1 é maior ou igual ao número 2? " + simNao);
        //< verifica se o primeiro valor é menor
        simNao = numero1 < numero2;
        System.out.println("Número 1 é menor que o número 2? " + simNao);
        //<= verifica se o primeiro valor é menor ou igual
        simNao = numero1 <= numero2;
        System.out.println("Número 1 é menor ou igual ao número 2? " + simNao);

        String nomeUm = "Leonardo";
        String nomeDois = new String("Leonardo");

        System.out.println("Comparação == de String e new String() " + nomeUm == nomeDois);        
        System.out.println("Comparação equals de String e new String() " + nomeUm.equals(nomeDois));

        //operadores lógicos
        //&& coperador E
        //|| operador OU

        boolean condicao1, condicao2;
        condicao1 = true;
        condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        } else {
            System.out.println("Uma das condições é verdadeira e a outra falsa");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        } else {
            System.out.println("As duas condições são falsas");
        }

        if (condicao1 && (7 > 4)) {
            System.out.println("As duas novas condições são verdadeiras");
        } else {
            System.out.println("Uma das novas condições é verdadeira e a outra falsa");
        }
        
        System.out.println("Fim");
    }
}
