
public class Auto {


    private String marca;
    private String modello;
    private String targa;

    public Auto(String marca, String modello, String targa) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
    }


    public String getMarca(){
        return marca;

    }
    public String getModello(){
        return modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", targa='" + targa + '\'' +
                '}';
    }
}



