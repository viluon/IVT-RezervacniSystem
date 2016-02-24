
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test1
{
	private Trasa trasa1;
	private Vlak R110;
	private Vlak R203;

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
		String[] nS1 = { "Olomouc", "Ceska Trebova", "Pardubice", "Praha", "Kolin" };
		int[] kS1 = { 0, 72, 164, 210, 240 };

		this.trasa1 = new Trasa( nS1, kS1 );

		this.R110 = new Vlak( "R110", trasa1, 100 );
		this.R203 = new Vlak( "R203", trasa1, 70 );
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
