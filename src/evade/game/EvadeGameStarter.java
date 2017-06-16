package evade.game;

import util.animation.implementations.java_fx.display.JavaFX_FullScreenStarter;
import util.animation.implementations.java_fx.pipeline.AnimationDrawerJavaFX;

public class EvadeGameStarter {
	public static void main(String[] args) {
//		Swing_FullScreenStarter.start(new EvadeGameEngine(), new EvadeGamePipeline(new AnimationDrawerSwing()));
		JavaFX_FullScreenStarter.start(new EvadeGameEngine(), new EvadeGamePipeline(new AnimationDrawerJavaFX()));
	}
}
