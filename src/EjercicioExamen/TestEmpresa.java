package EjercicioExamen;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestEmpresa {
	@Test
	  public void valido1()
	  {
	    Assert.assertEquals(300L, RRHHEmpresa.Datos("100", "Diego Alvarez", "1", "SI"));
	  }
	  

	  @Test
	  public void valido2()
	  {
	  Assert.assertEquals(500L, RRHHEmpresa.Datos("101", "Alba Gomez", "7", "NO"));
	  }
	  

	  @Test(expected=Exception.class)
	  public void CodigoCero()
	  {
		  RRHHEmpresa.Datos("000", "Jesus Garcia", "10", "SI");
	  }
	  

	  @Test(expected=Exception.class)
	  public void CodigoMayor999()
	  {
		  RRHHEmpresa.Datos("1001", "Carmen Ruiz", "09", "NO");
	  }
	  

	  @Test(expected=Exception.class)
	  public void CodigoCaracter()
	  {
		  RRHHEmpresa.Datos("abc", "Sandra Lopez", "02", "SI");
	  }
	  

	  @Test(expected=Exception.class)
	  public void NombreLargo()
	  {
		  RRHHEmpresa.Datos("123", "Juan Gonzalez Fernandez", "03", "SI");
	  }
	  

	  @Test(expected=Exception.class)
	  public void AntiguNegativa()
	  {
		  RRHHEmpresa.Datos("123", "Carmen Ruiz", "-1", "SI");
	  }
	  

	  @Test(expected=Exception.class)
	  public void ExcedeAntigu()
	  {
		  RRHHEmpresa.Datos("123", "Carmen Ruiz", "111", "NO");
	  }
	  

	  @Test(expected=Exception.class)
	  public void AntiguNoNum()
	  {
		  RRHHEmpresa.Datos("123", "Carmen Ruiz", "ab", "NO");
	  }
	  

	  @Test(expected=Exception.class)
	  public void PlusNoValido()
	  {
		  RRHHEmpresa.Datos("123", "Carmen Ruiz", "08", "*");
	  }


}
