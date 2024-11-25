public class Animale {

    private String razza;
    private int eta;
    private float peso;

    Animale() {
        this.razza = "";
        this.eta = 0;
        this.peso = 0;
    }

    Animale(String razza, int eta, float peso) {
        this.razza = razza;
        this.eta = eta;
        this.peso = peso;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void stampa() {
        System.out.println("Razza: " + this.getRazza() + " età: " + this.getRazza() + " peso:" + this.peso + " kg");
    }

}
