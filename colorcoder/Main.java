package colorcoder;

public class Main {
    
   final static String MajorColorNames[] = {
        "White", "Red", "Black", "Yellow", "Violet"
    };
   final static int numberOfMajorColors = MajorColorNames.length;
   final static String MinorColorNames[] = {
        "Blue", "Orange", "Green", "Brown", "Slate"
    };
    final static int numberOfMinorColors = MinorColorNames.length;

    static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = 
            MajorColor.fromIndex(zeroBasedPairNumber / numberOfMinorColors);
        MinorColor minorColor =
            MinorColor.fromIndex(zeroBasedPairNumber % numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }
    static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
    }
    static void printManual() {
        int count = 1;
        for(int i = 0 ; i< MajorColorNames.length ; i++) {
            for(int j = 0; j<MinorColorNames.length ; j++) {
                 System.out.println(count + " - " + MajorColorNames[i] + " & " + MinorColorNames[j]);
                 count++;
            }
        }
    }

    public static void main(String[] args) {
        Test test= new Test();
       test.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        test.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        test.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        test.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
        printManual();
    }
}
