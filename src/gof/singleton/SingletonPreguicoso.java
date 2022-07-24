package gof.singleton;

public class SingletonPreguicoso {

	private static SingletonPreguicoso instancia;
	
	private SingletonPreguicoso() {
		
	}
	
	public static SingletonPreguicoso getInstancia() {
		if (instancia == null) {
			instancia = new SingletonPreguicoso();
		}
		return instancia;
	}
}
