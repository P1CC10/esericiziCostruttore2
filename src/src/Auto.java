
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

    public String setMarca() {
        return marca;
    }

    public String setModello() {
        return modello;
    }

    public String setTarga() {
        return targa;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", targa=" + targa +
                '}';
    }
}


