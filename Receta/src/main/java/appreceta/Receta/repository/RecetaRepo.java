package appreceta.Receta.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import appreceta.Receta.entities.Receta;

public interface RecetaRepo extends CrudRepository <Receta, Long>{
	List<Receta> findByNombre(String nombre);
	List<Receta> findByPreparacion(String preparacion);
}
