package pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.model.Cliente;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.service.IClienteService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/cliente")
public class ClienteController {
    private final IClienteService iClienteService;

    @GetMapping("/{id}")
    public List<Cliente> obtenerVendedoresXId(@PathVariable("id") int id) {
        return iClienteService.obtenerClientesXId(id);
    }
}