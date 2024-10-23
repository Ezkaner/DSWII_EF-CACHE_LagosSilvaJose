package pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.model.Vendedor;

import java.util.List;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor,Integer> {

    @Query(value = "SELECT * FROM Vendedor WHERE id =:id", nativeQuery = true)
    List<Vendedor> obtenerVendedores(@Param("id") int id);
}