public class HelloWorld1{

  public static void main(String[] args){
   String ambiente = args[0];
   if(ambiente.equalsIgnoreCase("DEV")) {
    System.out.print("Executando em DEV");
   }

  }
}
