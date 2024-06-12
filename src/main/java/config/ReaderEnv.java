package config;

import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;

public class ReaderEnv {
	
	String pathFile = "env";
	
	File file = new File(pathFile);
	
	public String readEnv(String var) {
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			
			while ((line = br.readLine()) != null) {
                // Buscar variavel (var) no arquivo
            }
			
			br.close();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
