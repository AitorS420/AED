
package proicesos;

public class VectorNros
{
    private double elemento[];
    private int conta;
    
    public VectorNros(int tamaño)
    {
        conta = 0;
        elemento = new double[tamaño];
    }
        
    public int getConta()
    {
        return conta;
    }
    
    public double getElemento(int pos)
    {
        return elemento[pos];
    }
    
    public void adicionar(double dato)
    {
        elemento[conta] = dato;
        conta = conta + 1;
    }
    
    public int buscarSecuencial(double dato)    // Búsqueda secuencial
    {
        int i;
                
        for (i = 0; i < conta; i=i+1)
            if (elemento[i] == dato)
                return i;

        return -1;
    }
    
    public int buscarBinaria(double dato)      // Búsqueda binaria
    {
        int limInf, limSup, medio;

        ordenar();   // Requisito

        limInf = 0;
        limSup = conta - 1;

        do
        {
            medio = (limInf + limSup) / 2;

            if (dato == elemento[medio])
                return medio;

            if (dato < elemento[medio])
                limSup = medio - 1;
            else
                limInf = medio + 1;
        }
        while(limInf <= limSup);

        return -1;
    }
        
    public void modificar(double dato, int pos)
    {
        elemento[pos] = dato;
    }
    
    public void eliminar(int pos)
    {
        int i;

        for (i = pos; i < (conta-1); i=i+1)
            elemento[i] = elemento[i + 1];

        conta = conta - 1;
    }
    
    public void ordenar() {}
}
