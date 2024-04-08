import Models.ClassicMusic;
import Models.MusicStyles;
import Models.PopMusic;
import Models.RockMusic;

public class Program {
    public static void main(String[] args) {
        MusicStyles[] groups = {new PopMusic(), new RockMusic(),
                new ClassicMusic()};
        for (MusicStyles group : groups) {
            group.playMusic();


        }
    }
}