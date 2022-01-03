package me.minicore.numberwriter.numbers;

public class Numbers {

    private final Boolean[][] zeroBlocks = {
            {true, true, true},
            {true, false, true},
            {true, false, true},
            {true, false, true},
            {true, true, true}
    };

    private final Boolean[][] oneBlocks = {
            {false, true, false},
            {true, true, false},
            {false, true, false},
            {false, true, false},
            {true, true, true}
    };

    private final Boolean[][] twoBlocks = {
            {true, true, true},
            {false, false, true},
            {true, true, true},
            {true, false, false},
            {true, true, true}
    };

    private final Boolean[][] threeBlocks = {
            {true, true, true},
            {false, false, true},
            {false, true, true},
            {false, false, true},
            {true, true, true}
    };

    private final Boolean[][] fourBlocks = {
            {true, false, true},
            {true, false, true},
            {true, true, true},
            {false, false, true},
            {false, false, true}
    };

    private final Boolean[][] fiveBlocks = {
            {true, true, true},
            {true, false, false},
            {true, true, true},
            {false, false, true},
            {true, true, true}
    };

    private final Boolean[][] sixBlocks = {
            {true, true, true},
            {true, false, false},
            {true, true, true},
            {true, false, true},
            {true, true, true}
    };

    private final Boolean[][] sevenBlocks = {
            {true, true, true},
            {false, false, true},
            {false, false, true},
            {false, false, true},
            {false, false, true}
    };

    private final Boolean[][] eightBlocks = {
            {true, true, true},
            {true, false, true},
            {true, true, true},
            {true, false, true},
            {true, true, true}

    };

    private final Boolean[][] nineBlocks = {
            {true, true, true},
            {true, false, true},
            {true, true, true},
            {false, false, true},
            {true, true, true}
    };

    public Boolean[][] getArray(int number) {
        switch (number) {
            case 0:
                return zeroBlocks;
            case 1:
                return oneBlocks;
            case 2:
                return twoBlocks;
            case 3:
                return threeBlocks;
            case 4:
                return fourBlocks;
            case 5:
                return fiveBlocks;
            case 6:
                return sixBlocks;
            case 7:
                return sevenBlocks;
            case 8:
                return eightBlocks;
            case 9:
                return nineBlocks;
        }
        return zeroBlocks;
    }


}
