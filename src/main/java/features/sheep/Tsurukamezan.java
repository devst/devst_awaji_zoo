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
        if ((i%2) != 0 || (i1%4) != 0){
            throw new IllegalArgumentException();
        }
        int tsuru = i/2;
        int kame = i1/4;
        return String.format("鶴%d羽、亀%d匹", tsuru,kame);
    }
    
}
