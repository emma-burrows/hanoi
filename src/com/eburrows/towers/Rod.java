package com.eburrows.towers;

import java.util.Stack;

public class Rod
{
  private Stack<Disk> disks  = new Stack<Disk>();

  public Rod(int numDisks)
  {
    super();
    this.disks.setSize(numDisks);
  }
  
  public Rod(int numDisks, boolean isFirst)
  {
    this(numDisks);
    if (isFirst)
    {
      makeFirstRod();
    }
  }
  
  /**
   * The first rod in the set must be initialised with a set of Disks sized from 
   * the number of disks down to 1.
   */
  private void makeFirstRod()
  {
    int total = disks.size();
    for (int i=1, diskSize = total; i <= total; i++, diskSize--)
    {
      disks.add(i-1, new Disk(diskSize));
    }
  }

  public Disk getDisk(int i)
  {
    return disks.get(i - 1);
  }
}
