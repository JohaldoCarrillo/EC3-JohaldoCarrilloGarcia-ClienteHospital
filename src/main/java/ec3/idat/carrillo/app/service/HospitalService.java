package ec3.idat.carrillo.app.service;

import java.util.List;

import ec3.idat.carrillo.app.model.Hospital;

public interface HospitalService {

	void guardar(Hospital hospital);
	void actualizar(Hospital hospital);
	void eliminar(Integer id);
	List<Hospital> listar();
	Hospital obtener(Integer id);
}
