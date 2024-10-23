package pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.service.sv;


import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.model.Cliente;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.repository.ClienteRepository;
import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.service.IClienteService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClienteService implements IClienteService {
    private final ClienteRepository clienteRepository;

    @Cacheable(value = "clientes", key = "#id")
    @Override
    public List<Cliente> obtenerClienteXId(Integer id) {
        return clienteRepository.obtenerClientes(id);
    }

    @CacheEvict(value = "Cliente", allEntries = true)
    @Override
    public Cliente registrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @CachePut(value = "cliente", key = "#id")
    @Override
    public Cliente actualizarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @CacheEvict(value = {"clientes"}, allEntries = true)
    @Override
    public void eliminarCache() {

    }
}