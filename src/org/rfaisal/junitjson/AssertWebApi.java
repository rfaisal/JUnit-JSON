package org.rfaisal.junitjson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;





public class AssertWebApi {
	private String jsonUrl;
	public AssertWebApi(JSONObject expected, String jsonUrl) throws IOException{
		this.jsonUrl=jsonUrl;
		
		URL url = new URL(jsonUrl);
		URLConnection con = url.openConnection();
	//	String charset = m.matches() ? m.group(1) : "ISO-8859-1";
		Reader r = new InputStreamReader(con.getInputStream(), "ISO-8859-1");
		StringBuilder buf = new StringBuilder();
		while (true) {
		  int ch = r.read();
		  if (ch < 0)
		    break;
		  buf.append((char) ch);
		}
		String str = buf.toString();
	//	String s=IOUtils.toString(con.getInputStream(), "ISO-8859-1");
		JSONObject b= new JSONObject(str);
		System.out.println(str);
		System.out.println(b.toString());
	//	String str = IOUtils.toString(con.getInputStream(), charset);
	}
}
