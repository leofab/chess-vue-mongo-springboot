package vmsb.chess.logic.business.utils;

import java.util.ArrayList;

public interface Functional {
    public ArrayList<Integer> splitCoordinatesString(String str);
    public int[] splitDataPair(ArrayList<Integer> data);
    public char toCharCoordinate(int cr);
    public ArrayList<Integer> reverseCoordinate(ArrayList<Integer> coord);
    public Object deepCopy(Object odlObj);
}
