package gof;

import gof.facade.Facade;
import gof.singleton.SingletonApressado;
import gof.singleton.SingletonPreguicoso;
import gof.singleton.SingletonPreguicosoHolder;
import gof.strategy.Comportamento;
import gof.strategy.ComportamentoAgressivo;
import gof.strategy.ComportamentoDefensivo;
import gof.strategy.ComportamentoNormal;
import gof.strategy.Bot;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		SingletonPreguicoso preguicoso = SingletonPreguicoso.getInstancia();
		System.out.println(preguicoso);
		preguicoso = SingletonPreguicoso.getInstancia();
		System.out.println(preguicoso);
		
		SingletonApressado apressado = SingletonApressado.getInstancia();
		System.out.println(apressado);
		apressado = SingletonApressado.getInstancia();
		System.out.println(apressado);
		
		SingletonPreguicosoHolder preguicosoHolder = SingletonPreguicosoHolder.getInstancia();
		System.out.println(preguicosoHolder);
		preguicosoHolder = SingletonPreguicosoHolder.getInstancia();
		System.out.println(preguicosoHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Bot robo = new Bot();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Davi José", "75044070");
	}

}
