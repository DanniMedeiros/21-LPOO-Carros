class Main {
  public static void main(String[] args) {
     
  Carro C1 = new Carro(); //instancia
    C1.Ano = 1980;
    C1.Marca = "VW";
    C1.Modelo = "Fusca";
    C1.Cor = "Azul";
    C1.exibirAnoeCor();
    C1.exibirModelo();
  Carro C2 = new Carro();
    C2.Ano = 2000;
    C2.Marca = "Ford";
    C2.Modelo = "Fiesta";
    C2.Cor = "Vermelho";
    C2.exibirAnoeCor();
    C2.exibirModelo();
    Carro meuCarro = new Carro();
    meuCarro.Ano = 2016;
    meuCarro.Marca = "Chevrolet";
    meuCarro.Modelo = "Onix";
    meuCarro.Cor = "Cinza Espacial";
    meuCarro.exibirAnoeCor();
    meuCarro.exibirModelo();
  }
}
