
package procesos;

public class MatrizNros
{
    private double elemento[][];
        
    public MatrizNros(int m, int n)
    {
        elemento = new double[m][n];
    }

    public void setElemento(double dato, int i, int j)
    {
        elemento[i][j] = dato;
    }

    public double getElemento(int i, int j)
    {
        return elemento[i][j];
    }
}
