
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test1
{
	public Trasa trasa1;
	public Vlak vlak1;

	public Test1()
	{

	}

	/**
	 * Sets up the test fixture.
	 *
	 * Called before every test case method.
	 */
	@Before
	public void setUp()
	{
		String[] nS1 = { "Olomouc", "Ceska Trebova", "Praha" };
		int[] kS1 = { 0, 10, 20 };

		this.trasa1 = new Trasa( nS1, kS1 );

		this.vlak1 = new Vlak( "vlak1", trasa1, 100 );
	}

	/**
	 * Tears down the test fixture.
	 *
	 * Called after every test case method.
	 */
	@After
	public void tearDown()
	{

	}
}
