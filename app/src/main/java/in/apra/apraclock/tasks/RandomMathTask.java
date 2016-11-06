package in.apra.apraclock.tasks;

/**
 * Created by apra on 9/26/2016.
 */

public class RandomMathTask {
    int firstOp;
    int secondOp;
    int operator; //+, -, *

    public RandomMathTask(){
        firstOp=5+(int)(20.0*Math.random());
        secondOp=5+(int)(20.0*Math.random());
        operator=(int)(2.5*Math.random()); //biased against multiplications
    }
    public void init(int op1, int op2, int opType)
    {
        firstOp=op1;
        secondOp=op2;
        operator=opType;
    }
    private int solve()
    {
        switch(operator){
            case 0: return firstOp+secondOp;
            case 1: return firstOp-secondOp;
            case 2: return firstOp*secondOp;
        }
        throw new RuntimeException("Unknown operator");
    }
    public boolean checkAnswer(int userAnswer)
    {
        return userAnswer==solve();
    }
    @Override
    public String toString()
    {
        switch(operator){
            case 0:  return firstOp + " + " + secondOp + " = ?";

            case 1: return firstOp + " - "  + secondOp + " = ?";

            case 2: return firstOp + " x "  + secondOp + " = ?";

            default: throw new RuntimeException("Unknown Operator");
        }


    }
}
