package Java;

public class MathPackage{
public static void main(String[] args){
    int TestMin = Math.min(2, 3);
    System.out.println("Min "+TestMin);
     int TestMax = Math.max(2, 3);
    System.out.println("Max"+TestMax);
     int TestAbs = Math.abs(2);
    System.out.println("Abs"+TestAbs);
    double TestSqrt = Math.sqrt(19);
    System.out.println("Sqrt "+TestSqrt);
    double TestPow = Math.pow(5, 2);
    System.out.println("Pow "+TestPow);
    double TestCeil= Math.ceil(5.4);
    System.out.println("Ceil: "+TestCeil);
    double TestRound = Math.round(5.4);
    System.out.println("Round: "+TestRound);
    double TestFloor = Math.floor(5.5);
    System.out.println("Floor"+TestFloor);
}
}
