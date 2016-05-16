package control;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import model.Calculadora;

public class TesteCalc {
	
	Calculadora c;
	
	@Before
	public void setup(){
		c = new Calculadora();
	}
	
	@Test
	public void calcIMC(){
		Assert.assertEquals(21.6, c.calcIMC(70, 1.80));	
	}
	
	@Test
	public void baixoMuitoGrave(){
		Assert.assertEquals("Baixo peso muito grave" , c.calcCond(15));
	}
	
	@Test
	public void baixoPesoGrave(){
		Assert.assertEquals("Baixo peso grave" , c.calcCond(16.80));
	}
	
	@Test
	public void baixoPeso(){
		Assert.assertEquals("Baixo peso" , c.calcCond(18));
	}
	
	@Test
	public void pesoNormal(){
		Assert.assertEquals("Peso normal" , c.calcCond(23));
	}
	
	@Test
	public void sobrePeso(){
		Assert.assertEquals("Sobrepeso" , c.calcCond(29));
	}
	
	@Test
	public void obesidadeI(){
		Assert.assertEquals("Obesidade grau I " , c.calcCond(34));
	}
	
	@Test
	public void obesidadeII(){
		Assert.assertEquals("Obesidade grau II " , c.calcCond(39));
	}
	
	@Test
	public void obesidadeMorbida(){
		Assert.assertEquals("Obesidade grau III (obesidade mórbida)" , c.calcCond(41));
	}
}
