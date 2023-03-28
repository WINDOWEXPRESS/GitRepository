import java.util.Scanner;

public class MainPizzeria {

	public static void main(String[] args) {
		// Declarar variables locales
		String nombre;
		int maxClientes = 0;
		int maxPedidos = 0;
		short opc = 0;
		// Crear instancia de la clase Scanner
		Scanner dato = new Scanner(System.in);
		//Capturar datos para crear instancia de la clase Pizzeria
		do {
			System.out.println("Introduce el nombre de la pizzer�a (no puede estar vac�o):");
			nombre = dato.nextLine();
		}while(nombre.isEmpty());
		
		while(maxClientes>10 || maxClientes<2) {
			System.out.println("Introduce el n�mero de clientes permitidos (m�nimo 2, m�ximo 10):");
			maxClientes = dato.nextInt();
		}
		while(maxPedidos>20 || maxPedidos<2) {
			System.out.println("Introduce el n�mero de pedidos permitidos (m�nimo 2, m�ximo 20): ");
			maxPedidos = dato.nextInt();
		}
		//Crear instancia de la clase Pizzeria
		Pizzeria pizzeria = new Pizzeria(nombre,maxClientes,maxPedidos);
		while (opc != 5) {
			opc = 0;
			menu();
			while(opc <1 || opc >5) {
				System.out.println("Elige la opci�n deseada:");
				opc = dato.nextShort();
				if (opc <1 || opc >5) {
					System.out.println("Opci�n invalido vuelve introducirlo.");
				}
			}
			System.out.println("Opci�n:"+opc);
			switch (opc) {
			case 1:
				System.out.println("Imprimir Detalles Pizzer�a:");
				System.out.println(pizzeria);
				break;
			case 2:
				System.out.println("A�adir Cliente:");
				if (pizzeria.addCliente()) {
					String nombreCliente; 
					String apellidosCliente;
					String direccionCliente;
					String telefonoCliente;
					//Limpiar buffer de Scanner
					dato.nextLine();
					//Capturar datos
					System.out.println("Introduce el nombre del cliente: ");
					nombreCliente = dato.nextLine();
					System.out.println("Introduce los apellidos del cliente: ");
					apellidosCliente = dato.nextLine();
					System.out.println("Introduce la direcci�n del cliente: ");
					direccionCliente = dato.nextLine();
					System.out.println("Introduce el tel�fono del cliente: ");
					telefonoCliente = dato.nextLine();
					//A�adir cliente 
					pizzeria.addCliente(nombreCliente, apellidosCliente, direccionCliente, telefonoCliente);
					System.out.println("        OK: Cliente a�adido correctamente.");
				}else {
					System.out.println("Error: Ya se ha alcanzado el m�ximo n�mero de clientes (" + pizzeria.getMaxClientes() + "), no se pueden a�adir m�s.");
				}
				break;
			case 3:
				//Crear variables locales
				int nCliente = 0 ;
				int tamanioPizza = 0;
				int tipoPizza = 0;
				System.out.println("A�adir pedido:");
				if(pizzeria.getNumClientes()<1) {
					System.out.println(     "Error: No hay ning�n cliente registrado. Necesitas a�adir un cliente antes de poder crear un pedido.");
					break;
				}
				//Visualizar datos de los clientes
				System.out.println(pizzeria.clientesToString());
				//Seleccionar cliente
				while(nCliente<1 || nCliente>pizzeria.getNumClientes()){
					System.out.print("Introduce el n�mero de cliente que hace el pedido (1-"+pizzeria.getNumClientes()+"):");
					nCliente = dato.nextShort();
				}
				System.out.println("Seleccionado el cliente "+nCliente+": "+pizzeria.clienteToString(nCliente-1));
				while(tamanioPizza<1 || tamanioPizza>2){
					System.out.print("Introduce el tama�o de la pizza usando el n�mero (1=Mediana, 2=Familiar): ");
					tamanioPizza= dato.nextInt();
				}
				System.out.println("Seleccionado el n�mero "+tamanioPizza+" para el tama�o de la pizza");
				while(tipoPizza<1|| tipoPizza>3) {
					System.out.println("Introduce el tipo de pizza usando el n�mero (1=margarita, 2=cuatro quesos o 3=funghi):");		
					tipoPizza = dato.nextInt();
				}
				System.out.println("Seleccionado el n�mero "+tipoPizza+" para el tipo de pizza");
				
				System.out.println("Pedido guardado en posici�n "+pizzeria.getNumPedidos()+". Pedido:cliente="+pizzeria.clienteToString(nCliente));
				break;
			default:
				break;
			}
		}

	}

	private static void menu() {
		System.out.println("==> Men� pizzer�a:");
		System.out.println("1->Imprimir detalles pizzer�a" );
		System.out.println("2->A�adir cliente");
		System.out.println("3->Crear pedido" );
		System.out.println("4->Servir pedido");
		System.out.println("5->Salir");
	}

}