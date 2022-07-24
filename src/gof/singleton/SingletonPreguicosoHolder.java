package gof.singleton;

public class SingletonPreguicosoHolder {

	private static class InstanceHolder {
		public static SingletonPreguicosoHolder instancia = new SingletonPreguicosoHolder();
	}
	
	private SingletonPreguicosoHolder() {
		
	}
	
	public static SingletonPreguicosoHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
