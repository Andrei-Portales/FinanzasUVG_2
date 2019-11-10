import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;
import java.math.BigInteger;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.bson.Document;
import org.bson.internal.Base64;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*@author: POO
*Esta clase permite crear una conexion con MongoDB
*Posee metodos que interactuan con la base de datos, como creacion de usuarios, cambios de contrasena
*encriptacion de datos privados y envio de correos electronicos con codigo de verificacacion para 
*recuperacion de contrasenas
*/
public class ConexionMongoDB {
	/*	External Archives
	 * 	mongodb-driver-3.6.3.jar
	 * 	mongo-java-driver-3.6.3.jar
	 */
	
	private static ConexionMongoDB DB;
	private static String OS = System.getProperty("os.name").toLowerCase();
	private MongoClient mongoClient;
	private MongoDatabase mongoDatabase;
	private MongoCollection<Document> usuarios;
	private MongoCollection<Document> datos;
	private MongoCollection<Document> codigorr;
	private MongoCollection<Document> calendario;
	
	
	public ConexionMongoDB() {
		
		try {
			
			
		MongoClientURI uri = new MongoClientURI("mongodb://utqvfn9edhohqnxtn5rr:0Y6VR4AXz3k8QUMPMvk9@bhwcmxxhfbpi38d-mongodb.services.clever-cloud.com:27017/bhwcmxxhfbpi38d");

		mongoClient = new MongoClient(uri);
		mongoDatabase = mongoClient.getDatabase("bhwcmxxhfbpi38d");
		usuarios = mongoDatabase.getCollection("usuarios");
		codigorr = mongoDatabase.getCollection("codigo");
		datos = mongoDatabase.getCollection("datos");
		calendario = mongoDatabase.getCollection("calendario");
		
		
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "No se logro conectar al servidor");
		}
		
	}
	
	
	public static ConexionMongoDB getConexion() {
        if (DB == null){
            DB = new ConexionMongoDB();
        }
        return DB;
	}
	
	
	/**
	 * funcion para cerrar conexion con base de datos
	 */
	public void close() {
		mongoClient.close();
	}
	
	/**
	 * funcion para verificar si la contrasena es verdadera o no
	 * @param correo
	 * @param contrasena
	 * @return
	 */
	public boolean verificarUsuario(String correo, String contrasena) {
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("correo", correo);
		FindIterable<Document> cursor = usuarios.find(searchQuery);
		String contra = "";
		
		for(Document doc : cursor) {
			contra = doc.getString("contrasena");
		}
		boolean retorno = false;
		if (getMD5(contrasena).equals(contra)) {
			retorno =  true;
		}else {
			retorno =  false;
		}
		return retorno;
		
	}
	
	
	/**
	 * Funcion para crear un usuario con los parametros asignado
	 * @param correo
	 * @param contrasena
	 * @param nombre
	 * @param apellido
	 * @return
	 */
	public String crearUsuario(String correo, String contrasena, String nombre, String apellido) {
		
		Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        
        Matcher mather = pattern.matcher(correo);
        
        
        if (contrasena.length() < 8) {
        	return "contrasenaCorta";
        }
 
        if (mather.find() == false) {
           return "novalido";
        }
		
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("correo", correo);
		FindIterable<Document> cursor = usuarios.find(searchQuery);
		
		String usuar = "";
		for(Document doc : cursor) {
			usuar = doc.getString("correo");
		}
		
		if (correo.equals((String)usuar)) {
			return "existe";
			
		}
		
		
		
		Document document = new Document();
		document.put("correo", correo);
		document.put("contrasena", getMD5(contrasena));
		document.put("nombre", (nombre.substring(0,1).toUpperCase() + nombre.substring(1).toLowerCase()));
		document.put("apellido", (apellido.substring(0,1).toUpperCase() + apellido.substring(1).toLowerCase()));
		document.put("estado", "gratuito");
		document.put("imagen", "");
		usuarios.insertOne(document);
		
		Document document1 = new Document();
		document1.put("correo",correo);
		document1.put("codigo","");
		codigorr.insertOne(document1);
		
		
		Document ingreso = new Document();
		ingreso.put("correo",correo);
		ingreso.put("ingresos","ingresos");
		ingreso.put("Sueldos","0");
		ingreso.put("Bonos","0");
		ingreso.put("Reembolsos","0");
		ingreso.put("Rentas","0");
		ingreso.put("Subsidios","0");
		ingreso.put("Inversiones","0");
		ingreso.put("Otros","0");
		datos.insertOne(ingreso);
		Document gasto = new Document();
		gasto.put("correo", correo);
		gasto.put("gastos", "gastos");
		gasto.put("Sueldos","0");
		gasto.put("Bonos","0");
		gasto.put("Reembolsos","0");
		gasto.put("Rentas","0");
		gasto.put("Subsidios","0");
		gasto.put("Inversiones","0");
		gasto.put("Otros","0");
		datos.insertOne(gasto);
		Document calendar = new Document();
		calendar.put("correo", correo);
		calendario.insertOne(calendar);
		
		
		return "completado";
		
	}
	
	
		
	
	/**
	 * esta funcion manda un correo al usuario que quiere restablecer contrasena y consulta en la base de datos nombre, apellido y guarda el codigo generado en la base de datos
	 * @param correo
	 * @return
	 */
	public boolean mandarCorreoRecuperacion(String correo) {
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("correo", correo);
		FindIterable<Document> cursor = usuarios.find(searchQuery);
		
		String usuar = "";
		String nombre = "";
		String apellido = "";
		
		
		for(Document doc : cursor) {
			usuar = doc.getString("correo");
			nombre = doc.getString("nombre");
			apellido = doc.getString("apellido");
		}
		
		if (correo.equals((String)usuar)) {
			
			String asunto = "Recuperacion de contrasena";
			String codigo = crearCodigo();
			String cuerpo = "\n\n\n Estimado/a " + nombre + " " + apellido + "\n\n\nSu codigo de recuperaci�n es: "+ codigo;
			
			enviarCorreo(correo,asunto,cuerpo);
			
			BasicDBObject query = new BasicDBObject();
			query.put("correo", correo);
			BasicDBObject newDocument = new BasicDBObject();
			newDocument.put("codigo", codigo);
			BasicDBObject updateObj = new BasicDBObject();
			updateObj.put("$set", newDocument);
			codigorr.updateOne(query, updateObj);// or mongoCollection.updateMany(query, updateObj);
			
			
			return true;
			
		}
		
		return false;
	
	}
	
	/**
	 * funcion para validar el codigo de recuperacion en la base de datos
	 * @param codigo
	 * @param correo
	 * @return
	 */
	public boolean validarCodigo(String codigo, String correo) {
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("correo", correo);
		FindIterable<Document> cursor = codigorr.find(searchQuery);
		String cod = "";
		
		for(Document doc : cursor) {
			cod = doc.getString("codigo");
			
		}
		
		if (codigo.equals((String)cod)) {
			return true;
		}
		return false;
		
	}
	
	
	
	/**
	 * funcion para eliminar un documento
	 * @param parameter
	 */
	public void deleteDocuments(String parameter) {
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("parameter", parameter);

		usuarios.deleteMany(searchQuery);//or mongoCollection.deleteOne(searchQuery);
	}

	
	
	
	/**
	 * Esta fuccion genera un codido de recuperacion aleatorio 
	 * @return codigo: codigo generado
	 */
	public String crearCodigo() {
		Random r = new Random();
		
		String codigo = "";
		
		for(int i = 1; i <= 5; i = i + 1){
			char c = (char)(r.nextInt(26) + 'A');
			int numero = (int) (Math.random() * 9) + 1;
			codigo = codigo + c + numero;
		}
		
		return codigo;
				
	}
	
	/**
	 * Funcion para cambiar la contrasena a un usuario
	 * @param correo
	 * @param contrasenaNueva
	 * @return
	 */
	public boolean cambiarContrasena(String correo, String contrasenaNueva) {
		
		try {
		BasicDBObject query = new BasicDBObject();
		query.put("correo", correo);

		BasicDBObject newDocument = new BasicDBObject();
		newDocument.put("contrasena",  getMD5(contrasenaNueva));
					
		BasicDBObject updateObj = new BasicDBObject();
		updateObj.put("$set", newDocument);
		
		usuarios.updateOne(query, updateObj);
		return true;
		
		}catch (Exception e) {
			return false;
		}
	}
	
	
	/**
	 * Fucion para encriptar la contrasena del usuario para que sea mas segura
	 * @param input
	 * @return Contrasena encriptada
	 */
	public String getMD5(String input) {
		 try {
		 MessageDigest md = MessageDigest.getInstance("MD5");
		 byte[] messageDigest = md.digest(input.getBytes());
		 BigInteger number = new BigInteger(1, messageDigest);
		 String hashtext = number.toString(16);

		 while (hashtext.length() < 32) {
		 hashtext = "0" + hashtext;
		 }
		 return hashtext;
		 }
		 catch (NoSuchAlgorithmException e) {
		 throw new RuntimeException(e);
		 }
		 }
	
	
	/**
	 * Funcion para poder mandar un correo al correo asinado
	 * @param destinatario
	 * @param asunto
	 * @param cuerpo
	 */
	public void enviarCorreo(String destinatario, String asunto, String cuerpo) {
	    String remitente = "finanzasUVG9173";  

	    Properties props = System.getProperties();
	    props.put("mail.smtp.host", "smtp.gmail.com");  
	    props.put("mail.smtp.user", remitente);
	    props.put("mail.smtp.clave", "FinanzasUVG123");  
	    props.put("mail.smtp.auth", "true");  
	    props.put("mail.smtp.starttls.enable", "true"); 
	    props.put("mail.smtp.port", "587");

	    Session session = Session.getDefaultInstance(props);
	    MimeMessage message = new MimeMessage(session);

	    try {
	        message.setFrom(new InternetAddress(remitente));
	        message.addRecipients(Message.RecipientType.TO, destinatario);   //Se podr�an a�adir varios de la misma manera
	        message.setSubject(asunto);
	        message.setText(cuerpo);
	        Transport transport = session.getTransport("smtp");
	        String clave = "FinanzasUVG123";
			transport.connect("smtp.gmail.com", remitente, clave );
	        transport.sendMessage(message, message.getAllRecipients());
	        transport.close();
	    }
	    catch (MessagingException me) {
	        me.printStackTrace();   
	    }
	}
	
	/**
	 * Esta fuencion es para pedir el nombre del usuario en la base de datos para mostrarlo en el dashboard
	 * @return nombre del usuario
	 */
	public String[] getNombre(String correo) {
		String[] retorno = new String[2];
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("correo", correo);
		FindIterable<Document> cursor = usuarios.find(searchQuery);
		String nombre = "";
		String apellido = "";
		
		for(Document doc : cursor) {
			nombre = doc.getString("nombre");
			apellido = doc.getString("apellido");
		}
		
		retorno[0] = nombre;
		retorno[1] = apellido;
		return retorno;
		
		
	}
	
	
	
	/**
	 * Funcion para guardar el usuario que ingreso en un txt para poder usarlo en las demas vistas de la aplicacion
	 * @param usuario
	 */
	public void tempUsu(String usuario, boolean estado) {
		
		File f = null;
		FileWriter w;
		BufferedWriter bw;
		PrintWriter wr;
		
		if (isWindows()) {
			f = new File("C:\\Users\\"+ System.getProperty("user.name") +"\\Documents\\tempUsuario.txt");
		}else if (isMac()) {
			f = new File("/Users/"+ System.getProperty("user.name") +"/Documents/tempUsuario.txt");
		}
		
		try {
			
			w = new FileWriter(f);
			bw = new BufferedWriter(w);
			wr = new PrintWriter(bw);
			
			wr.write(encode(usuario));
			wr.append("\n" + encode(Boolean.toString(estado)));
			
			
			wr.close();
			bw.close();
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ha sucedido un error " + e);
		}

	}
	
	
	/**
	 * Funcion para leer el usuario que ingreso guardado en un txt temporal
	 * @return
	 */
	public ArrayList<String> leerUsu() {
		
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
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ha sucedido un error leyendo el archivo " + e);
		}
		
		return retorno;
	}
	
	
	
	
	/**
	 * Funcion para agregar o cambiar cuentas
	 * @param correo
	 * @param cuenta
	 * @param nombre
	 * @param cantidad
	 * @return
	 */
	public boolean modificarCuenta(String correo, String cuenta, String nombre, double cantidad) {
		
		try {
			BasicDBObject query = new BasicDBObject();
			query.put("correo", correo);
			query.put(cuenta,cuenta);
			
			BasicDBObject newDocument = new BasicDBObject();
			newDocument.put(nombre, Double.toString(cantidad));
			
			BasicDBObject updateObj = new BasicDBObject();
			updateObj.put("$set", newDocument);
			datos.updateOne(query, updateObj);
			return true;
			
			}catch (Exception e) {
			return false;
		}
		
	}
	
	
	/**
	 * Funcion para eliminar una cuenta
	 * @param correo
	 * @param cuenta
	 * @param nombre
	 * @return valor de la cuenta consultada
	 */
	public void eliminarCuenta(String correo, String cuenta, String nombre) {
		
	
		BasicDBObject query = new BasicDBObject();
		query.put("correo", correo);
		query.put(cuenta,cuenta);
		
		FindIterable<Document> cursor = datos.find(query);
		String value = "";
		
		for(Document doc : cursor) {
			value = doc.getString(nombre);
		}
		
		BasicDBObject newDocument = new BasicDBObject();
		newDocument.put(nombre,value);
		
		BasicDBObject updateObj = new BasicDBObject();
		updateObj.put("$unset", newDocument);
		datos.updateOne(query, updateObj);
	

	}
	
	
	
	
	
	@SuppressWarnings("unchecked")
	public String[][] getCuenta(String correo, String cuenta){
		String[][] retorno;
		ArrayList<String> keys= new ArrayList<String>() ;
		ArrayList<String> values = new ArrayList<String>() ;
		
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("correo", correo);
		searchQuery.put(cuenta, cuenta);
		FindIterable<Document> cursor = datos.find(searchQuery);
		
		String json = "";
		
		for(Document doc : cursor) {
			json = doc.toJson();
		}
		
		Gson gson = new Gson(); 
		
		Map<String,String> map = new HashMap<String,String>();
		map = (Map<String,String>) gson.fromJson(json, map.getClass());
		
		
		for ( String key : map.keySet() ) {
		    keys.add(key);
		}
		
		keys.remove("_id");
		keys.remove("ingresos");
		keys.remove("gastos");
		keys.remove("correo");
		
		retorno = new String[4][keys.size()];
		
		double contador = 0;
		
		for(int i = 0; i <= keys.size() - 1; i++) {
			values.add(map.get(keys.get(i)));
			try{
			contador = contador + Double.parseDouble(map.get(keys.get(i)).toString());
			}catch (Exception e) {}
			
		}
		
		try {
		retorno[1][0] = Double.toString(contador);
		}catch(Exception e) {}
		
		
		for(int i = 0; i <= keys.size() - 1; i++) {
			retorno[0][i] = keys.get(i) + " = Q" + values.get(i);
				
		}
		
		for(int i = 0; i <= keys.size() - 1; i++) {
			retorno[2][i] = keys.get(i);
		}
		
		for(int i = 0; i <= keys.size() - 1; i++) {
			retorno[3][i] = keys.get(i) + ":" + values.get(i);
				
		}
		
		
		return retorno;
	}
	
	
	
