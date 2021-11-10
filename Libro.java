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
    private boolean esLibroDeTexto;
    private String textoprimero;
    private String textosegundo;
    
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginas, boolean libroTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numPaginas = numeroPaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = libroTexto;
        
        textoprimero = "Título: " + titulo +  " /Autor: " + autor + " /Paginas: " + numPaginas + "/ Numero de referencia: ";
        textosegundo = " /Veces prestado: "+ vecesPrestado + " /Es libro de texto:";
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
        return vecesPrestado;
    }

    public boolean getEsLibroDeTexto()
    {
        return esLibroDeTexto;
    }

    public String getDetalles()
    {
        if (numeroReferencia.length() != 0){
            if(esLibroDeTexto== true){
                return textoprimero + numeroReferencia + textosegundo + " Si";
            }
            else{
                return textoprimero + numeroReferencia + textosegundo + " No";
            }
        }   
        else{
            if(esLibroDeTexto== true){
                return textoprimero +" ZZZ "+ textosegundo + " Si";
            }
            else{
                return textoprimero + "ZZZ "+ textosegundo + " No";
            }
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
            if(esLibroDeTexto== true){
                System.out.println(textoprimero + numeroReferencia + textosegundo +  "Si");
            }
            else{
                System.out.println(textoprimero + numeroReferencia + textosegundo + " No");
            }
        }
        else{
            if(esLibroDeTexto== true){
                System.out.println(textoprimero + " ZZZ "+ textosegundo+ " Si");
            }
            else{
                System.out.println(textoprimero + "ZZZ " + textosegundo + " No");
            }
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
