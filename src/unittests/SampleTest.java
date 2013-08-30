package unittests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.rfaisal.junitjson.AssertWebApi;

public class SampleTest {

	@Test
	public void testAssertWebApi() throws IOException {
		new AssertWebApi(null, "http://api.bluebox.com/fb/user/friends?sid=12132:qt3hjv61ddpm95r7n08nnooug4");
	}

}
