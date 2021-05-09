package exceptions;

public class NoEncontrado extends AssertionError {
    private static final long serialVersionUID = 1L;
    public NoEncontrado(String mensaje,Throwable causa){
        super("No encontrado",causa);
    }
}
