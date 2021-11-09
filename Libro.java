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

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numPaginas = numeroPaginas;
    }
    
    public String getAutor()
    {
        return autor;
    }
    
    public String getTitulo()
    {
        return titulo;
    }
    
    public int getnumeroPaginas()
    {
        return numPaginas;
    }
    
    public void imprimirAutor()
    {
        System.out.println(autor);
    }
    
    public void imprimirTitulo()
    {
        System.out.println(titulo);
    }
}
