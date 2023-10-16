public class formatadorcep {
public static void main(String[] args) {
    try {
        String meucep = formatarCep("23765073");
        System.out.println(meucep);
    } catch (CepInvalidoException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        System.out.println("o cep necessita ter 8 digitos");
    }
    
}

static String formatarCep(String cep) throws CepInvalidoException{
    if(cep.length() != 8)
      throw new CepInvalidoException();
    
      //simulando um cep formatado
      return "23.765-098";
}
}