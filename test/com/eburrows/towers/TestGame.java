package com.eburrows.towers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestGame
{
  
  private RodSet rods;

  @Before
  public void setUp() throws Exception
  {
    rods = new RodSet(6);
  }

  @Test
  public void testMove()
  {
    assertEquals("Success!", rods.move.from(1).to(2));
  }
  
  @Test
  public void testFromRodIsEmpty()
  {
    assertEquals("No disk on rod 3!", rods.move.from(3).to(2) );
  }
  
  @Test
  public void testFromBiggerThanTo()
  {
    // Move disk "1" from rod 1 to rod 2,
    // then try to put disk "2" on top of it
    rods.move.from(1).to(2);
    assertEquals("Invalid move!", rods.move.from(1).to(2) );
  }

}
