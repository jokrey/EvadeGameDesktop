package evade.game;

import util.animation.java_fx.display.JavaFX_FullScreenStarter;
import util.animation.java_fx.pipeline.AnimationDrawerJavaFX;
import util.animation.swing.display.Swing_FullScreenStarter;
import util.animation.swing.pipeline.AnimationDrawerSwing;

public class EvadeGameStarter {
	public static void main(String[] args) {
//		Swing_FullScreenStarter.start(new EvadeGameEngine(), new EvadeGamePipeline(new AnimationDrawerSwing()));
		JavaFX_FullScreenStarter.start(new EvadeGameEngine(), new EvadeGamePipeline(new AnimationDrawerJavaFX()));
	}
}
