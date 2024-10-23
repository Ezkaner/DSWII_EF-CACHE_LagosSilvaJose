package pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.model.Reserva;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.service.IReservaService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/reservas")
public class ReservaController {
    private final IReservaService iReservaService;

    @GetMapping("/{mes}")
    public List<Reserva> obtenerReservasPorMes(@PathVariable("mes") int mes) {
        return iReservaService.obtenerReservasPorMes(mes);
    }
}

