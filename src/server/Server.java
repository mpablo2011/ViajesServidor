package server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import app.Administrador;

public class Server{
	
	Administrador objetoRemoto;
	
	public static void main(String[] args)
	{
		new Server();
	}
	
	public Server() {
		iniciar();
	}
	
    public void iniciar() {
    	try {
    		LocateRegistry.createRegistry(1099);	
            this.objetoRemoto = new Administrador();
            Naming.rebind ("//localhost/GestionViajes", objetoRemoto);
            System.out.println("Fijado en //localhost/GestionViajes");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }


}
