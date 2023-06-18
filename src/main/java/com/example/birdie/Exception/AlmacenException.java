package com.example.birdie.Exception;


public class AlmacenException extends RuntimeException {

    public AlmacenException(String mensaje){
        super(mensaje);
    }

    public AlmacenException(String mensaje, Throwable excepcion){
        super(mensaje, excepcion);
    }
}
