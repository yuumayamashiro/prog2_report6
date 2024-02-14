package blackjack.java.jp.ac.uryukyu.ie.e225714;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class  Card{
    List<Integer> torannpu = new ArrayList<>(52);
    void shuffleCard(List<Integer>torannpu){
        for(int i = 1; i <= 52; i++){
            torannpu.add(i);
            Collections.shuffle(torannpu);
        }
        //for (int i = 0; i<torannpu.size(); i++){
            //System.out.println(torannpu.get(i));
        //}
    }
}
    
    
    