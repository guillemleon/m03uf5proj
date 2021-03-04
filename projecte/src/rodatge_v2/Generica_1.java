package rodatge_v2;

public class Generica_1<T> {

	private T t;
	
	public Generica_1(T t) {
		this.t = t;
	}
	
	public T getObject() {
		return this.t;
	}
	
	public void setObject(T t) {
		this.t = t;
	}
	
	@Override
	public String toString() {
		return this.t.toString();
	}
}
