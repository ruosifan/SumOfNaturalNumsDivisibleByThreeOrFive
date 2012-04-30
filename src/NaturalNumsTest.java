import static org.junit.Assert.*;

import org.junit.Test;



public class NaturalNumsTest {


	@Test
	public void shouldFindAllNumsDivisibleByThreeOrFive(){
		NaturalNums nn = new NaturalNums();
		assertEquals(nn.run(10), 3+5+6+9);
	}

}
