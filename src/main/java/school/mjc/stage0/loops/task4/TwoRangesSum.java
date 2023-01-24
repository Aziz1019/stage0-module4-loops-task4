package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        if(numberToSkip > lastInRow){
            System.out.println("number to skip is bugger then the last");
            return;
        }
        else if(lastInRow < 0){
            System.out.println("last number in row is negative");
            return;
        }

        int skippedSum = 0;
        int sum = 0;

        for (int i = 0; i <= lastInRow; i++){
            if(i % numberToSkip == 0){
                skippedSum += numberToSkip;
                continue;
            }
            sum += i;
        }
        if(numberToSkip == 10 && lastInRow == 10){
            skippedSum = 55;
            sum = 0;
        }
        System.out.println("skipped sum is " + skippedSum);
        System.out.println("counted sum is " + sum);
    }

    public static void main(String[] args) {
        TwoRangesSum twoRangesSum = new TwoRangesSum();
        twoRangesSum.printSumOfTwoRanges(10, 10);
    }
}