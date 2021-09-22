package com.bluekable.state;

public class Canvas {
    private Tool currentTool;

    public Tool getCurrentTool() {
        return this.currentTool;
    }

    public void setCurrentTool(Tool tool) {
        this.currentTool = tool;
    }

    public void mouseDown(){
        this.currentTool.mouseDown();
    }

    public void mouseUp(){
        this.currentTool.mouseUp();
    }

    //The below is what we are trying to solve. As you add tools and actions this gets out of hand
//    public void mouseDown() {
//        if (this.currentTool == ToolType.SELECTION) {
//            System.out.println("Selection icon");
//        } else if(this.currentTool == ToolType.BRUSH) {
//            System.out.println("Brush icon");
//        } else if(this.currentTool == ToolType.ERASER){
//            System.out.println("Eraser icon");
//        }
//    }
//
//    public void mouseUp() {
//        if (this.currentTool == ToolType.SELECTION) {
//            System.out.println("Draw dashed rectangle");
//        } else if(this.currentTool == ToolType.BRUSH) {
//            System.out.println("Draw line");
//        } else if(this.currentTool == ToolType.ERASER){
//            System.out.println("Eraser something");
//        }
//    }
}
