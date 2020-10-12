#!/usr/local/bin/python3
# -*- coding: utf-8 -*-
from Tic_Tac_Toe import TicTacToe

cnt=0

def manual(board, depth, alpha, beta, maximizingPlayer):
    while True:
        newPlace_R = int(input("Where? (row starts from 0): "))
        newPlace_C = int(input("Where? (col starts from 0): "))
        if board[newPlace_R, newPlace_C] == 0:
            break
    return (newPlace_R, newPlace_C)


def alpha_beta_pruning(position):
    a = minimax(position, 8, -1000, 1000, 1)
    return a[0], a[1]

def minimax(position, depth, alpha, beta, maximizingPlayer):
    getTicTacToe = TicTacToe()

    if depth == 0:
        temp = getTicTacToe.evaluate(position)
        score = hueristicEval(position)
        return[-1, -1, score]

    if maximizingPlayer == 1:
        maxEval = -10000
        for cell in getTicTacToe.possibilities(position):
            x, y = cell[0], cell[1]
            position[x][y] = 1
            if getTicTacToe.evaluate(position) == 1:
                position[x][y] = 0
                return [x, y, +10000]
            eval = minimax(position, depth-1, alpha, beta, (maximizingPlayer%2)+1)
            position[x][y] = 0
            maxEval = max(maxEval, eval[2])
            alpha = max(alpha, eval[2])
            if beta <= alpha:
                break

        return [x, y, maxEval]

    elif maximizingPlayer == 2:
        minEval = 10000
        for cell in getTicTacToe.possibilities(position):
            x, y = cell[0], cell[1]
            position[x][y] = 2
            if getTicTacToe.evaluate(position) == 2:
                position[x][y] = 0
                return [x, y, 10000]
            eval = minimax(position, depth-1, alpha, beta, (maximizingPlayer%2)+1)
            position[x][y] = 0
            minEval = min(minEval, eval[2])
            beta = min(beta, eval[2])
            if beta <= alpha:
                break;

        return [x, y, minEval]



def hueristicEval(position):
    a = 0
    b = 0
    for i in range(0, 3):
        if position[i][0] == 1  or position[i][1] == 1 or position[i][2] == 1:
            if position[i][0] != 2 and position[i][1] != 2 and position[i][2] != 2:
                a = a + 1
        if position[0][i] == 1 or position[1][i] == 1 or position[2][i] == 1:
            if position[0][i] != 2 and position[1][i] != 2 and position[2][i] != 2:
                a = a + 1
    if position[0][0] == 1 or position[1][1] == 1 or position[2][2] == 1:
        if position[0][0] != 2 and position[1][1] != 2 and position[2][2] != 2:
            a = a + 1
    if position[0][2] == 1 or position[1][1] == 1 or position[2][0] == 1:
        if position[0][2] != 2 and position[1][1] != 2 and position[2][0] != 2:
            a = a + 1
    for i in range(0, 3):
        if position[i][0] == 2 or position[i][1] == 2 or position[i][2] == 2:
            if position[i][0] != 1 and position[i][1] != 1 and position[i][2] != 1:
                b = b + 1
        if position[0][i] == 2 or position[1][i] == 2 or position[2][i] == 2:
            if position[0][i] != 1 and position[1][i] != 1 and position[2][i] != 1:
                b = b + 1
    if position[0][0] == 2 or position[1][1] == 2 or position[2][2] == 2:
        if position[0][0] != 1 and position[1][1] != 1 and position[2][2] != 1:
            b = b + 1
    if position[0][2] == 2 or position[1][1] == 2 or position[2][0] == 2:
        if position[0][2] != 1 and position[1][1] != 1 and position[2][0] != 1:
            b = b + 1
    return b - a

def monte_carlo_simulation(board):
    """
    Args:
        board: 3x3 크기의 게임 보드
    Returns:
        (x, y): Monte-Carlo Simulation을 통해 계산한 최선의 다음 수
    """
    getTicTacToe = TicTacToe()
    x, y = (-1, -1)
    # TODO: Not Implemented
    return (x, y)


if __name__ == "__main__":
    pass