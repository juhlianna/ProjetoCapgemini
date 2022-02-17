public class Questão3 {

    public static void main(String[] args) {


        String palavra = "ifailuhkqq";


        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i + 1; j < palavra.length(); j++) {
                if (palavra.charAt(i) == palavra.charAt(j)) {
                    System.out.println("São iguais: " + palavra.charAt(i) + " e " + palavra.charAt(j));
                    System.out.println("São iguais as posições: " + i + " e " + j);
                }
            }
        }




    }

}

