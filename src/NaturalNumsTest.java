import static org.junit.Assert.*;
import org.junit.Test;

public class NaturalNumsTest {

	@Test
	public void shouldReturnFalse(){
		NaturalNums nn = new NaturalNums();
		assertEquals(false, nn.isItDivisible(11));
	}
	
	@Test
	public void shouldReturnTrue(){
		NaturalNums nn = new NaturalNums();
		assertEquals(true, nn.isItDivisible(36));
	}
	
	@Test
	public void shouldFindAllNumsDivisibleByThreeOrFiveUnderTen(){
		NaturalNums nn = new NaturalNums();
		assertEquals(3+5+6+9, nn.run(10));
	}

	@Test
	public void shouldReturnZero(){
		NaturalNums nn = new NaturalNums();
		assertEquals(0, nn.run(1));
	}
}
