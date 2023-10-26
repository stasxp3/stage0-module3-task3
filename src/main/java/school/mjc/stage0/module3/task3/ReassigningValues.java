package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
    int first=1,second=10,third=100;
    System.out.println(first);
    System.out.println(second);
    System.out.println(third);
    var linkToFirst = first;
    var linkToSecond = second;
    var linkToThird = third;
    first=15;
    second=6;
    third=4;
    System.out.println(linkToFirst);
    System.out.println(linkToSecond);
    System.out.println(linkToThird);
    }
}
