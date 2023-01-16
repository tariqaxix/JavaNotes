package ProblemSet2;

public class FightSong {
    public static void main(String[] args){
        method2();
        method4();
        method4();
        method1();
    }

    public static void method1() {
        System.out.println("Go, team, go!");
        System.out.println("You can do it.");
    }

    public static void method2() {
        method1();
        System.out.println();
    }

    public static void method3() {
        System.out.println("You're the best,");
        System.out.println("In the West.");
    }

    public static void method4() {
        method1();
        method3();
        method2();
    }
}