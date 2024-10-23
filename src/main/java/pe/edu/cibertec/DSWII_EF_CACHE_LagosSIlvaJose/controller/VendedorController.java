package pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.model.Vendedor;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.service.IVendedorService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/vendedor")
public class VendedorController {
    private final IVendedorService iVendedorService;

    @GetMapping("/{id}")
    public List<Vendedor> obtenerVendedoresXId(@PathVariable("id") int id) {
        return iVendedorService.obtenerVendedoresXId(id);
    }
}