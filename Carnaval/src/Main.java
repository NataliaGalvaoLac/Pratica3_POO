import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Selecione uma opção:");
                System.out.println("(1) Ingresso Normal");
                System.out.println("(2) VIP");
                System.out.println("(3) Camarote");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor do ingresso normal:");
                        double valorNormal = scanner.nextDouble();
                        Normal ingressoNormal = new Normal(valorNormal);
                        ingressoNormal.imprimirValor();
                        break;
                    case 2:
                        System.out.println("Digite o valor do ingresso VIP:");
                        double valorVIP = scanner.nextDouble();
                        System.out.println("Digite o valor adicional do ingresso VIP:");
                        double valorAdicionalVIP = scanner.nextDouble();
                        VIP ingressoVIP = new VIP(valorVIP, valorAdicionalVIP);
                        ingressoVIP.imprimirValor();
                        break;
                    case 3:
                        System.out.println("Digite o valor do ingresso do camarote:");
                        double valorCamarote = scanner.nextDouble();
                        System.out.println("Digite o valor adicional do ingresso do camarote:");
                        double valorAdicionalCamarote = scanner.nextDouble();
                        System.out.println("Digite a localização do camarote:");
                        String localizacaoCamarote = scanner.next();
                        Camarote ingressoCamarote = new Camarote(valorCamarote, valorAdicionalCamarote, localizacaoCamarote);
                        ingressoCamarote.imprimirValor();
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }

                scanner.close();
            }
        }

    }
}