import com.oracle.svm.core.annotate.Inject;

public class Carro
  {
    int Ano;
    String Marca, Modelo, Cor;
    
    public void exibirModelo()
    {
      System.out.println("O modelo é: "+Modelo);
    }
    public void exibirAnoeCor()
    {
      System.out.println("O ano do carro é: "+Ano+" e a cor é: "+Cor);
    }
   
  }