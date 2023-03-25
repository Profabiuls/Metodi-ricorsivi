

public class Main {
    public static void main(String[] args) {

        Nodo nodo4 = new Nodo(4, null, null);
        Nodo nodo3 = new Nodo(7, null, null);
        Nodo nodo2 = new Nodo(2, nodo4, nodo3);
        Nodo nodo1 = new Nodo(1, nodo2, null);
        System.out.println(sommaNodiAlbero(nodo1));


    }

    static int sommaNodiAlbero(Nodo n) {
        if (n == null)
            return 0;
        Nodo a = n.getSinistro();
        Nodo b = n.getDestro();
        return n.getDato() + sommaNodiAlbero(a) + sommaNodiAlbero(b);

    }
}
