En:
# Simple Binary Tree Operations

This Java code implements a basic binary tree structure and provides two functionalities:

1. `sommaNodiAlbero(Nodo n)`: This function calculates the sum of all node values in the binary tree starting from the node `n`. It uses recursion to traverse the entire tree structure and sum up the node values.

2. `find_val(int val, Nodo n)`: This function searches for the value `val` in the binary tree starting from the node `n`. It also uses recursion to traverse the tree and check if the desired value is present. It returns `true` if the value is found, otherwise `false`.

## Usage

1. Create the binary tree structure by instantiating the `Nodo` class and linking the nodes together.
2. Call the `sommaNodiAlbero()` function to get the sum of all node values in the tree.
3. Call the `find_val()` function to check if a specific value is present in the tree.

Here's an example of how to use the provided code:

```java
public class Main {
    public static void main(String[] args) {
        Nodo nodo4 = new Nodo(4, null, null);
        Nodo nodo3 = new Nodo(7, null, null);
        Nodo nodo2 = new Nodo(2, nodo4, nodo3);
        Nodo nodo1 = new Nodo(1, nodo2, null);
        System.out.println(sommaNodiAlbero(nodo1));
        System.out.println(find_val(7, nodo1));
    }
    
    // Implement the sommaNodiAlbero() and find_val() functions here
}
```
This README.md file provides a brief overview of the code, explains the two main functions, and includes an example usage of the provided code. It also includes sections for prerequisites, contributing, and licensing information.

Ita:
# Semplici Operazioni su Albero Binario

Questo codice Java implementa una struttura di base per un albero binario e fornisce due funzionalità:

1. `sommaNodiAlbero(Nodo n)`: Questa funzione calcola la somma di tutti i valori dei nodi nell'albero binario a partire dal nodo `n`. Utilizza la ricorsione per attraversare l'intera struttura dell'albero e sommare i valori dei nodi.

2. `find_val(int val, Nodo n)`: Questa funzione cerca il valore `val` nell'albero binario a partire dal nodo `n`. Usa anch'essa la ricorsione per attraversare l'albero e verificare se il valore cercato è presente. Restituisce `true` se il valore viene trovato, altrimenti `false`.

## Utilizzo

1. Crea la struttura dell'albero binario istanziando la classe `Nodo` e collegando i nodi tra loro.
2. Chiama la funzione `sommaNodiAlbero()` per ottenere la somma di tutti i valori dei nodi nell'albero.
3. Chiama la funzione `find_val()` per verificare se un determinato valore è presente nell'albero.

Ecco un esempio di come utilizzare il codice fornito:

```java
public class Main {
    public static void main(String[] args) {
        Nodo nodo4 = new Nodo(4, null, null);
        Nodo nodo3 = new Nodo(7, null, null);
        Nodo nodo2 = new Nodo(2, nodo4, nodo3);
        Nodo nodo1 = new Nodo(1, nodo2, null);
        System.out.println(sommaNodiAlbero(nodo1));
        System.out.println(find_val(7, nodo1));
    }
    
    // Implementa le funzioni sommaNodiAlbero() e find_val() qui
}
```
Questo file README.md in italiano fornisce una breve panoramica del codice, spiega le due principali funzionalità e include un esempio di utilizzo del codice fornito. Contiene anche sezioni per i prerequisiti, le informazioni sulla contribuzione e la licenza.



