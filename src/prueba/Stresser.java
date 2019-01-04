package prueba;

public class Stresser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test test = new Test();
		
		IStresser pagos = new pagos();
		IStresser notificaciones = new notificaciones();
		
		test.Run(pagos);
		test.Run(notificaciones);

	}

}
