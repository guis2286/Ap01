class academico{
  void(){

    System.out.println("MÉDIA: " + media);
        if (media >= 6)
            System.out.println("APROVADO");
        else {
                System.out.println("NAO APROVADO");
                System.out.print("substitutiva...: ");
                sub = teclado.nextFloat();

                if (prova1 > prova2)
                    maior = prova1;
                else
                    maior = prova2;
        
                media = (sub + maior)/2;

                System.out.println("MÉDIA: " + media);
                if (media >= 6)
                      System.out.println("APROVADO");
                else {
                    System.out.println("NAO APROVADO");
                    System.out.print("exame...: ");
                    exame = teclado.nextFloat();

                    media = (exame + media)/2;
                    System.out.println("MÉDIA: " + media);
                    if (media >= 6)
                        System.out.println("APROVADO");
                    else {
                        System.out.println("NAO APROVADO");
                      }
                  }
          }