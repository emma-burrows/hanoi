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
  
  public String to(int num)
  {
    return moveDisks();
  }
  
  private String moveDisks()
  {
    return "Success!";
  }
}
