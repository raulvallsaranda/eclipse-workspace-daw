package tema03.cadenes.exemples;

import java.io.IOException;

public class ExecutaFirefoxProcessBuilder {
    public static void main(String[] args)
    {
    	try {
			ProcessBuilder process = new ProcessBuilder("/usr/bin/firefox", "https://www.ubuntu.com");
			process.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}