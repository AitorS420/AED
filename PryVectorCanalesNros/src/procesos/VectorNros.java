
package procesos;

public class VectorNros
{
    private double elementos[];
    private int conta;
    
    public VectorNros(int tamaño)
    {
        conta = 0;
        elementos = new double[tamaño];
    }
    
    public int getConta()               { return conta; }
    
    public double getElemento(int pos)  { return elementos[pos]; }
    
    public void adicionar(double dato)
    {
        elementos[conta] = dato;
        conta = conta + 1;
    }
    
    public int buscarSecuencial(double dato)    // Búsqueda secuencial
    {
        int i;
        
        for (i = 0; i < conta; i++)
            if (dato == elementos[i])
                return i;

        return -1;
    }
    
    public int buscarBinaria(double dato)       // Búsqueda binaria
    {
        int limInf, limSup, medio;

        ordenarBurbuja();   // Requisito

        limInf = 0;
        limSup = conta - 1;

        do
        {
            medio = (limInf + limSup) / 2;

            if (dato == elementos[medio])
                return medio;

            if (dato < elementos[medio])
                limSup = medio - 1;
            else
                limInf = medio + 1;
        }
        while(limInf <= limSup);

        return -1;
    }
    
    public void modificar(double dato, int pos)
    {
        elementos[pos] = dato;
    }
    
    public void eliminar(int pos)
    {
        int i;
        
        for (i = pos; i < (conta-1); i++)
            elementos[i] = elementos[i + 1];

        conta = conta - 1;
    }

    public void ordenarBurbuja()    // Ordenamiento Burbuja
    {
        int i, j;
        double tempo;
        
        for(i=0; i<conta-1; i++)
            for(j=i+1; j<conta; j++)
                if (elementos[i] > elementos[j])
                {
                    tempo = elementos[i];
                    elementos[i] = elementos[j];
                    elementos[j] = tempo;
                }
    }
    
    public void ordenarPorSeleccion()    // Ordenamiento por Selección
    {
        int i, j, pos;
        double tempo;
        
        for(i=0; i<conta-1; i++)
        {
            pos = i;
        
            for(j=i+1; j<conta; j++)
                if (elementos[pos] > elementos[j])
                    pos = j;
                
            tempo = elementos[i];
            elementos[i] = elementos[pos];
            elementos[pos] = tempo;
        }
    }
    
    public void invertirPosiciones()
    {
        // implementar
    }
    
    public void insertar(double dato, int pos)
    {
        // implementar
    }
}
