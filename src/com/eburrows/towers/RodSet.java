package com.eburrows.towers;

import java.util.ArrayList;

public class RodSet
{
  private int disksPerRod = Constants.MAX_DISKS_PER_ROD;
  ArrayList<Rod> rods = new ArrayList<Rod>();
  
  public Move move = new Move(this);

  public RodSet(int disksPerRod)
  {
    this.setDisksPerRod(disksPerRod);
    
    initRods();

  }

  private void initRods()
  {
    for (int i = 0; i < Constants.RODS; i++)
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
    if (disksPerRod <= Constants.MAX_DISKS_PER_ROD && disksPerRod >= Constants.MIN_DISKS_PER_ROD)
    {
      this.disksPerRod = disksPerRod;
    }
    else
    {
      this.disksPerRod = Constants.MIN_DISKS_PER_ROD;
    }
  }



  public Rod getRod(int i)
  {
    if (i <= 0)
    {
      return rods.get(0);
    }
    else
    {
      return rods.get(i - 1);
    }
  }

}
