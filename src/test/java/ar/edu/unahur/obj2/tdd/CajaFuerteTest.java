package ar.edu.unahur.obj2.tdd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CajaFuerteTest {
    
    @Test
    public void queLaCajaFuerteEsteAbiertaAlCrearse() {
        CajaFuerte caja = new CajaFuerte();
        assertTrue(caja.estaAbierta());
    }

    @Test
    public void queSePuedeCerrarLaCajaFuerteConUnCodigo() {
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        assertFalse(caja.estaAbierta());
    }

    @Test
    public void queSePuedeAbrirLaCajaFuerteConElCodigoCodigo() {
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.abrir(1234);
        assertTrue(caja.estaAbierta());
    }

    @Test
    public void queNoPuedeAbrirLaCajaFuerteConElCodigoIncorrecto() {
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.abrir(1111);
        assertFalse(caja.estaAbierta());
    }

    @Test
    public void queNoPuedeCerrarLaCajaFuerteEstandoCerrada() {
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.cerrar(4321);
        caja.abrir(1234);
        assertTrue(caja.estaAbierta());
    }
/*    
    @Test
    public void queLaCajaFuerteEsteAbiertaAlCrearse() {
        CajaFuerte caja = dadoQueExisteUnaCajaFuerte();
        estaAbierta(caja);
    }

    private void estaAbierta(CajaFuerte caja) {
        assertTrue(caja.estaAbierta());
    }

    private CajaFuerte dadoQueExisteUnaCajaFuerte() {
        CajaFuerte caja = new CajaFuerte();
        return caja;
    }
*/

}
