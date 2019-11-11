package refactoringExcercise;

import java.util.Properties;
import java.util.StringTokenizer;

public class StartApp {
	
	public static void main(String [] args) {
		Properties props = new Properties();
		for (int i = 0; i < args.length; i++) {
			if (args[i].startsWith("-D")) {
				String s = args[i].substring(2);
				addProp(props, s);
			}
		}
		//continue
	}

	private static void addProp(Properties props, String s) {
		StringTokenizer st = new StringTokenizer(s, "=");
		if(st.countTokens() == 2) {
			props.setProperty(st.nextToken(), st.nextToken());
		}
	}
}