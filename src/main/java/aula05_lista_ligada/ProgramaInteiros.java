package aula05_lista_ligada;

public class ProgramaInteiros {
    public static void main(String[] args) {
        ListaLigada<Integer> numeros = new ListaLigada<Integer>();
        numeros.adicionar(3);
        numeros.adicionar(4);
        numeros.adicionar(5);
        
        System.out.println("Tamanho: " + numeros.getTamanho());
        for(int i=0; i < numeros.getTamanho(); i++){
            System.out.println(numeros.get(i).getValor());
        }
               
    }
}
