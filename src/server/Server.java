package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Vector;

import bean.Cliente;
import bean.Views.ClienteView;
import bean.Views.PaqueteView;
import bean.Views.ProductoView;
import bean.Views.VentaView;
import interfaz.TDAManejoDatos;

public class Server extends UnicastRemoteObject implements TDAManejoDatos{

	protected Server() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cliente buscarCliente(int dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int altaCliente(int dni, String nombre, int telefono, String mail) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int bajaCliente(int dni) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ProductoView getProductoPorCodigo(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void grabarAlojamiento(String descripcion, String fechaDesde, String fechaHasta, String nombre, float precio,
			String ubicacion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void grabarPasaje(String descripcion, String fecha, String aerolinea, String origen, String destino,
			float precio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void grabarVisita(String descripcion, String fecha, String nombre, String ubicacion, float precio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void grabarPaquete(PaqueteView paqueteVw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cargaInicial() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> getClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int VincularClienteAVenta(int dni) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void agregarProducto(int codproducto, int cant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public VentaView getVentaView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteView getClienteView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector getItemVentaVector() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void grabarVenta() {
		// TODO Auto-generated method stub
		
	}

}
