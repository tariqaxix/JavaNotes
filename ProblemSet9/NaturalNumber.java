package ProblemSet9;

public class NaturalNumber {
    private final int num;

    public NaturalNumber(int num) {
        this.num = num;
    }
    public Classification getClassification(){
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            return Classification.PERFECT;
        }
        else if(sum>num){
            return Classification.ABUNDANT;
        }
        else{
            return Classification.DEFICIENT;
        }
    }
}
