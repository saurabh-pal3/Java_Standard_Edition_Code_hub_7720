
package com.project;

public class GetProject1 {
    public static void main(String[] args) {
        Project1 nilu = new Project1();

        do {
            nilu.Nilima();
            nilu.love();
            nilu.setmood();
            nilu.mood();
            nilu.compliment();
            nilu.kiss();
            nilu.getkiss();
            nilu.surprise();
        } while (nilu.askAgain());

        nilu.closeScanner();
    }
}
