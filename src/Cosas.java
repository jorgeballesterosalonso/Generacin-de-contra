import java.lang.Math;
import java.util.Scanner;

public class Cosas {

	static double x;
	static double y;
	static double z;

	public static void main(String[] args) {

		recogidadedatos();

		System.out.print("�ngulo formado por el vector de O al punto ingresado y el plano OYZ:  ");
		System.out.println(calcularAngulo(1));

		System.out.print("�ngulo formado por el vector de O al punto ingresado y el plano OXY:  ");
		System.out.println(calcularAngulo(2));

		System.out.print("�ngulo formado por el vector de O al punto ingresado y el plano OXZ:  ");
		System.out.println(calcularAngulo(3));
	}

	public static void recogidadedatos() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese la primera coordenada del 0 al 10");

		boolean repetir = false;
		do {
			try {
				x = Double.parseDouble(sc.next());
				repetir = false;

			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter v�lido");
				repetir = true;
				x = 0;
			}
			try {
				while (x > 10 || x < 0) {
					System.err.println("Ingrese un n�mero dentro del rango (0-10)");
					x = Double.parseDouble(sc.next());
				}
			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter v�lido");
				repetir = true;
				x = 0;
			}
		} while (repetir);

		System.out.println("Ingrese la segunda coordenada del 0 al 10");

		do {
			try {
				y = Double.parseDouble(sc.next());
				repetir = false;

			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter v�lido");
				repetir = true;
				y = 0;

			}
			try {
				while (y > 10 || y < 0) {
					System.err.println("Ingrese un n�mero dentro del rango (0-10)");
					y = Double.parseDouble(sc.next());
				}
			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter v�lido");
				repetir = true;
				y = 0;
			}
		} while (repetir);

		System.out.println("Ingrese la tercera coordenada del 0 al 10");

		do {
			try {
				z = Double.parseDouble(sc.next());
				repetir = false;

			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter v�lido");
				repetir = true;
				z = 0;

			}
			try {
				while (z > 10 || z < 0) {
					System.err.println("Ingrese un n�mero dentro del rango (0-10)");
					z = Double.parseDouble(sc.next());
				}
			} catch (NumberFormatException e) {
				System.err.println("Ingrese un caracter v�lido");
				repetir = true;
				z = 0;
			}
		} while (repetir);

		System.out.println("Ingrese el factor de multiplicaci�n cualquiera");
		double factor;

		try {
			factor = Double.parseDouble(sc.next());

		} catch (NumberFormatException e) {
			System.err.println("Ingrese un caracter v�lido");
			factor = Double.parseDouble(sc.next());

		}
		double vector1 = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));

		System.out.println(vector1);

		sc.close();
	}

	public static double calcularAngulo(int a) {

		switch (a) {

		case 1:
			double anguloOYZ = 0;
			anguloOYZ = Math.acos((y * y + z * z) / Math.sqrt((x * x + y * y + z * z) * (y * y + x * x)));
			return anguloOYZ;

		case 2:
			double anguloOXY = 0;
			anguloOXY = Math.acos((y * y + z * z) / Math.sqrt((x * x + y * y + z * z) * (y * y + x * x)));
			return anguloOXY;

		case 3:
			double anguloOXZ = 0;
			anguloOXZ = Math.acos((y * y + z * z) / Math.sqrt((x * x + y * y + z * z) * (y * y + x * x)));
			return anguloOXZ;

		default:
			return 0;
		}

	}
}
