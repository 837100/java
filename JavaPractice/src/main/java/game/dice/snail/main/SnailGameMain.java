/*
 * 콘솔 창에서 아무 입력이나 받아서 플레이어 2명 중 랜덤으로 승자 추출
 * (해야될 것) 중복된 코드 지우기
 */

package game.dice.snail.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import game.dice.snail.exception.DoubleException;
import game.dice.snail.logic.DiceLogic;
import game.dice.snail.object.Player;
import game.dice.snail.status.Status;
import game.dice.snail.status.StatusView;

public class SnailGameMain {

	public static void main(String[] args) {
		BufferedReader dicestart = new BufferedReader(new InputStreamReader(System.in));
		Player player1 = new Player("123", "user1", "kim", "fullTem", "starDice");
		Player player2 = new Player("456", "user2", "lee", "fullTem", "shineDice");
		Status status1 = new Status();
		Status status2 = new Status();
		status1.setWho(player1.getId());
		status2.setWho(player2.getId());

		int howgoing = 0;
		int player1round = 0;
		int player2round = 0;
		int player1howgoing = 0;
		int player2howgoing = 0;
		StatusView statusView = new StatusView();
		DiceLogic diceLogic = new DiceLogic();

		// 판 시작
		System.out.println("start!!!");
		for (int round = 0; round < 100; round++) {

			if ((player1howgoing >= 50) && (player1round == player2round) && (player1howgoing > player2howgoing)) {
				System.out.println(player1.getName() + "win");
				break;
			} else if ((player2howgoing >= 50) && (player1round == player2round)
					&& (player2howgoing > player1howgoing)) {
				System.out.println(player2.getName() + "win");
				break;
			}

			if (round % 2 == 0) {
				System.out.println(player1.getName() + "님의 차례");
				System.out.println("!!!주사위를 던져주세요!!!");

				try {
					if (!(dicestart.readLine() == null)) {
						List<Integer> dice1 = Arrays.asList(1, 2, 3, 4, 5, 6);
						List<Integer> dice2 = Arrays.asList(1, 2, 3, 4, 5, 6);
						Collections.shuffle(dice1);
						Collections.shuffle(dice2);
						int firstdice = dice1.get(0);
						int seconddice = dice2.get(0);

						if (firstdice == seconddice) {
							System.out.println("더블");
							howgoing = diceLogic.howgoing(firstdice, seconddice);
							player1howgoing += howgoing;
							throw new DoubleException();
						} else {
							howgoing = diceLogic.howgoing(firstdice, seconddice);
							player1howgoing += howgoing;
						}
					}
				} catch (DoubleException e) {
					round = round - 1;
					System.out.println("!!!더블!!!");
					continue;
				} catch (IOException e) {
					System.out.println("에러가 발생했습니다. 프로그램을 종료합니다.");
				}
				player1round++;
				System.out.println(player1.getName() + "님 나아간 칸 : " + player1howgoing + " 진행한 라운드" + player1round);
				statusView.statusView(player1howgoing);
				System.out.println();
				System.out.println();
			}
			System.out.println();

			if (round % 2 == 0) {
				System.out.println(player2.getName() + "님의 차례");
				System.out.println("!!!주사위를 던져주세요!!!");

				try {
					if (!(dicestart.readLine() == null)) {
						List<Integer> dice1 = Arrays.asList(1, 2, 3, 4, 5, 6);
						List<Integer> dice2 = Arrays.asList(1, 2, 3, 4, 5, 6);
						Collections.shuffle(dice1);
						Collections.shuffle(dice2);
						int firstdice = dice1.get(0);
						int seconddice = dice2.get(0);

						if (firstdice == seconddice) {
							System.out.println("더블");
							howgoing = diceLogic.howgoing(firstdice, seconddice);
							player2howgoing += howgoing;
							throw new DoubleException();
						} else {
							howgoing = diceLogic.howgoing(firstdice, seconddice);
							player2howgoing += howgoing;
						}
					}
				} catch (DoubleException e) {
					round = round - 1;
					System.out.println("!!!더블!!!");
					continue;
				} catch (IOException e) {
					System.out.println("에러가 발생했습니다. 프로그램을 종료합니다.");
				}
				player2round++;
				System.out.println(player2.getName() + "님 나아간 칸 : " + player2howgoing + " 진행한 라운드" + player2round);
				statusView.statusView(player2howgoing);
				System.out.println();
				System.out.println();
			}

		}
	} // end of main method

} // end of class
