package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if(numberToGoUntil < toBreakWith){
            System.out.println("iterating till the end");
        }
        for (int i = 1; i <= numberToGoUntil; i++){
            if(toBreakWith >= i) {
                System.out.println(i);
                if(toBreakWith == i){
                    break;
                }
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        NumberToBreakOn numberToBreakOn = new NumberToBreakOn();
        numberToBreakOn.printNumbersUntilWithBreakOn(6,5);
    }
}
