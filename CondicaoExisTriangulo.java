import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int l1, l2, l3;   
        boolean eq, es, re; // Variáveis para tipos de triângulo

        Scanner input = new Scanner(System.in);

        // Entrada dos valores
        System.out.println("Digite o primeiro lado:");
        l1 = input.nextInt();
        System.out.println("Digite o segundo lado:");
        l2 = input.nextInt();
        System.out.println("Digite o terceiro lado:");
        l3 = input.nextInt();

        // Verificar existência do triângulo
        if ((l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l3 > l1)) {
            // Determinar tipo de triângulo
            eq = (l1 == l2 && l2 == l3);
            es = (l1 != l2 && l1 != l3 && l2 != l3);
            re = (l1 * l1 == l2 * l2 + l3 * l3 || 
                  l2 * l2 == l3 * l3 + l1 * l1 || 
                  l3 * l3 == l1 * l1 + l2 * l2);

            String tipo;
            if (eq) {
                tipo = "Equilátero";
            } else if (es && re) {
                tipo = "Escaleno Retângulo";
            } else if (es) {
                tipo = "Escaleno";
            } else if (re) {
                tipo = "Isósceles Retângulo";
            } else {
                tipo = "Isósceles";
            }

            // Usando switch para exibir o tipo
            switch (tipo) {
                case "Equilátero":
                    System.out.println("É um triângulo Equilátero");
                    break;
                case "Escaleno":
                    System.out.println("É um triângulo Escaleno");
                    break;
                case "Escaleno Retângulo":
                    System.out.println("É um triângulo Escaleno Retângulo");
                    break;
                case "Isósceles Retângulo":
                    System.out.println("É um triângulo Isósceles Retângulo");
                    break;
                case "Isósceles":
                    System.out.println("É um triângulo Isósceles");
                    break;
            }
        } else {
            System.out.println("Não é um triângulo");
        }

        input.close();
    }
}
