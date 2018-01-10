package practice;

import java.util.LinkedList;

public class TrainComposition {
	
	LinkedList<Integer> train = new LinkedList<Integer>();
	
    public void attachWagonFromLeft(int wagonId) 
    {
    	train.addFirst(wagonId);
    }

    public void attachWagonFromRight(int wagonId) 
    {
        train.addLast(wagonId);
    }

    public int detachWagonFromLeft() 
    {
       return train.removeFirst();
    }

    public int detachWagonFromRight() {
        return train.removeLast();
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
        tree.attachWagonFromLeft(7);
        tree.attachWagonFromLeft(13);
        System.out.println(tree.detachWagonFromRight()); // 7 
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}
