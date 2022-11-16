package ec3.idat.carrillo.app.service;

import java.util.List;

import ec3.idat.carrillo.app.model.UsuarioCliente;


public interface UsuarioClienteService {

	void guardar(UsuarioCliente usuarioCliente);
	void actualizar(UsuarioCliente usuarioCliente);
	void eliminar(Integer id);
	List<UsuarioCliente> listar();
	UsuarioCliente obtener(Integer id);
}
