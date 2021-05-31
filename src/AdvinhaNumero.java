import java.util.Scanner;
import java.util.Random;

public class AdvinhaNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rdn = new Random();

		int escolha = 0;
		int tentativas = 0;
		int random = rdn.nextInt(10) + 1;

		System.out.println("BEM VINDO! SIGA AS INSTRU��ES PARA JOGAR.\n");

		while (escolha != random) {

			if (tentativas == 0) {

				System.out.println("Escolha um n�mero de 1 a 10:");

			} else {

				System.out.println("Tente novamente:");

			}

			escolha = sc.nextInt();

			tentativas++;

			if (escolha < random) {

				System.out.println("\nN�mero menor do que o esperado\n");

			} else if (escolha > random) {

				System.out.println("\nN�mero maior do que o esperado\n");

			} else {

				System.out.println("\nGG!\nVoc� acertou na " + tentativas + "� tentativa.\nO n�mero sorteado era: " + random);

			}
		}

		sc.close();
	}
}