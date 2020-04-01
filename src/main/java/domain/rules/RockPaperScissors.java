package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {

    private Result getResult(boolean result) {
        if (result) {
            return Result.WIN;
        }
        return Result.LOSE;
    }

    @Override
    public Result decide(Move mine, Move theirs) {
        if (mine.equals(theirs)) {
            return Result.DRAW;
        }

        switch (mine) {
            case ROCK:
                return getResult(theirs.equals(Move.SCISSORS));
            case PAPER:
                return getResult(theirs.equals(Move.ROCK));
            case SCISSORS:
                return getResult(theirs.equals(Move.PAPER));
        }

        return Result.DRAW;
    }
}
