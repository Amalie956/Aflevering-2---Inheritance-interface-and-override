package Override;

public class Override1 {
    public static void OverrideExercise() {
        RapSong rapSong = new RapSong();
        rapSong.play(); //"Playing a rap song"

        OldSchoolRap oldSchoolRap = new OldSchoolRap();
        oldSchoolRap.play(); //"Playing old school rap"

        NewSchoolRap schoolRap = new NewSchoolRap();
        schoolRap.play();//"Playing new school rap"
    }
}
