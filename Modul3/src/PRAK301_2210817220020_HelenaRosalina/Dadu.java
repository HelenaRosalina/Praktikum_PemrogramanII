package PRAK301_2210817220020_HelenaRosalina;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

class Dadu {
    private int nilai;

    public Dadu() {
        Nilaiacak();
    }

    public void Nilaiacak() {
        Random random = new Random();
        nilai = random.nextInt(6) + 1;
    }

    public int getNilai() {
        return nilai;
    }
}

