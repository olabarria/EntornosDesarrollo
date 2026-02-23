public class Libros {
    private int codigoLibro;
    private String titulo;
    private String Isbn;
    private int numero_copias;
    private Autor Autora;


    public Libros(int pcodigoLibro, String ptitulo, String pisbn, int pnumero_copias, Autor pautora){
        this.codigoLibro = pcodigoLibro;
        this.titulo = ptitulo;
        this.Isbn = pisbn;
        this.numero_copias = pnumero_copias;
        this.Autora = pautora;

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

    public void setIsbn(String pisbn) {
        Isbn = pisbn;
    }

    public int getNumero_copias() {
        return numero_copias;
    }

    public void setNumero_copias(int pnumero_copias) {
        this.numero_copias = pnumero_copias;
    }

    public Autor getAutora() {
        return Autora;
    }

    public void setAutora(Autor pautora) {
        Autora = pautora;
    }

    public String toString() {
        return "PRUEBA [codigoLibro=" + codigoLibro + ", titulo=" + titulo + ", Isbn=" + Isbn + ", numero_copias="
            + numero_copias + "]";
    }

}
