public record Nodo(int dato, Nodo sinistro, Nodo destro) {

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
