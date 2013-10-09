package com.eburrows.towers;

import java.util.ArrayList;

public class RodSet
{
  private final int RODS = 3;
  private final int MIN_DISKS_PER_ROD = 3;
  private final int MAX_DISKS_PER_ROD = 15;
  private int disksPerRod = MAX_DISKS_PER_ROD;
  ArrayList<Rod> rods = new ArrayList<Rod>();

  public RodSet(int disksPerRod)
  {
    if (disksPerRod <= MAX_DISKS_PER_ROD && disksPerRod >= MIN_DISKS_PER_ROD)
    {
      this.setDisksPerRod(disksPerRod);
    }
    else
    {
      this.setDisksPerRod(MIN_DISKS_PER_ROD);
    }
    
    initRods();

  }

  private void initRods()
  {
    for (int i = 0; i <= RODS; i++)
    {
      if (i == 0)
      {
        rods.add(i, new Rod(this.disksPerRod, true));
      }
      else
      {
        rods.add(i, new Rod(this.disksPerRod));
      }
    }
  }
  
  public int getDisksPerRod()
  {
    return disksPerRod;
  }

  public void setDisksPerRod(int disksPerRod)
  {
    this.disksPerRod = disksPerRod;
  }



  public Rod getRod(int i)
  {
    return rods.get(i - 1);
  }

}
