/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package features.sheep;

/**
 *
 * @author tomo
 */

public class Myers implements features.Myers {

    @Override
    public String getName(int i, int i1, int i2) {
        if (i < 1 || i1 < 1 || i2 < 1){
            throw new IllegalArgumentException();
        } else if ((i >= i1+i2) || (i1 >= i+i2) || (i2 >= i+i1)){
            throw new IllegalArgumentException();
        } else if ((i == i1) && (i1 == i2)){
            return "正三角形";
        }else if ((i == i1) || (i1 == i2) || (i == i2)){
            return "二等辺三角形";
        } else {
            return "不等辺三角形";
        }
        
    }
    
}
