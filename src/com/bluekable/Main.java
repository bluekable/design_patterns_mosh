package com.bluekable;

import com.bluekable.memento.MementoSub;
import com.bluekable.state.StateSub;

public class Main {

    public static void main(String[] args) {
        //Memento pattern
        var mementoPattern = new MementoSub();
        mementoPattern.run();

        //State pattern
        var statePattern = new StateSub();
        statePattern.run();
    }
}
