import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Esta clase es el Main principal del programa
 * Dependiendo de si el usuario esta permanentemente registro, abre el Login o el Dashboard directamente
 */
public class MainStart {
	
	private static String OS = System.getProperty("os.name").toLowerCase();
	
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
			
			
			File archivo = null;
			FileReader fr;
			BufferedReader br;
			ArrayList<String> retorno = new ArrayList<String>();
			try {
				
				if (isWindows()) {
					archivo = new File("C:\\Users\\"+ System.getProperty("user.name") +"\\Documents\\tempUsuario.txt");
				}else if (isMac()) {
					archivo = new File("/Users/"+ System.getProperty("user.name") +"/Documents/tempUsuario.txt");
				}
				
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);
				
				String linea;
				
				while((linea = br.readLine()) != null) {
					retorno.add(linea);
					
				}
				
				for (int i = 0;i<= retorno.size() -1;i++) {
					retorno.set(i, decode(retorno.get(i)));
				}
				
				br.close();
				fr.close();
				
				
			} catch (Exception e) {}
			
			return retorno;
		}
		
		
		/**
		 * funcion para decodificar
		 * @param a
		 * @return
		 */
		public static String decode(String a){
			java.util.Base64.Decoder decoder = java.util.Base64.getDecoder();
			byte[] decodedByteArray = decoder.decode(a);
	     
			String b = new String(decodedByteArray);        
			return b;
		}
		
		
		/**
		 * indentifica se es windows
		 * @return
		 */
		public static boolean isWindows() {
	        return (OS.indexOf("win") >= 0);
	    }
	 
		/**
		 * identifica si el sistema es mac
		 * @return
		 */
	    public static boolean isMac() {
	        return (OS.indexOf("mac") >= 0);
	    }
		
		
}
