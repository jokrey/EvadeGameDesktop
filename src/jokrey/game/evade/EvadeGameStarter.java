package jokrey.game.evade;

import jokrey.utilities.animation.implementations.swing.display.Swing_FullScreenStarter;
import jokrey.utilities.animation.implementations.swing.pipeline.AnimationDrawerSwing;

public class EvadeGameStarter {
	public static void main(String[] args) {
		Swing_FullScreenStarter.start(new EvadeGameEngine(), new EvadeGamePipeline(new AnimationDrawerSwing()));
//		JavaFX_FullScreenStarter.start(new EvadeGameEngine(), new EvadeGamePipeline(new AnimationDrawerJavaFX()));
	}
}
