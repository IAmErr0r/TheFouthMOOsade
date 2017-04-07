package com.example.jared.thefouthmoosade.model;

import com.example.jared.thefouthmoosade.R;

/**
 * Created by Jared on 4/7/2017.
 */

public class Story {
    private Page[] mPages;

    public Story(){
        mPages = new Page[21];

        mPages[0] = new Page(
                R.drawable.page0,
                "The radical MOOslims that pray to the prophet MOOhammed have taken control of the city of Cowstantinople and JerMOOsalem, you must fight to reclaim it. \n" +
                        "You are the leader of the MOOOsaders. \n" +
                        "You need weaponry to take to Cowstantinople will you take Cowtapults with you?",
                new Choice("Yes", 1),
                new Choice("No ", 2));

        mPages[1] = new Page(
                R.drawable.page0,
                "Great! You now have war machines capable of launching stone projectiles over 300 meters! \n" +
                        "You and your army begin the journey to the Promised Land after Pope Cowment VII approves your journey, sending you off with a spirited “Uaccam Vult” (Cow wills it)! \n" +
                        "Before long, you realize that splitting your forces in two to capture both citites would greatly lessen your chances of success. Sadly, you must choose which city to liberate - Cowstantinople or JerMOOsalem. Which city will you travel to?",
                new Choice("JerMOOsalem", 3),
                new Choice("Cowstantinople", 12));

        mPages[2] = new Page(
                R.drawable.page0,
                "You decide that Cowtapults will be unnecessary, and travel to JerMOOsalem, planning on attacking Cowstantinople on the way back. You reach JerMOOsalem without a hitch, and promptly put it under siege. \n" +
                        "Unfortunately, the MOOslims begin firing COWtapults at you, and since you have no COWtapults to fire back with in defense, you quickly perish. \n" +
                        "The Fourth MOOsade goes down in history as a failure.\n");

        mPages[3] = new Page(
                R.drawable.page0,
                "Your group reached the seaport in which you will sail to the holy land. There is just one problem - You don’t have nearly enough boats for everyone.",
                new Choice("Buy more boats.", 4),
                new Choice("Make everyone who can’t fit swim.", 5));

        mPages[4] = new Page(
                R.drawable.page0,
                "You spend a massive amount of money on boats, nearly depleting your war chest. \n" +
                        "Once on dry land, you quickly reach the Holy Land. Now, you just have to march to JerMOOsalem and liberate it.",
                new Choice("March onwards to JerMOOsalem.", 6),
                new Choice("Sit there and wait for no real reason.", 10));

        mPages[5] = new Page(
                R.drawable.page0,
                "Unfortunately, fully-armored bovine soldiers are not good at swimming, and so everyone who couldn’t fit on a boat drowns. Hopefully you can make do with the remaining soldiers.\n" +
                        "Once on dry land, you quickly reach the Holy Land. Now, you just have to march to JerMOOsalem and liberate it.",
                new Choice("March onwards to JerMOOsalem.", 6),
                new Choice("Sit there and wait for no real reason.", 10));

        mPages[6] = new Page(
                R.drawable.page0,
                "You reach the outside of the city and you surround the outside of the city and prepare for a siege. MOOslims rush out of the city, apparently preferring fighting over being put under siege.",
                new Choice("Charge into battle.", 7),
                new Choice("Flee from battle.", 11));

        mPages[7] = new Page(
                R.drawable.page0,
                "You charge into battle, weapons drawn. \n" +
                        "Before long, it is clear that you are fighting a losing battle.",
                new Choice("Pray to Cow for strength.", 8),
                new Choice("Call in the calvary.", 9));

        mPages[8] = new Page(
                R.drawable.page0,
                "It seems that Cow is please with your prayer, as before long, the battle turns in your favor. Eventually, the enemy is broken, and the scattered remains of the MOOslim army flees. You send some men to capture them, and march into JerMOOsalem. \n"+
                        "You have succeeded in your holy mission, and go down in history as a great and wise ruler, known by all for being the victor in the Fourth MOOsade.");

        mPages[9] = new Page(
                R.drawable.page0,
                "The calvary storms in with a battle cry of “Uaccam Vult!” Quickly disrupting the MOOslim forces, the calvary turns the tide of the battle. Eventually, the enemy is broken, and the scattered remains of the MOOslim army flees. You send some men to capture them, and march into JerMOOsalem. \n"+
                        "You have succeeded in your holy mission, and go down in history as a great and wise ruler, known by all for being the victor in the Fourth MOOsade.");

        mPages[10] = new Page(
                R.drawable.page0,
                "You sit there. Forever. \n"+
                        "Good Job.");

        mPages[11] = new Page(
                R.drawable.page0,
                "Your troops scatter and are quickly routed, resulting in a decise MOOslim victory. \n"+
                        "The Fourth MOOsade goes down in history as a failure, and you are known by all as the one who caused it to fail.");

        mPages[12] = new Page(
                R.drawable.page0,
                "You reach a rather strange sight. There is a sea of chickens covering the road.",
                new Choice("Take the chickens.", 13),
                new Choice ("Ignore the chickens.", 14));

        mPages[13] = new Page(
                R.drawable.page0,
                "Your men attempt to capture some of the chickens, but somehow fail to catch a single one. This failure fills you with worry. After all, if your men can’t defeat an army of chickens, how will they defeat an army of MOOslims? /n"+
                    "While you were contemplating this, it has become night-time. Your men wish to set up camp.",
                new Choice("Order them to keep marching ", 15),
                new Choice("Stop for the day.", 19));

        mPages[14] = new Page(
                R.drawable.page0,
                "You decide to not waste your time with the chickens. /n"+
                    "Before long, it is sunset. Your men wish to set up camp.",
                new Choice("Order them to keep marching.", 15),
                new Choice("Stop for the day.", 19));

        mPages[15] = new Page(
                R.drawable.page0,
                "After weeks of grueling marching, you finally arrive in Cowstantinople.",
                new Choice("Put the city under siege.", 16),
                new Choice("Go home. ", 20));

        mPages[16] = new Page(
                R.drawable.page0,
                "You siege the city for months before you finally decide to attack. There is only one thing left to decide - how will you enter the city?",
                new Choice("Knock down the main gate", 17),
                new Choice("Use siege towers to scale the walls.", 18));

        mPages[17] = new Page(
                R.drawable.page0,
                "Your men use a large battering-ram to break down the gate, and then charge in. /n" +
                    "The starved MOOslims stood no chance./n"+
                    "You have succeeded in your holy mission, and go down in history as a great and wise ruler, known by all for being the victor in the Fourth MOOsade.");

        mPages[18] = new Page(
                R.drawable.page0,
                "Your men use siege towers to scale the massive walls of the city without fear of archers. Your forces quickly take control of the wall, and open the gates. /n"+
                    "The starved MOOslims stood no chance. /n" +
                    "You have succeeded in your holy mission, and go down in history as a great and wise ruler, known by all for being the victor in the Fourth MOOsade.");

        mPages[19] = new Page(
                R.drawable.page0,
                "Due to your bad decisions, your men have abandoned you. /n"+
                    "You are forgotten to history, and the Fourth MOOsade is remembered as a failure");

        mPages[20] = new Page(
                R.drawable.page0,
                "You wordlessly turn around and go home, leaving your forces leaderless. Without someone to rally behind, your army is quickly destroyed. /n"+
                    "When you return home and tell everyone what happened, they decide you are crazy, and execute you. /n" +
                    "You are remembered as a senile fool, and the Fourth MOOsade goes down in history as a failure.");

    }

    public Page getPage(int pageNumber){
        return mPages[pageNumber];
    }
}
