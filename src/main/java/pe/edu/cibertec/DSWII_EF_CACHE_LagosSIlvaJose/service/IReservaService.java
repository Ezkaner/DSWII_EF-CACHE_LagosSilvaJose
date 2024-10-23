package pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.service;

import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.model.Reserva;

import java.util.List;

public interface IReservaService {
    List<Reserva> obtenerCitasPorMes(int mes);
    Reserva registrarReserva(Reserva reserva);
    Reserva actualizarReserva(Reserva reserva);
    void eliminarCache();
}