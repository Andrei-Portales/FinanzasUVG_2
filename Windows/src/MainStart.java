import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Esta clase es el Main principal del programa
 * Dependiendo de si el usuario esta permanentemente registro, abre el Login o el Dashboard directamente
 */
public class MainStart {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> usu = leerUsu();
		
		try {
		if (Boolean.parseBoolean(usu.get(1)) == true) {
			Dashboard.main(null);
		}
		else if (Boolean.parseBoolean(usu.get(1)) == false) {
			Login.main(null);
		}
		}catch(Exception e) {
			Login.main(null);
		
		}
	}
		
		//Guarda el nombre de usuario en un archivo de texto momentaneo para comunicarse con el Dashboard
		private static  ArrayList<String> leerUsu() {
			
			
			File archivo;
			FileReader fr;
			BufferedReader br;
			ArrayList<String> retorno = new ArrayList<String>();
			try {
				
				archivo = new File("tempUsuario.txt");
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);
				
				String linea;
				
				while((linea = br.readLine()) != null) {
					retorno.add(linea);
					
				}
				
				br.close();
				fr.close();
				
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Ha sucedido un error leyendo el archivo " + e);
			}
			
			return retorno;
		}

		
}
