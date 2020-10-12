#!/usr/local/bin/python3
# -*- coding: utf-8 -*-
from Tic_Tac_Toe import TicTacToe
from module import manual, alpha_beta_pruning, monte_carlo_simulation

#f = manual
f = alpha_beta_pruning
# f = monte_carlo_simulation


if __name__ == "__main__":
    game = TicTacToe()
    board = game.reset()

    while True:
        print(board)
        action = f(board)
        board, done, info = game.step(action)

        if done:
            print(board)
            print('Winner:', info['winner'])
            break
