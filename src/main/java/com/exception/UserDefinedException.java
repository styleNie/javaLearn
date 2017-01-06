package com.exception;

/**
 * Created by Administrator on 2016/10/17.
 * 自定义异常
 */

class WrongInputException extends Exception {
    WrongInputException(String s) {
        super(s);
    }
}
class Input {
    void method() throws WrongInputException {
        throw new WrongInputException("Wrong input");
    }
}
public class UserDefinedException {
    public static void main(String[] args){
        try {
            new Input().method();
        }
        catch(WrongInputException wie) {
            System.out.println(wie.getMessage());
        }
    }
}
