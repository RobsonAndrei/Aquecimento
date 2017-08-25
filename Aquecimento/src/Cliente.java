/***
 * 
 * @author robsonsantos
 *
 */
public class Cliente implements Comparable<Cliente> {
	private String nome;
	private int idade;

	/***
	 * 
	 * @param n
	 * @param i
	 */
	public Cliente(String n, int i) {

		this.nome = n;
		this.idade = i;

	}


	/***
	 * 
	 */
	@Override
	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		if (this.idade < o.idade)
			return -1;
		if (this.idade > o.idade)
			return 1;
		// return o.idade - this.idade; apenas com uma linha de comando

		return 0;
	}

	/***
	 * 
	 * @return
	 */
	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}

	/***
	 * 
	 * @return
	 */
	public String toString() {
		String msn = "";
		msn = msn + "\nNome: " + this.nome + " Idade: " + this.idade;

		return msn;
	}

}
