/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numPaginas;
    private String numeroReferencia;
    private int vecesPrestado;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numPaginas = numeroPaginas;
        numeroReferencia = "";
    }

    public String getAutor()
    {
        return autor;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public int getNumeroPaginas()
    {
        return numPaginas;
    }
    
    public int getVecesPrestado()
    {
        return numPaginas;
    }
    
    public String getDetalles()
    {
        if (numeroReferencia.length() != 0){
            return "Título: " + titulo +  "/Autor: " + autor + "/Paginas: " + numPaginas + "/Numero de referencia: " + numeroReferencia + "/Veces prestado: "+ vecesPrestado;
        }
        else{
            return "Título: " + titulo +  "/Autor: " + autor + "/Paginas: " + numPaginas + "/Numero de referencia: ZZZ" + "/Veces prestado: "+ vecesPrestado;
        }
    }

    public String getNumeroReferencia()
    {
        return numeroReferencia;
    }

    public void imprimirAutor()
    {
        System.out.println(autor);
    }

    public void imprimirTitulo()
    {
        System.out.println(titulo);
    }

    public void imprimirNumeroPaginas()
    {
        System.out.println(numPaginas);
    }

    public void imprimirDetalles()
    {
        if (numeroReferencia.length() != 0){
            System.out.println ("Título: " + titulo +  "/Autor: " + autor + "/Paginas: " + numPaginas + "/Numero de referencia: " + numeroReferencia + "/Veces prestado: "+ vecesPrestado);
        }
        else{
            System.out.println ("Título: " + titulo +  "/Autor: " + autor + "/Paginas: " + numPaginas + "/Numero de referencia: ZZZ"+ "/Veces prestado: "+ vecesPrestado);
        }
    }

    public void setNumeroReferencia(String numRef)
    {
        if( numRef.length() >= 3){
            numeroReferencia = numRef;
        }
        else{
            System.out.println("Numero demasiado pequeño");
        }
    }
    
    public void prestar()
    {
        vecesPrestado = vecesPrestado + 1;
    }

}
