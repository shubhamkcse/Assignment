import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;

public class Simple {

	
	public void testSimple()
	{
		List mocklist = mock(List.class);
		when(mocklist.size()).thenReturn(1);
		Assert.assertEquals(1, mocklist.size());
		System.out.println(mocklist.size());
		System.out.println(mocklist);
	}
}
