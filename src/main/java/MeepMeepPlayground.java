import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeBlueDark;

public class MeepMeepPlayground {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(600);
        meepMeep.setBackground(MeepMeep.Background.FIELD_FREIGHT_FRENZY);
        meepMeep.setBackgroundAlpha(1.0f);
        meepMeep.setTheme(new ColorSchemeBlueDark());

        meepMeep.setConstraints(
                60, // max velocity
                60, // max acceleration
                Math.toRadians(180), // max angular velocity
                Math.toRadians(180), // max angular acceleration
                15 // track width
        );

        meepMeep.followTrajectorySequence(drive ->
                drive.trajectorySequenceBuilder(new Pose2d(0, 0, 0))
                        // Build your trajectory here...
                        .forward(5)
                        .build()
        );

        meepMeep.start();
    }
}
