package pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.service.sv;


import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.model.Vendedor;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.repository.VendedorRepository;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.service.IVendedorService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VendedorService implements IVendedorService {
    private final VendedorRepository vendedorRepository;

    @Cacheable(value = "Vendedor", key = "#id")
    @Override
    public List<Vendedor> obtenerVendedores(Integer id) {
        return vendedorRepository.obtenerVendedores(id);
    }

    @CacheEvict(value = "vendedores", allEntries = true)
    @Override
    public Vendedor registrarVendedor(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    @CachePut(value = "vendedor", key = "#id")
    @Override
    public Vendedor actualizarVendedor(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    @CacheEvict(value = {"vendedores"}, allEntries = true)
    @Override
    public void eliminarCache() {

    }
}