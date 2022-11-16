package ec3.idat.carrillo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec3.idat.carrillo.app.model.UsuarioCliente;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioCliente, Integer> {
	
	UsuarioCliente findByUsuario(String usuario);
	
}
