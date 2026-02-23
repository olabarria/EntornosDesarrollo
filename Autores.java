class Autor {
    private int codigoAutor;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int nacimiento;
    private Libros libro;


    public Autor(int pcodigoAutor,String pnombre,String papellido1 ,String papellido2 ,String psinopsis,int pnacimiento,Libros plibro){
        this.codigoAutor=pcodigoAutor;
        this.nombre=pnombre;
        this.apellido1=papellido1;
        this.apellido2=papellido2;
        this.nacimiento=pnacimiento;
        this.libro=plibro;
    }


    public int getcodigoAutor(){
        return this.codigoAutor;
    }
    public String getnombre(){
        return this.nombre;
    }
    public String getapel1(){
        return this.apellido1;
    }
    public String getapel2(){
        return this.apellido2;
    }
}