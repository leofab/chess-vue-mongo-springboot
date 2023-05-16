package chess.vmsb.logic.business.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Functional {
  public static ArrayList<Integer> splitCoordinatesString(String str){
    ArrayList<Integer> coord= new ArrayList<>();
    //to set 0,0 as upper left corner
    coord.add(8-((int)str.charAt(1)-(int)'0'));//rows first
    coord.add(((int)str.charAt(0))-((int)'a'));//cols second
    return coord;
  }

  public static int[] splitDataPair(ArrayList<Integer> data){
    int coord[]={data.get(0),data.get(1)};
    return coord;
  }

  public static ArrayList<Integer> reverseCoordinate(ArrayList<Integer> coord){
    ArrayList<Integer> reversed = new ArrayList<>();
    reversed.add(coord.get(0) + (int) 'a');
    reversed.add(coord.get(1) + (int) '0');
    return reversed;
  }

  public static char toCharCoordinate(int cr){
    return (char)(cr+((int)'a'));
  }

  public static Object deepCopy(Object oldObj){
    ObjectOutputStream oos = null;
    ObjectInputStream ois = null;
    try{
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      oos = new ObjectOutputStream(bos);
      // serializable and pass the object
      oos.writeObject(oldObj);
      oos.flush();
      ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
      ois = new ObjectInputStream(bin);
      // return the new Object
      return ois.readObject();
    }catch(Exception e){
      System.out.println("Error in deepCopy");
      return null;
    }finally{
      try{
      oos.close();
      ois.close();

      } catch (IOException ex){
        System.out.println("Error in deepCopy");
        Logger.getLogger(Functional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
    }
  }

}


