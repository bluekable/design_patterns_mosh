package com.bluekable.memento;

public class MementoSub {
    public void run(){
        var editor = new Originator();
        var history = new Caretaker();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
