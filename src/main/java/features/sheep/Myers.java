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
        if ((i == i1) && (i1 == i2)){
            return "正三角形";
        }else if ((i == i1) || (i1 == i2) || (i == i2)){
            return "二等辺三角形";
        } else if (i <= 0 || i1 <= 0 || i2 <= 0){
            throw new IllegalArgumentException();
        } else {
            return "不等辺三角形";
        }
        
    }
    
}
