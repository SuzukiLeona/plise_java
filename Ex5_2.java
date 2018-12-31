package plise_java;

public class Ex5_2<E> {
	private KeyType keyType;
	private E data;
	private int count = 0;

	public Ex5_2(KeyType keyType) {
		this.keyType = keyType;
	}

	public void put(E data) {
		this.data = data;
	}

	public E get() {
		this.count++;
		switch (this.keyType) {
		case PADLOCK:
			if (count < 1024) {
				return null;
			}
			break;
		case BUTTON:
			if (count < 10000) {
				return null;
			}
			break;
		case DIAL:
			if (count < 30000) {
				return null;
			}
			break;
		case FINGER:
			if (count < 100000) {
				return null;
			}
			break;
		}
		return this.data;
	}
}
