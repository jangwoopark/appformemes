package com.example.android.jokelibrary;
/* Jokes from https://www.rd.com/jokes/ */

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JokeLibrary {

    public String getJoke() {
        Random rand = new Random();
        List<String> jokes = Arrays.asList(
                "cute__1_","cute__2_","cute__3_","cute__4_","cute__5_","cute__6_","cute__7_","cute__8_",
                "cute__9_","cute__10_","cute__11_","cute__12_","cute__13_","cute__14_","cute__15_","cute__16_",
                "cute__17_","cute__18_","cute__19_","cute__20_","cute__21_","cute__22_","cute__23_","cute__24_",
                "cute__25_","cute__26_","cute__27_","cute__28_","cute__29_","cute__30_","cute__31_","cute__32_",
                "funny__1_","funny__2_","funny__3_","funny__4_","funny__5_","funny__6_","funny__7_","funny__8_",
                "funny__9_","funny__10_","funny__11_","funny__12_","funny__13_","funny__14_","funny__15_","funny__16_",
                "funny__17_","funny__18_","funny__19_","funny__20_","funny__21_","funny__22_","funny__23_","funny__24_",
                "funny__25_","funny__26_","funny__27_","funny__28_","funny__29_",
                "unique__1_","unique__2_","unique__3_","unique__4_","unique__5_",
                "unique__6_","unique__7_","unique__8_","unique__9_","unique__10_"
                );
                //"What is the biggest lie in the entire universe? I have read and agree to the Terms & Conditions.");
                //"What did the hot dog say when his friend passed him in the race? Wow, I relish the fact that you've mustard the strength to ketchup to me.",
                //"What do you mean I'm not a bear? I have all of the koalafications!",
                //"What would bears be without Bees? Ears",
                //"What did the Buffalo say to his son when he went off to college? Bison",
                //"What did the cat say when his friend asked if he was lying? I'm not kitten you.");

        int randomIndex;
        String randomElement = "";
        for (int i = 0; i < jokes.size(); i++) {
            randomIndex = rand.nextInt(jokes.size());
            randomElement = jokes.get(randomIndex);
        }
        return randomElement;
    }

}
