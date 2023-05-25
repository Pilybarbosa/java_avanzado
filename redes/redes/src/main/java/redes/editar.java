package redes;

public  class editar  extends publicaciones {
    

    
    private String  img;
    private String  comentar;
    public String  etiqueta;

public editar(){

}



    public editar(String img, String comentar, String etiqueta) {
    this.img = img;
    this.comentar = comentar;
    this.etiqueta = etiqueta;
}



    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public String getComentar() {
        return comentar;
    }
    public void setComentar(String comentar) {
        this.comentar = comentar;
    }
    public String getEtiqueta() {
        return etiqueta;
    }
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }



    @Override
    public String publicacionPerfil() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'publicacionPerfil'");
    }
}
