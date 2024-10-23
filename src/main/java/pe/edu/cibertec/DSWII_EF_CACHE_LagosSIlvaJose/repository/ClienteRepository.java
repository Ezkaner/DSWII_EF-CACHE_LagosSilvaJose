package pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.model.Cliente;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

    @Query(value = "SELECT * FROM Clientes WHERE id =:id", nativeQuery = true)
    List<Cliente> obtenerClientes(@Param("id") int id);
}