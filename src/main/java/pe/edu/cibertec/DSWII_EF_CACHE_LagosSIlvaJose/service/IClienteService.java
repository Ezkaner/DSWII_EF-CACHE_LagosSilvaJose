package pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.service;

import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.model.Cliente;

import java.util.List;

public interface IClienteService {
    List<Cliente> obtenerClientesXId(Integer id);
    Cliente registrarCliente(Cliente cliente);
    Cliente actualizarCliente(Cliente cliente);
    void eliminarCache();
}