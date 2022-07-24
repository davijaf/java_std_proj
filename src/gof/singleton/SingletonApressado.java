package gof.singleton;

public class SingletonApressado {

	private static SingletonApressado instancia = new SingletonApressado();
	
	private SingletonApressado() {
		
	}
	
	public static SingletonApressado getInstancia() {
		return instancia;
	}
}
