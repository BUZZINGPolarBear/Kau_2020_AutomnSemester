# 2020.09.01 RETELLIGENCE IEZANOV IWEN
# Contact : iwinstudioi@gmail.com

#################### 조 교 의 팁 ####################
#                                                  #
#           Minimax 와 Pruning 설명 영상            #
#    https://www.youtube.com/watch?v=l-hh51ncgDI   #
#                                                  #
####################################################

# 본 코드는 한국항공대학교 소프트웨어학과 지승도 교수님의 "AI입문" 수업의 과제중 일부로 사용됩니다.
# 교육 목적을 위해 수정할 수 있으나 배포하거나 상업적 목적으로 이용하는 것을 금합니다.
# This code is used as part of the assignments of Professor Seungdo Chi's "Introduction to Artificial Intelligence"
# class of Korea Aerospace University Software Department.
# Modifications are permitted for educational purposes, but distribution or commercial use is prohibited.

# 본 코드는 아래 주소의 Tic Tac Toe 코드를 참고하여 만들어졌습니다.
# This code was created by referring to the Tic Tac Toe code at the address below.
# https://www.geeksforgeeks.org/python-implementation-automatic-tic-tac-toe-game-using-random-number/

######################################### 과 제 설 명 #########################################
#
# Tic Tac Toe 게임을 하는 인공지능을 만들어 보면서 수업에서 배운 여러 개념들을 연습해 봅시다.
# 몬테카를로 기법과 알파-베타 가지치기 알고리즘을 활용해 봅시다.
# 목표는 다음 수를 랜덤하게 고르는 컴퓨터를 상대로 이 게임을 이기는 인공지능을 만들어보는 것입니다.
# 아래 코드를 잘 읽어보고 똑똑하게 다음 수를 고르는 코드를 작성해 봅시다.
# 필요한 함수를 추가할 수 있지만 기존의 함수를 가급적이면 수정하지 마시길 바랍니다.
# 코드의 맨 아래부분의 "똑똑한 당신이 만든 인공지능의 차례" 부분에 코드를 추가하시면 됩니다.
#
# 당신의 인공지능은 알파-베타 가지치기를 위해 최대 3수 앞까지 내다볼 수 있습니다.
# 3수 이후의 수는 볼 수 없으나 몬테카를로 기법을 이용한 예측을 통해 3수 앞의 상황을 예상할 수 있습니다.
# 깊이가 3인 트리 구조를 활용하는 것도 좋은 방법입니다.
#
##############################################################################################

# Numpy 와 Random 라이브러리 임포트 (Numpy는 따로 설치가 필요합니다. => https://tariat.tistory.com/156 참고)
import random
from time import sleep

import numpy as np


"""
# 새로운 보드(3x3) 생성
def create_board():
    return np.array([[0, 0, 0],
                     [0, 0, 0],
                     [0, 0, 0]])

# 몬테카를로 시뮬레이션
def MonteCarlo_Simulation(board, player, Number_of_Simulations = 20):
    win, lose, winRate = 0, 0, 0
    # 코드작성 시작 ################################################################################



    # 코드 작성 끝 #################################################################################
    return winRate


# 게임을 플레이하는 메인 함수
def play_game():
    board, winner, counter, P2_mistake = create_board(), 0, 1, False
    print(board)
    sleep(2)

    while winner == 0:

        # 멍청한 컴퓨터의 차례
        if not P2_mistake:
            player = 1
            board = random_place(board, player)
            print("Board after " + str(counter) + " move")
            print(board)
            sleep(2)
            counter += 1
            winner = evaluate(board)
            if winner != 0:
                break

######### 똑똑한 당신이 만든 인공지능의 차례 시작 ##########################################################################

        player = 2

        try:
            newPlace_R = int(input("Where? (row starts from 0): "))
            newPlace_C = int(input("Where? (col starts from 0): "))

            if board[newPlace_R, newPlace_C] == 0:
                board[newPlace_R, newPlace_C] = player
        except ValueError:
            print("input error !!!")
            P2_mistake = True

        else:
            P2_mistake = False
            print("Board after " + str(counter) + " move")
            print(board)
            sleep(2)
            counter += 1
            winner = evaluate(board)
            if winner != 0:
                break

######### 똑똑한 당신이 만든 인공지능의 차례 끄읕 ##########################################################################

    if winner == -1:
        winner = "Nobody"
    return winner
"""


class TicTacToe:

    def __init__(self):
        pass

    def reset(self):
        self.board = np.array([[0, 0, 0],
                               [0, 0, 0],
                               [0, 0, 0]])
        bot_choice = self.random_place(self.board)
        self.board[bot_choice] = 2
        return self.board

    def step(self, action):
        done = False
        self.board[action] = 1  # Player
        winner = self.evaluate(self.board)
        if winner != 0:
            done = True
        else:
            bot_choice = self.random_place(self.board)
            self.board[bot_choice] = 2
            winner = self.evaluate(self.board)
            done = (winner != 0)
        info = {
            'winner': winner,
            'possibilities': self.possibilities(self.board)
        }
        return self.board, done, info

    # 보드 내에 모든 빈칸을 찾아서 반환하는 함수
    def possibilities(self, board):
        cells = []
        for i in range(len(board)):
            for j in range(len(board)):
                if board[i][j] == 0:
                    cells.append((i, j))
        return cells

    # 빈칸 중에서 랜덤하게 하나의 빈칸을 선택하는 함수
    def random_place(self, board):
        selection = self.possibilities(board)
        return random.choice(selection)

    # 승자가 있는지 or 무승부인지 판단하는 함수
    def evaluate(self, board):
        winner = 0

        for player in [1, 2]:
            if (self.row_win(board, player) or
                self.col_win(board, player) or
                self.diag_win(board, player)):

                winner = player

        if np.all(board != 0) and winner == 0:
            winner = -1
        return winner

    # 주어진 플레이어가 가로로 연속된 3개의 마크를 가졌는지 판단하는 함수
    def row_win(self, board, player):
        for x in range(len(board)):
            win = True

            for y in range(len(board)):
                if board[x, y] != player:
                    win = False
                    continue

            if win is True:
                return win
        return win

    # 주어진 플레이어가 세로로 연속된 3개의 마크를 가졌는지 판단하는 함수
    def col_win(self, board, player):
        for x in range(len(board)):
            win = True

            for y in range(len(board)):
                if board[y][x] != player:
                    win = False
                    continue

            if win is True:
                return win
        return win

    # 주어진 플레이어가 대각선으로 연속된 3개의 마크를 가졌는지 판단하는 함수
    def diag_win(self, board, player):
        win = True
        y = 0
        for x in range(len(board)):
            if board[x][x] != player:
                win = False
        if win:
            return win
        win = True
        if win:
            for x in range(len(board)):
                y = len(board) - 1 - x
                if board[x][y] != player:
                    win = False
        return win


if __name__ == "__main__":
    # 종료 후 승자 출력
    print("Winner is: " + str(play_game()))
