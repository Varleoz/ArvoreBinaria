public class Valores {
    public static void main(String[] args) {
        Arvore arv = new Arvore();

        arv.inserir(10);
        arv.inserir(1);
        arv.inserir(50);
        arv.inserir(2);
        arv.inserir(43);
        arv.inserir(37);
        System.out.println(arv.buscar(2));
        System.out.println(arv.buscar(10));  
        System.out.println(arv.buscar(37));  
    }
}
