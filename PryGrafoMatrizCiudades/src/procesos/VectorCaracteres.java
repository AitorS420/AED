package procesos;

public class VectorCaracteres
{
    private String elemento[];
    private int conta;
    
    public VectorCaracteres(int tam)
    {
        conta = 0;
        elemento = new String[tam];
    }

    public int getConta()               { return conta; }

    public String getElemento(int pos)  { return elemento[pos]; }
    
    public void adicionar(String dato)
    {
        elemento[conta] = dato;
        conta = conta + 1;
    }
   
    public int buscar(String dato)
    {
        int i;

        for (i = 0; i < conta; i++)
            if (elemento[i].equals(dato))
                return i;

        return -1;
    }
}
