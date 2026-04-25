package ar.edu.unahur.obj2.tdd;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testMain() {

    }
}

/*

TDD: Rojo -> Verde -> Refactor (Azul)

Historia de usuario.

Como huesped del hotel,
quiero utilizar una caja fuerte personal en mi habitación,
para guardar objetos de valor de forma segura durante mi estadía.

Criterios de aceptación. (G-W-T -> Dado - Cuando - Entonces)

1. Caja abierta al inicio.
    Dado que la caja fuerte ha sido recién creada,
    entonces debe encontrarse en estado abierto.

2. Cierre de la caja fuerte con código.
    Dado que la caja fuerte está abierta.
    Cuando se le asigna un código al cerrarla.
    Entonces debe quedar en estado cerrado.

3. Apertura con código correcto.
    Dado que la caja fuerte fue cerrada con un código.
    Cuando se intenta abrir con ese mismo código.
    Entonces debe abrirse correctamente.

4. No se abre con código incorrecto.
    Dado que la caja fuerte fue cerrada con un código.
    Cuando se intenta abrir con un código distinto.
    Entonces no debe abrirse.

6. La Caja Fuerte se bloquea tras 3 intentos fallidos.
    Dado que la caja fuerte ha sido cerrada con un código.
    Cuando se intenta abrir con un código incorrecto 3 veces.
    Entonces la caja fuerte debe quedar bloqueada.
*/