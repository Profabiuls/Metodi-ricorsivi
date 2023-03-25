public class Nodo {
    private int dato;
    private Nodo sinistro, destro;
    public Nodo(int dato, Nodo sinistro, Nodo destro) {
        this.dato=dato;
        this.sinistro=sinistro;
        this.destro=destro;
    }
    public int getDato() {
        return this.dato;
    }
    public Nodo getSinistro() {
        return this.sinistro;
    }
    public Nodo getDestro() {
        return this.destro;
    }
}
