
package procesos;

public class ListaSimpleCaracteres
{
    public Nodo inicio;
    
    public Nodo retornarUltimo()
    {
        Nodo p = inicio;

        while (p.sgte != null)
            p = p.sgte;

        return p;
    }

    public Nodo retornarAnterior(Nodo q)
    {
        Nodo p = inicio;

        while (p.sgte != q)
            p = p.sgte;

        return p;
    }

    public void adicionar(String dato)
    {
        Nodo nuevo, ultimo;
        nuevo = new Nodo();

        nuevo.info = dato;
        nuevo.sgte = null;

        if (inicio == null)
            inicio = nuevo;
        else
        {
            ultimo = retornarUltimo();
            ultimo.sgte = nuevo;
        }
    }

    public int contar() // conteo iterativo
    {
        int conta = 0;
        
        Nodo p = inicio;

        while (p != null)
        {
            conta = conta + 1;
            p = p.sgte;
        }
        return conta;
    }
    
    public int contar(Nodo p)   // conteo recursivo
    {
        if (p == null)
            return 0;
        else
            return 1 + contar(p.sgte);
        
    }
}