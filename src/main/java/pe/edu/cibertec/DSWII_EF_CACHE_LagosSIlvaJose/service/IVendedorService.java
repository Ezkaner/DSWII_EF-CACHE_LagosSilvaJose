package pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.service;

import pe.edu.cibertec.DSWII_EF_CACHE_LagosSIlvaJose.model.Vendedor;

import java.util.List;

public interface IVendedorService {
    List<Vendedor> obtenerVendedoresXId(Integer id);
    Vendedor registrarVendedor(Vendedor vendedor);
    Vendedor actualizarVendedor(Vendedor vendedor);
    void eliminarCache();
}