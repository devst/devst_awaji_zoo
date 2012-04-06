/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package features.sheep;

/**
 *
 * @author tomo
 */
public class Tsurukamezan implements features.Tsurukamezan{

    public String tsurukame(int i, int i1) {
        if (i<0 || i1<0){
            throw new IllegalArgumentException();
        }
        int kame = (i1 - (2*i)) /2;
        int tsuru = i - kame;
        if (i1 != (tsuru*2 + kame*4)){
            throw new IllegalArgumentException();
        }
        String tsuruStr = String.format("鶴%d羽", tsuru);
        String kameStr = String.format("亀%d匹", kame);                
        return tsuruStr + "、" + kameStr;
    }
    
}
