package app;

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

public class Administrador extends UnicastRemoteObject implements TDAManejoDatos{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Administrador() throws RemoteException {
		super();
		MainSistemaDeVentas.getInstancia().cargaInicial();
	}

	@Override
	public Cliente buscarCliente(int dni) {
		// TODO Auto-generated method stub
		return ClienteController.getInstancia().buscarCliente(dni);
	}

	@Override
	public int altaCliente(int dni, String nombre, int telefono, String mail) {
		// TODO Auto-generated method stub
		return ClienteController.getInstancia().altaCliente(dni, nombre, telefono, mail);
	}

	@Override
	public int bajaCliente(int dni) {
		// TODO Auto-generated method stub
		return ClienteController.getInstancia().bajaCliente(dni);
	}

	@Override
	public ProductoView getProductoPorCodigo(int codigo) {
		try
		{
			return ProductoController.getInstancia().getProductoPorCodigo(codigo);
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	
		return null;
	}

	@Override
	public void grabarAlojamiento(String descripcion, String fechaDesde, String fechaHasta, String nombre, float precio,
			String ubicacion) {
		ProductoController.getInstancia().grabarAlojamiento(descripcion, fechaDesde, fechaHasta, nombre, precio, ubicacion);
		
	}

	@Override
	public void grabarPasaje(String descripcion, String fecha, String aerolinea, String origen, String destino,
			float precio) {
		ProductoController.getInstancia().grabarPasaje(descripcion, fecha, aerolinea, origen, destino, precio);
		
	}

	@Override
	public void grabarVisita(String descripcion, String fecha, String nombre, String ubicacion, float precio) {
		// TODO Auto-generated method stub
		ProductoController.getInstancia().grabarVisita(descripcion, fecha, nombre, ubicacion, precio);
	}

	@Override
	public void grabarPaquete(PaqueteView paqueteVw) {
		// TODO Auto-generated method stub
		ProductoController.getInstancia().grabarPaquete(paqueteVw);
	}

	@Override
	public void cargaInicial() {
		// TODO Auto-generated method stub
		MainSistemaDeVentas.getInstancia().cargaInicial();
	}

	@Override
	public List<Cliente> getClientes() {
		// TODO Auto-generated method stub
		return MainSistemaDeVentas.getInstancia().getClientes();
	}

	@Override
	public void addCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		MainSistemaDeVentas.getInstancia().addCliente(cliente);
	}

	@Override
	public int VincularClienteAVenta(int dni) {
		// TODO Auto-generated method stub
		return VentaController.getInstancia().VincularClienteAVenta(dni);
	}

	@Override
	public void agregarProducto(int codproducto, int cant) {
		// TODO Auto-generated method stub
		VentaController.getInstancia().agregarProducto(codproducto, cant);
	}

	@Override
	public VentaView getVentaView() {
		// TODO Auto-generated method stub
		return VentaController.getInstancia().getVentaView();
	}

	@Override
	public ClienteView getClienteView() {
		// TODO Auto-generated method stub
		return VentaController.getInstancia().getClienteView();
	}

	@Override
	public Vector<Vector<String>> getItemVentaVector() {
		// TODO Auto-generated method stub
		return VentaController.getInstancia().getItemVentaVector();
	}

	@Override
	public void grabarVenta() {
		VentaController.getInstancia().grabarVenta();
	}

	@Override
	public Vector<Vector<String>> obtenerProductos() {		
		return ProductoController.getInstancia().obtenerProductos();
	}

	@Override
	public Vector<Vector<String>> obtenerVentas() {
		return VentaController.getInstancia().obtenerVentas();
	}

}
