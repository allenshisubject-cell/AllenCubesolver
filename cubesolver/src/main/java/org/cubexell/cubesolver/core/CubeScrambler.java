package org.cubexell.cubesolver.core;

import static org.cubexell.cubesolver.core.CubeConstants.POSSIBLE_MOVES;

public class CubeScrambler {
	private Robot robot;
	public CubeScrambler() {
	}

	public CubeScrambler(Robot robot) {
		this.robot = robot;
	}

	protected String randomScrambleMove() {
		int randomIndex = (int)(18*Math.random());
		return POSSIBLE_MOVES[randomIndex];
	}

	protected char getFace(String move) {
		return move.charAt(0);
	}

	public String[] getScramble(int numMoves) {
		//TODO generate a random scramble with numMoves moves
		//TODO ensure that no repetition of the turns with the same face, because that could be simplified into one turn






		/*hint: declare and initialize a String array with length numMoves. Then, generate the first random move
		by calling randomScrambleMove(). Next, use a for loop to go through the rest of the moves, but resetting each
		iteration if the face turned by a turn is the same as the previous turn (che`ck using getFace(String move)).
		Finally, return complete sequence of random moves.

		 */
	}

	public char[][][] scramble(String[] scrambleMoves){
	    Cube cube = new Cube(Helper.createSolvedCubeColors());
		cube.simulateMoves(scrambleMoves);
		if(robot!=null){
			robot.executeMoves(scrambleMoves);
		}
		return cube.getCubeColors();
	}

	public char[][][] randomScramble(){
	    Cube cube = new Cube(Helper.createSolvedCubeColors());
		String[] scrambleMoves = getScramble(20);
	    cube.simulateMoves(scrambleMoves);
		if(robot!=null){
			robot.executeMoves(scrambleMoves);
		}
		return cube.getCubeColors();
	}
	
}
