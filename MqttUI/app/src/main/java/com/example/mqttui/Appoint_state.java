package com.example.mqttui;

public class Appoint_state {
    //设置状态判断，状态为0表示没有机子占用，状态为1表示1号机占用，状态为2表示二号机占用
    private static int state;
    private static int num;
    public static int set_state_zero(){
        state=0;
        return state;//将state状态置为0
    }
    public static int set_state_one(){
        state=1;
        return state;//将state状态置为1
    }
    public static int set_state_two(){
        state=2;
        return state;//将state状态置为2
    }
    public static int getState(){
        num=state;
        return num;
    }

}
