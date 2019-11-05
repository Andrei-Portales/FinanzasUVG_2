
public class Presupuestos {
	
	public double totalPresupuesto(double uno, double dos, double tres, double cuatro, double cinco, double seis, double siete, double ocho, double nueve, double diez) {
		double total;
		
		total = uno + dos + tres + cuatro + cinco + seis + siete + ocho + nueve + diez;
		
		return total;
	}
	
	public double porcentajePresupuesto(double totalPresupuesto, double totalIngresos) {
		double porcentaje;
		totalIngresos += 1;
		
		porcentaje = (totalPresupuesto * 100) / totalIngresos; 

		return Math.round(porcentaje) ;
	}
}
