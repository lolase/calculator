/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author USER
 */
import java.lang.Math;
public class equalsTo {
    public String getValues(float value1, float value2, char operand){
        float ans = 0;
        boolean valid = true;
        String anse = "";
        switch (operand){
            case '+' :
                ans = addition(value1, value2);
                break;
            case '-' :
                ans = subtract(value1, value2);
                break;
            case '*' :
                ans = multiply(value1, value2);
                break;
            case '/' :
                ans = divide(value1, value2);
                break;
            case '^' :
                ans = power(value1, value2);
                break;
            default:
                valid = false;
                anse = "invalid operand";
        }
        if (valid ==true){
           anse =  Float.toString(ans);
        }
        return anse;
    }
    private float addition(float value1, float value2){
        float answer;
        answer = value1 + value2;
        return answer;   
    }
    private float subtract(float value1, float value2){
        float answer;
        answer = value1 - value2;
        return answer;   
    }
    private float multiply(float value1, float value2){
        float answer;
        answer = value1 * value2;
        return answer;   
    }
    private float divide(float value1, float value2){
        float answer;
        answer = value1 / value2;
        return answer;   
    }
    private float power(float value1, float value2){
        float answer;
        answer = (float) Math.pow(value1, value2);
        return answer;   
    }
}
