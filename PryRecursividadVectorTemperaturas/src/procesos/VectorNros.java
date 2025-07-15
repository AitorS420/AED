
package procesos;

public class VectorNros
{
    private double elemento[];
    private int conta;
    
    public VectorNros(int tamaño)
    {
        conta = 0;
        elemento = new double[tamaño];
    }
    
    public int getConta()   { return conta; }
    
    public double getElemento(int pos)  { return elemento[pos]; }
    
    public void limpiar()
    {
        conta = 0;
    }
    
    public void adicionar(double dato)
    {
        elemento[conta] = dato;
        conta = conta + 1;
    }
    
    public double sumar(int i)  // método recursivo
    {
        if (i < 0)
        return 0;
        else 
            return elemento[i] + sumar(i-1);
    }
}