/**
 * funcion para generar las graficas de ingresos y gastos
 * @param correo
 * @param cuenta
 * @return
 */
@SuppressWarnings("unchecked")
public ChartPanel getgrafica(String correo, String cuenta) {
	
	
	ArrayList<String> keys= new ArrayList<String>() ;
	ArrayList<String> values = new ArrayList<String>() ;
	
	BasicDBObject searchQuery = new BasicDBObject();
	searchQuery.put("correo", correo);
	searchQuery.put(cuenta, cuenta);
	FindIterable<Document> cursor = datos.find(searchQuery);
	
	String json = "";
	
	for(Document doc : cursor) {
		json = doc.toJson();
	}
	
	Gson gson = new Gson(); 
	
	Map<String,String> map = new HashMap<String,String>();
	map = (Map<String,String>) gson.fromJson(json, map.getClass());
	
	
	for ( String key : map.keySet() ) {
	    keys.add(key);
	}
	
	keys.remove("_id");
	keys.remove("ingresos");
	keys.remove("gastos");
	keys.remove("correo");
	
	
	
	double contador = 0;
	
	for(int i = 0; i <= keys.size() - 1; i++) {
		values.add(map.get(keys.get(i)));
		try{
		contador = contador + Double.parseDouble(map.get(keys.get(i)).toString());
		}catch (Exception e) {}
		
	}
	
	
	DefaultCategoryDataset data = new DefaultCategoryDataset();
		
	double total = 0;
	
	for (int i = 0;i<= values.size() - 1; i++) {
		
		total = total + Double.parseDouble(values.get(i));
	}
	
	for (int i = 0;i<= keys.size() - 1; i++) {
		
		data.setValue(Double.parseDouble(values.get(i)), keys.get(i) + "("+values.get(i)+")", "");	
	}
	

    JFreeChart barra = ChartFactory.createBarChart("Total " + cuenta , "","Q",data,PlotOrientation.VERTICAL,true,false,false);
    barra.setBorderVisible(false);
    CategoryPlot p = barra.getCategoryPlot();
    p.setRangeGridlinePaint(Color.black);
    p.setBackgroundPaint(Color.white);
    p.setOutlineVisible(false);
   
    
    ChartPanel graph = new ChartPanel(barra);
    
    
   
    	return graph;
	}
	
	
	
	/**
	 * funcion para buscar un archivo en el equipo y obtener su ruta
	 * @return
	 */
	public String getPath()  {
		
		JFileChooser chooser = new JFileChooser();
	 	FileNameExtensionFilter filtroImagen =new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
	 	chooser.setFileFilter(filtroImagen);
	 	File f = null;
	 	
		try {
			f = new File(new File(".").getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String path = "";
		try {
	    chooser.setCurrentDirectory(f);
	    chooser.setCurrentDirectory(null);
	    chooser.showOpenDialog(null);
	    path = chooser.getSelectedFile().toString();
		}catch(Exception e) {
			
		}
	    return path;
	}
	
	/**
	 * funcion para convertir una imagen a base64
	 * @param path
	 * @return
	 */
	 @SuppressWarnings("unused")
		public String toBase64(String path){
	         String encodedfile = null;
	         File file = new File(path);
	         try {
	             @SuppressWarnings("resource")
				FileInputStream fileInputStreamReader = new FileInputStream(file);
	             byte[] bytes = new byte[(int)file.length()];
	             fileInputStreamReader.read(bytes);
	             encodedfile = Base64.encode(bytes).toString();
	         } catch (FileNotFoundException e) {
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	         } catch (IOException e) {
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	         }

	         return encodedfile;
	     }
	
	

		/**
		 * Funcion para guardar imagen en la base de datos
		 */
		public void subirImagen(String correo) {
			
			String img = "";
			
			try {
			img = toBase64(getPath());
			}catch(Exception e) {}
			
			BasicDBObject query = new BasicDBObject();
			query.put("correo", correo);

			BasicDBObject newDocument = new BasicDBObject();
			newDocument.put("imagen", img);
						
			BasicDBObject updateObj = new BasicDBObject();
			updateObj.put("$set", newDocument);
			
			usuarios.updateOne(query, updateObj);
			
			
			
		}
		
		
		/**
		 * Funcion para convertir imagen de byte[]
		 * @param imagen
		 * @return
		 */
		public BufferedImage convImagen(String imageString) {
			
			byte[] imgBytes = Base64.decode(imageString);
			BufferedImage img = null;
			try {
				img = ImageIO.read(new ByteArrayInputStream(imgBytes));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
	        return img;
		}
		
		
		/**
		 * Funcion para poner la imagen del usuario
		 */
		public BufferedImage setImagen(String correo) {
		
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("correo", correo);
		FindIterable<Document> cursor = usuarios.find(searchQuery);
		
		String imagen = null;
		
		
		for(Document doc : cursor) {
			imagen =  doc.getString("imagen");
		}
		
		try {
		if (imagen.isEmpty()) {
			return null;
		}
		}catch(Exception e) {
			return null;
		}

		return convImagen(imagen);
		
		
		}

	/**
	 * funcion para cambiar todos los parametros del perfil al mismo tiempo
	 * @param correo
	 * @param nombre
	 * @param apellido
	 * @return
	 */
	public boolean cambiarPerfil(String correo,String nombre, String apellido) {
		
		
		try {
			BasicDBObject query = new BasicDBObject();
			query.put("correo", correo);

			BasicDBObject newDocument = new BasicDBObject();
			newDocument.put("correo",  correo);
			newDocument.put("nombre",  nombre);
			newDocument.put("apellido",  apellido);
						
			BasicDBObject updateObj = new BasicDBObject();
			updateObj.put("$set", newDocument);
			
			usuarios.updateOne(query, updateObj);
			return true;
			
		}catch (Exception e) {
				return false;
		}
		
	}
	
	/**
	 * funcion para agregar un eveto a un usuario en la base de datos
	 * @param correo
	 * @param fecha
	 * @param titulo
	 * @param desc
	 * @return
	 */
	public boolean agregarEvento(String correo, String fecha, String titulo,String desc) {
		
			String descripcion = fecha + " @@ " +titulo + " @@ " + desc;
		
		try {
			BasicDBObject query = new BasicDBObject();
			query.put("correo", correo);

			BasicDBObject newDocument = new BasicDBObject();
			newDocument.put(crearCodigoEventos(),  descripcion);
			
						
			BasicDBObject updateObj = new BasicDBObject();
			updateObj.put("$set", newDocument);
			
			calendario.updateOne(query, updateObj);
			return true;
			
		}catch (Exception e) {
				return false;
		}
		
		
	}
	
	/**
	 * FUncion para crear codigo aleatorio para guardar evento
	 * @return
	 */
	public String crearCodigoEventos() {
		Random r = new Random();
		
		String codigo = "";
		
		for(int i = 1; i <= 8; i = i + 1){
			char c = (char)(r.nextInt(26) + 'A');
			int numero = (int) (Math.random() * 9) + 1;
			codigo = codigo + c + numero;
		}
		
		return codigo;
				
	}
	
	/**
	 * Funcion para obtener todos los eventos de una fecha en la base de datos
	 * @param correo
	 * @param fecha
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<String> getEventos(String correo, String fecha){
		
		

		ArrayList<String> informacion= new ArrayList<String>() ;
		
		
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("correo", correo);
		FindIterable<Document> cursor = calendario.find(searchQuery);
		
		String json = "";
		
		for(Document doc : cursor) {
			json = doc.toJson();
		}
		
		Gson gson = new Gson(); 
		
		Map<String,String> map = new HashMap<String,String>();
		map = (Map<String,String>) gson.fromJson(json, map.getClass());
		
		
		Object[] array = map.entrySet().toArray();
		
		for (Object a : array) {
			
			String o = a.toString();
			String[] ar = o.split("=");
			String[] arr = ar[1].split(" @@ ");
			String h = arr[0] + " // " +fecha;
			if (arr[0].equals(fecha)) {
				informacion.add(ar[1]);
			}
			
		}
		
	
		return informacion;
	}
	
	
	
	
	
	
	
	
	/**
	 * Funcion para eliminar un evento de un usuario en la base de datos
	 * @param correo
	 * @param fecha
	 * @param titulo
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public boolean eliminarEvento(String correo, String fecha, String titulo){
		try {
		
		
		
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("correo", correo);
		FindIterable<Document> cursor = calendario.find(searchQuery);
		
		String json = "";
		
		for(Document doc : cursor) {
			json = doc.toJson();
		}
		
		Gson gson = new Gson(); 
		
		Map<String,String> map = new HashMap<String,String>();
		map = (Map<String,String>) gson.fromJson(json, map.getClass());
		
		Object[] array = map.entrySet().toArray();
		String value = "";
		String key = "";
		for (Object a : array) {
			
			String o = a.toString();
			String[] ar = o.split("=");
			String[] arr = ar[1].split(" @@ ");
			
			
			if (arr[0].equals(fecha) && arr[1].equals(titulo)) {
				value = ar[1];
				
			}
		}
		
		try {
		for (java.util.Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                key = entry.getKey();
            }
		}
		}catch(Exception es) {}
		
		
			BasicDBObject query = new BasicDBObject();
			query.put("correo", correo);

			BasicDBObject newDocument = new BasicDBObject();
			newDocument.put(key,  value);
			
						
			BasicDBObject updateObj = new BasicDBObject();
			updateObj.put("$unset", newDocument);
			
			calendario.updateOne(query, updateObj);
			return true;
			
		}catch (Exception e) {
				return false;
		}
	}
	
	
	/**
	 * funcion para codificar
	 * @param a
	 * @return
	 */
	public String encode(String a) {
		java.util.Base64.Encoder encoder = java.util.Base64.getEncoder();
		String b = encoder.encodeToString(a.getBytes(java.nio.charset.StandardCharsets.UTF_8) );        
		return b;
	}
	
	/**
	 * funcion para decodificar
	 * @param a
	 * @return
	 */
	public  String decode(String a){
		java.util.Base64.Decoder decoder = java.util.Base64.getDecoder();
		byte[] decodedByteArray = decoder.decode(a);
     
		String b = new String(decodedByteArray);        
		return b;
	}
	
	
	/**
	 * identifica si el sistema es windows
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
