import java.util.ArrayDeque;
import java.util.ArrayList;

public class PureQueue<E> {
	private ArrayList<E> data;

	PureQueue() {
		data = new ArrayList<>();
	}

	void enqueue(E o) {
		data.add(o);
	}

	E dequeue() {
		E aux = data.get(0);
		data.remove(aux);
		return aux;
	}
	
	E item(int i){
		return data.get(i);
	}

	E removeItem(E o) {
		if (data.contains(o)) {
			int i = data.indexOf(o);
			E aux = data.get(i);
			data.remove(aux);
			return aux;
		}
		return null;
	}

	E peek() {
		return data.get(data.size() - 1);
	}

	int size() {
		return data.size();
	}

	public String toString() {
		return data.toString();
	}

	public boolean isEmpty() {
		return data.isEmpty();
	}

	public static void main(String[] args) {
		PureQueue<Cliente> pc = new PureQueue<>();

		Cliente c1 = new Cliente("Maria", 45);
		Cliente c2 = new Cliente("Odair", 65);
		Cliente c3 = new Cliente("Pedro", 22);
		Cliente c4 = new Cliente("Teresinha", 18);
		Cliente c5 = new Cliente("Bruna", 35);

		pc.enqueue(c1);
		pc.enqueue(c2);
		pc.enqueue(c3);
		pc.enqueue(c4);
		pc.enqueue(c5);

		System.out.println(pc.toString());
		System.out.println("Retirando Pedro:" + pc.removeItem(c3));
		System.out.println(pc.toString());

	}
}
