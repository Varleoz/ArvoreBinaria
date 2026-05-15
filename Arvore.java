public class Arvore {

    private No raiz;

    public Arvore() {
        raiz = null;
    }


    public void inserir(int x) {

        No novo = new No(x);

        if (raiz == null) {
            raiz = novo;
            return;
        }

        No atual = raiz;
        No anterior = null;

        while (atual != null) {

            anterior = atual;

            if (x < atual.x) {
                atual = atual.esq;
            } else if (x > atual.x) {
                atual = atual.dir;
            } else {
                return;
            }
        }

        if (x < anterior.x) {
            anterior.esq = novo;
        } else {
            anterior.dir = novo;
        }
    }

    public boolean buscar(int x) {

        boolean achou = buscaRecursiva(raiz, x);

        if (achou) {
            System.out.println("O valor foi encontrado: " + x);
        } else {
            System.out.println("O valor NÃO foi encontrado: " + x);
        }

        return achou;
    }

    private boolean buscaRecursiva(No atual, int x) {

        if (atual == null) {
            return false;
        }

        if (atual.x == x) {
            return true;
        }

        if (x < atual.x) {
            return buscaRecursiva(atual.esq, x);
        }

        return buscaRecursiva(atual.dir, x);
    }
}