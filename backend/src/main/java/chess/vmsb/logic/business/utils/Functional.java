package chess.vmsb.logic.business.utils;

import java.util.ArrayList;

public interface Functional {
    ArrayList<Integer> splitCoordinatesString(String str);
    int[] splitDataPair(ArrayList<Integer> data);
    char toCharCoordinate(int cr);
    ArrayList<Integer> reverseCoordinate(ArrayList<Integer> coord);
    Object deepCopy(Object odlObj);
}
