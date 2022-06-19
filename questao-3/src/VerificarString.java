import java.util.Scanner;

public class VerificarString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String frase = "";
		String humor = "";
		String contador = "";
		String testeDivertido = "";
		String testeChateado = "";
		boolean running = true;

		while (running) {

			contador = "";
			testeDivertido = "";
			testeChateado = "";
			frase = "";

			while (frase == "") {
				System.out.println("Digite sua frase");
				frase = scan.nextLine();
			}

			for (int i = 0; i < frase.length(); i++) {
				try {
					if (frase.charAt(i) == ':' && frase.charAt(i + 1) == '-' && frase.charAt(i + 2) == ')'
							&& frase.charAt(i + 3) != '~') {
						contador += "a";
					}
					if (frase.charAt(i) == ':' && frase.charAt(i + 1) == '-' && frase.charAt(i + 2) == '('
							&& frase.charAt(i + 3) != '~') {
						contador += "b";
					}
				} catch (StringIndexOutOfBoundsException e) {
					if (frase.length() - 1 == frase.lastIndexOf(')')) {
						contador += "a";
					} else if (frase.length() - 1 == frase.lastIndexOf('(')) {
						contador += "b";
					}
				}
			}

			for (int c = 0; c < contador.length(); c++) {
				testeDivertido += "a";
				testeChateado += "b";
			}

			if (testeDivertido.equals("")) {
				testeDivertido = "1";
			}
			if (testeChateado.equals("")) {
				testeChateado = "1";
			}

			if (contador.equals(testeDivertido)) {
				humor = "divertido";
			} else if (contador.equals(testeChateado)) {
				humor = "chateado";
			} else {
				humor = "neutro";
			}
			System.out.println(humor + " \n");
			System.out.println("Deseja verificar o humor de outra frase?");
			System.out.println("1 - Para finalizar");
			System.out.println("2 - Para executar novamente");
			int resp = new Scanner(System.in).nextInt();
			if (resp == 1) {
				break;
			}

		}
	}
}