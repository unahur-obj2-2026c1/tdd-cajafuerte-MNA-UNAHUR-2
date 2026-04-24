package ar.edu.unahur.obj2.tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CajaFuerteTest {
    
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

}
