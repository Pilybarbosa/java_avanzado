package Dopost;

import RedesS.Red;

public class Instagram extends Red {
    private String amigo;

    public Instagram () {

    }

    public Instagram (String amigo) {
        this.amigo = amigo;
    }

    public String getAmigo() {
        return amigo;
    }

    public void setAmigo(String amigo) {
        this.amigo = amigo;
    }

   public String modificarAmigos (){
    return amigo;
   }
}
