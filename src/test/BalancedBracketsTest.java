package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    //1.Validating a string without having any brackets

    @Test
    public void notContainAnyBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("WithoutBrackets"));
    }

    //2.Validating with one occurance of Balanced Brackets
    @Test
    public void withOneSetBalancedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void  withInvalidOneBalencedBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void withMultipleBalancedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode], Launch[Code], []LaunchCode"));
    }
    @Test
    public void withMultipleInvalidBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Launch Code,JavaCourse],["));
    }
    @Test
    public void withContainOneBracket(){
      assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }




    //@Test
    /*public void emptyTest() {
        assertEquals(true, true);
    }*/


}
