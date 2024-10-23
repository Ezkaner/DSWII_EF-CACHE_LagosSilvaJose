package pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.service.sv;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.model.Reserva;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.repository.ReservaRepository;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.service.IReservaService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ReservaService implements IReservaService {
    private final ReservaRepository reservaRepository;

    @Cacheable(value = "reservasPorMes", key = "#mes")
    @Override
    public List<Reserva> obtenerReservaPorAnio(int mes) {
        return reservaRepository.obtenerReservasPorMes(mes);
    }

    @CacheEvict(value = "reservasPorMes", allEntries = true)
    @Override
    public Reserva registrarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @CachePut(value = "reservasPorAnio", key = "#reserva.id")
    @Override
    public Reserva actualizarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @CacheEvict(value = {"reservasPorAnio"}, allEntries = true)
    @Override
    public void eliminarCache() {

    }
}