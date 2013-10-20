package com.eburrows.towers;

public class Move
{
  private final RodSet rods;
  private int fromRod;
  private int toRod;
  
  Move(RodSet rods)
  {
    this.rods = rods;
  }
  
  public Move from(int rodNumber)
  {
    if (rodNumber <= Constants.RODS && rodNumber > 0)
    {
      fromRod = rodNumber;
    }
    return this;
  }
  
  public String to(int rodNumber)
  {
    if (rodNumber <= Constants.RODS && rodNumber > 0)
    {
      toRod = rodNumber;
    }
    return moveDisks();
  }
  
  private String moveDisks()
  {
    int fromDisk = rods.getRod(fromRod).getTopDisk().getDiskSize();
    int toDisk = rods.getRod(toRod).getTopDisk().getDiskSize();
    
    if (fromDisk == 0)
    {
      return "No disk on rod " + fromRod + "!";
    }
    else if (toDisk != 0 && fromDisk > toDisk)
    {
      return "Invalid move!";
    }
    else
    {
      Disk movedDisk = rods.getRod(fromRod).removeTopDisk();
      rods.getRod(toRod).addDiskToTop(movedDisk);
      return "Success!";
    }
  }
}
