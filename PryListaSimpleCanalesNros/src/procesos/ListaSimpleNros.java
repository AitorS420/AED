
package procesos;

public class ListaSimpleNros
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

    public void adicionar(double dato)
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

    public int contar()
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

    public Nodo buscar(double dato)
    {
        Nodo p = inicio;

        while (p != null)
        {
            if (p.info == dato)
                return p;

            p = p.sgte;
        }
        return null;
    }
    
    public void eliminar(Nodo actual)
    {
        Nodo anterior;

        if (actual == inicio)
            inicio = inicio.sgte;
        else
        {
            anterior = retornarAnterior(actual);
            anterior.sgte = actual.sgte;
        }
    }
    
    public void ordenar()
    {
        Nodo p, q;
        double tempo;
        
        p = inicio;
        while(p.sgte != null)
        {
            q = p.sgte;
            while(q != null)
            {
                if(p.info > q.info)
                {
                    tempo = p.info;
                    p.info = q.info;
                    q.info = tempo;
                }
                q = q.sgte;
            }
            p = p.sgte;
        }
    }
    
    public void insertarAlInicio(double dato)
    {
        // implementar
    }
}
