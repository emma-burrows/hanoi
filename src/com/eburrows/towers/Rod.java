package com.eburrows.towers;

import java.util.Stack;

public class Rod
{
  private Stack<Disk> disks  = new Stack<Disk>();
  private int numDisks;
  

  public Rod(int numDisks)
  {
    this.numDisks = numDisks;
    this.disks.ensureCapacity(numDisks);
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
    int total = numDisks;
    for (int i=1, diskSize = total; i <= total; i++, diskSize--)
    {
      disks.add(i-1, new Disk(diskSize));
    }
  }

  /**
   * Get the disk at a given index position. Note: the index is 1-based
   * to allow the rods and disks to be numbered in a more natural fashion.
   * @param i the position of the disk in the stack, the bottom disk being number 1
   * @return the disk at position i
   */
  public Disk getDisk(int i)
  {
    if (disks.empty())
    {
      return new Disk(0);
    }
    else
    {
      return disks.get(i - 1);
    }
  }

  /**
   * Get the disk at the top of the rod - ie: the one you can move - without actually moving it.
   * @return the disk at the top of the rod
   */
  public Disk getTopDisk()
  {
    if (disks.empty())
    {
      return new Disk(0);
    }
    else
    {
      return disks.lastElement();
    }
  }
  
  /**
   * Remove and return the disk at the top of the rod.
   * @return the disk at the top of the rod, or null if there is no disk
   */
  public Disk removeTopDisk()
  {
    if (disks.empty())
    {
      return null;
    }
    else
    {
      return disks.pop();
    }
  }
  
  /**
   * Add the selected disk to the top of the rod.
   * @return the new disk placed on the top of the rod, or null if the disk was too large for the rod
   */
  public Disk addDiskToTop(Disk disk)
  {
    if (disks.empty() || disk.getDiskSize() < disks.lastElement().getDiskSize())
    {
      return disks.push(disk);
    }
    else
    {
      return null;
    }
  }
  
  public Disk[] listDisks()
  {
    if (disks.empty())
    {
      return new Disk[0];
    }
    else
    {
      Disk[] diskArray = new Disk[disks.size()];
      for (int i=0; i < disks.size(); i++)
      {
        diskArray[i] = disks.get(i);
      }
      return diskArray;
    }
  }
}
