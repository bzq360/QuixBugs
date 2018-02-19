package java_testcases.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import java_programs.NEXT_PERMUTATION;
import com.google.gson.JsonParser;

public class NEXT_PERMUTATION_TEST {
  /**
   * Junit test case for NEXT_PERMUTATION generated by tests generator.
   */
  @Test(timeout = 100)
  public void next_permutation_test1() {
    try {
      Object actual = NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3,2,4,1)));
      assertEquals("[3,4,1,2]",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void next_permutation_test2() {
    try {
      Object actual = NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3,5,6,2,1)));
      assertEquals("[3,6,1,2,5]",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void next_permutation_test3() {
    try {
      Object actual = NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3,5,6,2)));
      assertEquals("[3,6,2,5]",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void next_permutation_test4() {
    try {
      Object actual = NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4,5,1,7,9)));
      assertEquals("[4,5,1,9,7]",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void next_permutation_test5() {
    try {
      Object actual = NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4,5,8,7,1)));
      assertEquals("[4,7,1,5,8]",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void next_permutation_test6() {
    try {
      Object actual = NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(9,5,2,6,1)));
      assertEquals("[9,5,6,1,2]",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void next_permutation_test7() {
    try {
      Object actual = NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(44,5,1,7,9)));
      assertEquals("[44,5,1,9,7]",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

  @Test(timeout = 100)
  public void next_permutation_test8() {
    try {
      Object actual = NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3,4,5)));
      assertEquals("[3,5,4]",actual.toString() );
    }
    catch(IllegalArgumentException e) {
      throw new IllegalArgumentException("Arguments are illegal!") ;
    }
  }

}