import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.concurrent.Delayed;

public class appAquecimento {
	static PureQueue<Cliente> fila;

	static PureQueue<Cliente> filaIdosos(PureQueue p) {
		Cliente aux;
		PureQueue<Cliente> pAux = new PureQueue<>();
		for (int i = 0; i < p.size(); i++) {
			aux = (Cliente) p.item(i);
			if (aux.getIdade() >= 65) {
				pAux.enqueue(aux);
			}

		}
		return pAux;
	}

	static void nextClientIdoso() {

		if (!fila.isEmpty()) {
			PureQueue<Cliente> filIdo = filaIdosos(fila);
			if (!filIdo.isEmpty()) {
				Cliente r = filIdo.dequeue();
				fila.removeItem(r);
				System.out.println("Atendimento para: " + r.toString());
			} else {
				Cliente r = fila.dequeue();
				System.out.println("Atendimento para " + r.toString());
			}

		} else {
			System.out.println("Sem clientes na fila no momento");
		}
	}

	static void nextNormal() {
		if (!fila.isEmpty()) {
			Cliente r = fila.dequeue();
			System.out.println("Atendimento para " + r.toString());
		} else {
			System.out.println("Sem clientes na fila no momento");
		}
	}

	public static void main(String[] args) {
		fila = new PureQueue<>();

		Scanner entrada = new Scanner(System.in);

		int m = 100000;
		while (m != 2) {
			System.out.println("-------------------------------");
			System.out.println("|\tSistema de banco\t\t|");
			System.out.println("|\t\t\t\t\t\t|");
			System.out.println("-------------------------------");
			System.out.println("\t\tMenu");
			System.out.println("\t[0] - Menu para Caixa");
			System.out.println("\t[1] - Menu para cliente");
			System.out.println("\t[2] - Sair!!!");

			m = entrada.nextInt();

			switch (m) {
			case 0:
				System.out.println("\n\n\n\n\n\n");
				System.out.println("\tMenu do Caixa\n\n");
				System.out.println("\tInforme o ID do Caixa");
				int id2 = entrada.nextInt();
				if (id2 >= 1 && id2 <= 5) {
					System.out.println("\t[1] - Chamar próximo cliente da fila");
					System.out.println("\t[2] - Olhar fila...");
					System.out.println("\t[3] - Sair");
					int id = entrada.nextInt();
					switch (id) {
					case 1:
						nextClientIdoso();
					case 2:
						System.out.println(fila.toString());
						System.out.println("\t[1] - Chamar próximo cliente da fila");
						System.out.println("\t[2] - Sair");
						id = entrada.nextInt();
						switch (id) {
						case 1:
							nextClientIdoso();
						case 2:

							break;

						default:
							break;
						}
						break;
					default:
						break;
					}
				} else {
					System.out.println("\t[1] - Chamar próximo cliente da fila");
					System.out.println("\t[2] - Olhar fila...");
					System.out.println("\t[3] - Sair");
					int id = entrada.nextInt();
					switch (id) {
					case 1:
						nextNormal();

						break;
					case 2:
						System.out.println(fila.toString());
						System.out.println("\t[1] - Chamar próximo cliente da fila");
						System.out.println("\t[2] - Sair");
						id = entrada.nextInt();
						switch (id) {
						case 1:
							nextNormal();
						case 2:

							break;

						default:
							break;
						}
					case 3:
						break;

					default:
						break;
					}
				}
			default:
				break;

			case 1:

				int idade;
				System.out.println("\tMenu do Cliente\n");
				System.out.print("\tInforme o seu primeiro nome: ");
				String nome = entrada.next();
				System.out.print("\tInforme a sua idade: ");
				idade = entrada.nextInt();
				System.out.printf("\n\n\n\tNa Fila Sr(a): %s %d anos\n", nome, idade);
				Cliente c = new Cliente(nome, idade);
				fila.enqueue(c);
				break;

			}

		}

		System.out.println("\tSaindo..... ");

	}

}
