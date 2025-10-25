import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrimeTest {
	@Test
	void primes() {
		IsPrime s=new IsPrime();
		boolean result=s.prime(5);
		assertEquals(true,result,"success");
		
	}

}
