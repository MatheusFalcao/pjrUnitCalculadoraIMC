package teste;

import org.junit.Before;
import org.junit.Test;

import control.CalculadoraIMC;
import junit.framework.Assert;

public class TesteCalc {
	
	CalculadoraIMC c;
	
	@Before
	public void setup(){
		c = new CalculadoraIMC();
	}

	@Test
	public void TestAdultoBaixoPesoMuitoGrave(){
		Assert.assertEquals("BAIXO PESO MUITO GRAVE", c.calcularIMC("feminino", 1.80, 50., 21));
	}

	@Test
	public void TestAdultoBaixoPesoGrave(){
		Assert.assertEquals("BAIXO PESO GRAVE", c.calcularIMC("feminino", 1.70, 48., 64));
	}
	
	@Test
	public void TestAdultoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("masculino",  1.70, 50., 64));
	}
	
	@Test
	public void TestAdultoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("masculino", 1.70, 54., 21));
	}
	
	@Test
	public void TestAdultoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("feminino", 1.60, 65., 21));
	}

	@Test
	public void TestAdultoObesidadeGrauUm(){
		Assert.assertEquals("OBESIDADE GRAVE I", c.calcularIMC("masculino", 1.60, 78., 64));
	}

	@Test
	public void TestAdultoObesidadeGrauDois(){
		Assert.assertEquals("OBESIDADE GRAVE II", c.calcularIMC("masculino", 1.70, 102., 64));
	}
	
	@Test
	public void TestAdultoObesidadeGrauTres(){
		Assert.assertEquals("OBESIDADE GRAVE III (OBESIDADE MÓRBIDA)", c.calcularIMC("masculino", 1.70, 120., 21));
	}

	/*
	 * IDOSO
	 */
	
	
	@Test
	public void TestIdosoFemininoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("feminino", 1.70, 60., 66));
	}
	
	@Test
	public void TestIdosoFemininoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("feminino", 1.70, 65., 66));
	}
	
	@Test
	public void TestIdosoFemininoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("feminino", 1.60, 70., 66));
	}
	
	@Test
	public void TestIdosoFemininoObesidadeGrauUm(){
		Assert.assertEquals("OBESIDADE GRAVE I", c.calcularIMC("feminino", 1.60, 84., 66));
	}	
	
	@Test
	public void TestIdosoFemininoObesidadeGrauDois(){
		Assert.assertEquals("OBESIDADE GRAVE II", c.calcularIMC("feminino", 1.60, 97., 66));
	}
	
	@Test
	public void TestIdosoFemininoObesidadeGrauTres(){
		Assert.assertEquals("OBESIDADE GRAVE III (OBESIDADE MÓRBIDA)", c.calcularIMC("feminino", 1.70, 123., 66));
	}	
	
	@Test
	public void TestIdosoMasculinoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("masculino", 1.60, 53., 66));
	}
	
	@Test
	public void TestIdosoMasculinoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("masculino", 1.60, 58., 66));
	}
	
	@Test
	public void TestIdosoMasculinoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("masculino", 1.60, 70., 66));
	}
	
	@Test
	public void TestIdosoMasculinoObesidadeGrauUm(){
		Assert.assertEquals("OBESIDADE GRAVE I", c.calcularIMC("masculino", 1.70, 90., 66));
	}	
	
	@Test
	public void TestIdosoMasculinoObesidadeGrauDois(){
		Assert.assertEquals("OBESIDADE GRAVE II", c.calcularIMC("masculino", 1.70, 104., 66));
	}
	
	@Test
	public void TestIdosoMasculinoObesidadeGrauTres(){
		Assert.assertEquals("OBESIDADE GRAVE III (OBESIDADE MÓRBIDA)", c.calcularIMC("masculino", 1.70, 120., 66));
	}	

	
	
	@Test
	public void TestCriancaDoisAnosFemininoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("feminino", 1., 14., 2));
	}
	
	@Test
	public void TestCriancaDoisAnosFemininoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("feminino", 1., 15., 2));
	}
	
	@Test
	public void TestCriancaDoisAnosFemininoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("feminino", 1., 18., 2));
	}
	
	@Test
	public void TestCriancaDoisAnosFemininoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("feminino", 1., 21., 2));
	}

	@Test
	public void TestCriancaQuatroAnosFemininoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("feminino", 1.05, 15.1, 4));
	}
	
	@Test
	public void TestCriancaQuatroAnosFemininoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("feminino", 1.05, 16., 4));
	}
	
	@Test
	public void TestCriancaQuatroAnosFemininoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("feminino", 1.05, 19., 4));
	}
	
	@Test
	public void TestCriancaQuatroAnosFemininoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("feminino", 1.05, 20., 4));
	}

	@Test
	public void TestCriancaSeisAnosFemininoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("feminino", 1.15, 18., 6));
	}
	
	@Test
	public void TestCriancaSeisAnosFemininoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("feminino", 1.15, 19., 6));
	}
	
	@Test
	public void TestCriancaSeisAnosFemininoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("feminino", 1.15, 23., 6));
	}
	
	@Test
	public void TestCriancaSeisAnosFemininoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("feminino", 1.15, 26., 6));
	}
	
	@Test
	public void TestCriancaOitoAnosFemininoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("feminino", 1.25, 21., 8));
	}
	
	@Test
	public void TestCriancaOitoAnosFemininoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("feminino", 1.25, 22., 8));
	}
	
	@Test
	public void TestCriancaOitoAnosFemininoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("feminino", 1.25, 29., 8));
	}
	
	@Test
	public void TestCriancaOitoAnosFemininoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("feminino", 1.25, 31., 8));
	}
	
	@Test
	public void TestCriancaDezAnosFemininoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("feminino", 1.40, 27.5, 10));
	}
	
	@Test
	public void TestCriancaDezAnosFemininoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("feminino", 1.40, 29., 10));
	}
	
	@Test
	public void TestCriancaDezAnosFemininoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("feminino", 1.40, 40., 10));
	}
	
	@Test
	public void TestCriancaDezAnosFemininoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("feminino", 1.40, 47., 10));
	}
	
	@Test
	public void TestCriancaDozeAnosFemininoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("feminino", 1.45, 30.5, 12));
	}
	
	@Test
	public void TestCriancaDozeAnosFemininoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("feminino", 1.45, 33., 12));
	}
	
	@Test
	public void TestCriancaDozeAnosFemininoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("feminino", 1.45, 45., 12));
	}
	
	@Test
	public void TestCriancaDozeAnosFemininoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("feminino", 1.45, 54., 12));
	}
	
	@Test
	public void TestCriancaQuatorzeAnosFemininoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("feminino", 1.50, 35., 14));
	}
	
	@Test
	public void TestCriancaQuatorzeAnosFemininoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("feminino", 1.50, 36.5, 14));
	}
	
	@Test
	public void TestCriancaQuatorzeAnosFemininoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("feminino", 1.50, 53., 14));
	}
	
	@Test
	public void TestCriancaQuatorzeAnosFemininoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("feminino", 1.50, 61., 14));
	}
	
	@Test
	public void TestCriancaDezesseisAnosFemininoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("feminino", 1.55, 39., 16));
	}
	
	@Test
	public void TestCriancaDezesseisAnosFemininoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("feminino", 1.55, 43., 16));
	}
	
	@Test
	public void TestCriancaDezesseisAnosFemininoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("feminino", 1.55, 68., 16));
	}
	
	@Test
	public void TestCriancaDezesseisAnosFemininoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("feminino", 1.55, 73., 16));
	}
	
	@Test
	public void TestCriancaDezoitoAnosFemininoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("feminino", 1.60, 45., 18));
	}
	
	@Test
	public void TestCriancaDezoitoAnosFemininoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("feminino", 1.60, 49., 18));
	}
	
	@Test
	public void TestCriancaDezoitoAnosFemininoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("feminino", 1.60, 65., 18));
	}
	
	@Test
	public void TestCriancaDezoitoAnosFemininoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("feminino", 1.65, 87., 18));
	}
	
	@Test
	public void TestCriancaVinteAnosFemininoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("feminino", 1.70, 50., 20));
	}
	
	@Test
	public void TestCriancaVinteAnosFemininoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("feminino", 1.70, 54., 20));
	}
	
	@Test
	public void TestCriancaVinteAnosFemininoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("feminino", 1.70, 77., 20));
	}
	
	@Test
	public void TestCriancaVinteAnosFemininoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("feminino", 1.70, 92., 20));
	}


	//---------MASCULINO CRIANÇA-----------//
	
	@Test
	public void TestCriancaDoisAnosMasculinoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("masculino", 1., 14.5, 2));
	}
	
	@Test
	public void TestCriancaDoisAnosMasculinoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("masculino", 1., 15., 2));
	}
	
	@Test
	public void TestCriancaDoisAnosMasculinoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("masculino", 1., 18., 2));
	}
	
	@Test
	public void TestCriancaDoisAnosMasculinoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("masculino", 1., 21., 2));
	}

	@Test
	public void TestCriancaQuatroAnosMasculinoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("masculino", 1.05, 15.5, 4));
	}
	
	@Test
	public void TestCriancaQuatroAnosMasculinoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("masculino", 1.05, 16., 4));
	}
	
	@Test
	public void TestCriancaQuatroAnosMasculinoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("masculino", 1.05, 19., 4));
	}
	
	@Test
	public void TestCriancaQuatroAnosMasculinoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("masculino", 1.05, 20., 4));
	}

	@Test
	public void TestCriancaSeisAnosMasculinoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("masculino", 1.15, 18.5, 6));
	}
	
	@Test
	public void TestCriancaSeisAnosMasculinoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("masculino", 1.15, 19., 6));
	}
	
	@Test
	public void TestCriancaSeisAnosMasculinoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("masculino", 1.15, 23., 6));
	}
	
	@Test
	public void TestCriancaSeisAnosMasculinoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("masculino", 1.15, 26., 6));
	}
	
	@Test
	public void TestCriancaOitoAnosMasculinoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("masculino", 1.25, 21.5, 8));
	}
	
	@Test
	public void TestCriancaOitoAnosMasculinoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("masculino", 1.25, 23., 8));
	}
	
	@Test
	public void TestCriancaOitoAnosMasculinoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("masculino", 1.25, 30., 8));
	}
	
	@Test
	public void TestCriancaOitoAnosMasculinoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("masculino", 1.25, 32., 8));
	}
	
	@Test
	public void TestCriancaDezAnosMasculinoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("masculino", 1.40, 27.5, 10));
	}
	
	@Test
	public void TestCriancaDezAnosMasculinoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("masculino", 1.40, 29., 10));
	}
	
	@Test
	public void TestCriancaDezAnosMasculinoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("masculino", 1.40, 40., 10));
	}
	
	@Test
	public void TestCriancaDezAnosMasculinoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("masculino", 1.40, 47., 10));
	}
	
	@Test
	public void TestCriancaDozeAnosMasculinoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("masculino", 1.45, 30.5, 12));
	}
	
	@Test
	public void TestCriancaDozeAnosMasculinoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("masculino", 1.45, 33., 12));
	}
	
	@Test
	public void TestCriancaDozeAnosMasculinoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("masculino", 1.45, 45., 12));
	}
	
	@Test
	public void TestCriancaDozeAnosMasculinoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("masculino", 1.45, 54., 12));
	}
	
	@Test
	public void TestCriancaQuatorzeAnosMasculinoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("masculino", 1.50, 36., 14));
	}
	
	@Test
	public void TestCriancaQuatorzeAnosMasculinoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("masculino", 1.50, 37., 14));
	}
	
	@Test
	public void TestCriancaQuatorzeAnosMasculinoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("masculino", 1.50, 53., 14));
	}
	
	@Test
	public void TestCriancaQuatorzeAnosMasculinoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("masculino", 1.50, 61., 14));
	}
	
	@Test
	public void TestCriancaDezesseisAnosMasculinoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("masculino", 1.55, 41., 16));
	}
	
	@Test
	public void TestCriancaDezesseisAnosMasculinoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("masculino", 1.55, 43., 16));
	}
	
	@Test
	public void TestCriancaDezesseisAnosMasculinoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("masculino", 1.55, 59., 16));
	}
	
	@Test
	public void TestCriancaDezesseisAnosMasculinoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("masculino", 1.55, 73., 16));
	}
	
	@Test
	public void TestCriancaDezoitoAnosMasculinoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("masculino", 1.60, 48., 18));
	}
	
	@Test
	public void TestCriancaDezoitoAnosMasculinoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("masculino", 1.60, 49., 18));
	}
	
	@Test
	public void TestCriancaDezoitoAnosMasculinoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("masculino", 1.60, 66., 18));
	}
	
	@Test
	public void TestCriancaDezoitoAnosMasculinoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("masculino", 1.60, 81., 18));
	}
	
	@Test
	public void TestCriancaVinteAnosMasculinoBaixoPeso(){
		Assert.assertEquals("BAIXO PESO", c.calcularIMC("masculino", 1.70, 55., 20));
	}
	
	@Test
	public void TestCriancaVinteAnosMasculinoPesoNormal(){
		Assert.assertEquals("PESO NORMAL", c.calcularIMC("masculino", 1.70, 58., 20));
	}
	
	@Test
	public void TestCriancaVinteAnosMasculinoSobrepeso(){
		Assert.assertEquals("SOBREPESO", c.calcularIMC("masculino", 1.70, 80., 20));
	}
	
	@Test
	public void TestCriancaVinteAnosMasculinoObesidade(){
		Assert.assertEquals("OBESIDADE", c.calcularIMC("masculino", 1.70, 92., 20));
	}

}
