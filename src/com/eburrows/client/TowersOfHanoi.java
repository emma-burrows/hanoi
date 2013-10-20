package com.eburrows.client;

import com.eburrows.towers.Disk;
import com.eburrows.towers.RodSet;

/**
 * <h2>Rules from Wikipedia</h2>
 * 
 * The objective of the puzzle is to move the entire stack to another rod,
 * obeying the following rules: <ul><li>Only one disk must be moved at a time.</li> <li>Each move
 * consists of taking the upper disk from one of the rods and sliding it onto
 * another rod, on top of the other disks that may already be present on that
 * rod.</li><li>No disk may be placed on top of a smaller disk.</li></ul>
 */
public class TowersOfHanoi
{
  static RodSet rods = new RodSet(3);
  
  /**
   * Phase 1: simulate a game
   * @param args
   */
  public static void main(String[] args)
  {
    printAllRods();
    
    System.out.println("First move");
    rods.move.from(1).to(2);
    printAllRods();

    System.out.println("Second move");
    rods.move.from(1).to(3);
    printAllRods();
    
    System.out.println("Third move");
    rods.move.from(2).to(3);
    printAllRods();
    
    System.out.println("Fourth move");
    rods.move.from(1).to(2);
    printAllRods();
    
    System.out.println("Fifth move");
    rods.move.from(3).to(1);
    printAllRods();

    System.out.println("Sixth move");
    rods.move.from(3).to(2);
    printAllRods();
    
    System.out.println("Sixth move");
    rods.move.from(1).to(2);
    printAllRods();
  }
  
  private static void printAllRods()
  {
    printRod(1);
    printRod(2);
    printRod(3);
  }
  
  private static void printRod(int num)
  {
    StringBuilder sb = new StringBuilder("Rod" + num + ": ");
    for (Disk d : rods.getRod(num).listDisks())
    {
      sb.append(d.getDiskSize() + " ");
    }
    System.out.println(sb);
  }

}
