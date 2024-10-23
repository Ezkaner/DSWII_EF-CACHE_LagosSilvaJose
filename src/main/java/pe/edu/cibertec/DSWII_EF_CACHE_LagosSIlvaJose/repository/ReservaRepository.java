package pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.model.Reserva;

import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva,Integer> {

    @Query(value = "select * from Cita where month(fecha) = :mes", nativeQuery = true)
    List<Reserva> obtenerReservasPorMes(@Param("mes") int mes);

}