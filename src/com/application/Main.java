package com.application;

import com.boardgame.Board;
import com.boardgame.Position;

public class Main {

    public static void main(String[] args) {

        Position position = new Position(3,5);
        System.out.println(position);

        Board board = new Board(8,8);
    }
}
