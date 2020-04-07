package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {
    @Override
    public Result decide(Move mine, Move theirs) {
        if (mine.equals(theirs)) return Result.DRAW;

        switch (mine) {
            case ROCK: return theirs.equals(Move.SCISSORS) ? Result.WIN : Result.LOSE;
            case PAPER: return theirs.equals(Move.ROCK) ? Result.WIN : Result.LOSE;
            case SCISSORS: return theirs.equals(Move.PAPER) ? Result.WIN : Result.LOSE;
            default: return Result.DRAW;
        }
    }
}
