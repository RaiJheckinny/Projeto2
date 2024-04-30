package br.com.raijheckinny.exception;

public class TipoChaveNaoEncontradaException extends Exception {
    private static final long serialVersionUID = -138121212121L;

    public TipoChaveNaoEncontradaException(String msg){
        this(msg, null);
    }
    public TipoChaveNaoEncontradaException(String msg, Throwable e){
        super(msg, e);
    }
}
