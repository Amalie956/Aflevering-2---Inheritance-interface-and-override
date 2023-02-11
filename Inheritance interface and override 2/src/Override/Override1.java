package Override;

public class Override1 {
    public static void OverrideExercise() {
        RapSong newRapSong = new RapSong();
        newRapSong.play(); //Playing a rap song

        OldSchoolRap newOldSchoolRap = new OldSchoolRap();
        newOldSchoolRap.play(); //Playing old school rap

        NewSchoolRap newSchoolRap = new NewSchoolRap();
        newSchoolRap.play();//Playing new school rap
    }
}
