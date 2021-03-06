package com.eburrows.towers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.eburrows.towers.Disk;
import com.eburrows.towers.Rod;
import com.eburrows.towers.RodSet;


public class TestStacks
{
  int numDisks = 6;
  RodSet rods;
  
  @Before
  public void setup()
  {
    rods = new RodSet(numDisks);
  }

  /**
   * Sanity check on the number of disks per rod
   */
  @Test
  public void numOfDisks()
  {
    assertTrue(rods.getDisksPerRod()== numDisks);
  }
  
  /**
   * Set too many disks per rod
   */
  @Test
  public void tooManyDisks()
  {
    RodSet rod = new RodSet(Constants.MAX_DISKS_PER_ROD + 2);
    assertTrue(rod.getDisksPerRod()== Constants.MIN_DISKS_PER_ROD);
  }
  
  /**
   * Set too few disks per rod
   */
  @Test
  public void tooFewDisks()
  {
    RodSet rod = new RodSet(-2);
    assertTrue(rod.getDisksPerRod()== Constants.MIN_DISKS_PER_ROD);
  }

  /**
   * Check that the first rod is initialised with a full stack of disks:
   * Disk 1 on the first stack should be a disk
   */
  @Test
  public void firstRodfirstDiskType()
  {
    Rod rod1 = rods.getRod(1);
    assertTrue(rod1.getDisk(1) instanceof Disk);
  }
  
  /**
   * Check that the first rod has the correct values:
   * Disk 1 should have a size = total number of disks
   */
  @Test
  public void firstRodfirstDiskSize()
  {
    assertTrue(rods.getRod(1).getDisk(1).getDiskSize() == numDisks);
  }
  
  /**
   * Check that the first rod has the correct values:
   * Disk 1 should have a size = total number of disks
   */
  @Test
  public void firstRodlastDiskSize()
  {
    assertTrue(rods.getRod(1).getDisk(numDisks).getDiskSize() == 1);
  }
  
  /**
   * Check that the second rod is empty
   */
  @Test
  public void secondRod()
  {
    assertTrue(rods.getRod(2).getDisk(1).getDiskSize() == 0);
  }
  
  /**
   * Check that the third rod is empty
   */
  @Test
  public void thirdRod()
  {
    assertTrue(rods.getRod(3).getDisk(1).getDiskSize() == 0);
  }
  
  /**
   * Check that you can get the last disk from a rod 
   */
  @Test
  public void topDiskFromRod1()
  {
    assertTrue(rods.getRod(1).getTopDisk() instanceof Disk);
  }
  
  /**
   * Check that the last disk from rod 1 is size 1
   */
  @Test
  public void topDiskSizeFromRod1()
  {
    System.out.println(rods.getRod(1).getTopDisk().getDiskSize());
  }
}
