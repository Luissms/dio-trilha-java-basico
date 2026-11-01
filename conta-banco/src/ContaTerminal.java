import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: CONHECER E IMPORTAR A CLASSE SCANNER

        // EXIBIR AS MENSAGENS PARA O NOSSO USUÁRIO

        // OBTER PELA SCANNER OS VALORES DIGITADOS NO TERMINAL

        // EXIBIR A MENSAGEM CONTA CRIADA

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da conta: ");
        int NumeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da agência! ");
        String Agencia = scanner.next();
        
        String NomeCliente = "MARIO ANDRADE";
        
        double Saldo = 237.48;

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + NumeroConta + " e seu saldo é R$ " + Saldo + "já está disponível para saque.");
    }
}
