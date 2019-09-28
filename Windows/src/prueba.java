
public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConexionMongoDB db = new ConexionMongoDB();
		
		db.eliminarCuenta("andreifan123@gmail.com", "ingresos", "Otros");
		
		
	}

}
