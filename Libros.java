public class Libros{
    private int codigoLibro;
    private String titulo;
    private String Isbn;
    private int numero_copias;
    


    public Libros(int pcodigoLibro, String ptitulo, String pisbn, int pnumero_copias){
        this.codigoLibro = pcodigoLibro;
        this.titulo = ptitulo;
        this.Isbn = pisbn;
        this.numero_copias = pnumero_copias;
        
    }
    public int getCodigoLibro() {
        return codigoLibro;
    }


    public void setCodigoLibro(int pcodigoLibro) {
        this.codigoLibro = pcodigoLibro;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String ptitulo) {
        this.titulo = ptitulo;
    }


    public String getIsbn() {
        return Isbn;
    }
}