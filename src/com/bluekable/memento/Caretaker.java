package com.bluekable.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> states = new ArrayList<>();

    public void push(Memento state) {
        this.states.add(state);
    }

    public Memento pop() {
        var lastIndex = this.states.size() - 1;
        var lastState = this.states.get(lastIndex);
        this.states.remove(lastIndex);

        return lastState;
    }
}
