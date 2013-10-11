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
    assertEquals(rods.move.from(1).to(2), "Success!");
  }

}
