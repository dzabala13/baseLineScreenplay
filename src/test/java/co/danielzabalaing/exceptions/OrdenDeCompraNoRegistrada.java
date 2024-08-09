package co.danielzabalaing.exceptions;

public class OrdenDeCompraNoRegistrada extends AssertionError{

    public static final String MENSAJE_ERROR_CREACION_ORDEN_COMPRA = "No se pudo crear la orden de compra relacionada a tu producto";

    public OrdenDeCompraNoRegistrada(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
