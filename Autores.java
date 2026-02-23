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
    public Autor(int pcodigoAutor,String pnombre,String papellido1 ,String papellido2 ,String psinopsis,int pnacimiento){
        this.codigoAutor=pcodigoAutor;
        this.nombre=pnombre;
        this.apellido1=papellido1;
        this.apellido2=papellido2;
        this.nacimiento=pnacimiento;
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
     public void setcodigo(int pcodigoAutor){
        this.codigoAutor=pcodigoAutor;
    }
    public void setnombre(String pnombre){
        this.nombre=pnombre;
    }
    public void setapellido1(String papellido1){
        this.apellido1=papellido1;
    }
    public void setapellido2(String papellido2){
       this.apellido2=papellido2;
    }
    public void setnacimiento(int pnacimiento){
        this.nacimiento=pnacimiento;
    }
    public void setlibros(Libros plibro){
        this.libro=plibro;
    }




    public String toString() {
        return "PRUEBA [codigoAutor=" + codigoAutor + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
                + apellido2 + ", nacimiento=" + nacimiento + "]";
    }


   
}
