package ESTUDOS;

public class Wrapper{
    public static void main(String[] args){
        String numberStr = "123";
        int number = Integer.parseInt(numberStr);
        System.out.println("Numero convertido: " + number);
        int nub1 = 10;
        int nub2 = 20;
        int comparisonResult = Integer.compare(nub1, nub2);
        if(comparisonResult < 0){
            System.out.println(nub1 + " É menor que " + nub2);
        }else if(comparisonResult > 0){
            System.out.println(nub1 + " É maior que " + nub2);
        }else{
            System.out.println(nub1 + " É igual a " + nub2);
        }
    }
}