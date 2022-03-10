package fr.istic.vv;

import org.junit.jupiter.api.Test;

import static fr.istic.vv.StringUtils.isBalanced;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

@Test 
public void testEmpty(){
    assertTrue(isBalanced(""));
}
@Test 
public void testOneOpenParenthesis(){
    assertFalse(isBalanced("("));
}
@Test 
public void testOneClosedPrenthesis(){
    assertFalse(isBalanced(")"));
}
@Test 
public void testOneOpenCurlyBracket(){
    assertFalse(isBalanced("{"));
}
@Test 
public void testOneClosedCurlyBracket(){
    assertFalse(isBalanced("}"));
}
@Test 
public void testOneOpenBracket(){
    assertFalse(isBalanced("["));
}
@Test 
public void testOneClosedBracket(){
    assertFalse(isBalanced("]"));
}
@Test
public void testParenthesis(){
    assertTrue(isBalanced("()"));
}
@Test
public void testBracket(){
    assertTrue(isBalanced("[]"));
}
@Test
public void testCurlyBracket(){
    assertTrue(isBalanced("{}"));
}
@Test
public void testMultipleParenthesis(){
    assertTrue(isBalanced("()()(())((()))"));
}
@Test
public void testMultipleBracket(){
    assertTrue(isBalanced("[[[]][]][][[]]"));
}
@Test
public void testMultipleCurlyBracket(){
    assertTrue(isBalanced("{{{}}}{}{{}}{}"));
}
@Test
public void testMultipleParenthesisOneNotClosed(){
    assertFalse(isBalanced("()()(()()((()))"));
}
@Test
public void testMultipleParenthesisOneNotOpened(){
    assertFalse(isBalanced("()()())((()))"));
}
@Test
public void testMultipleBracketOneNotClosed(){
    assertFalse(isBalanced("[[[]][][[]]"));
}
@Test
public void testMultipleBracketOneNotOpened(){
    assertFalse(isBalanced("[[]][[]][][[]]]"));
}
@Test
public void testMultipleCurlyBracketOneNotClosed(){
    assertFalse(isBalanced("{{{{}}}{}"));
}
@Test
public void testMultiplePCurlyBracketOneNotOpened(){
    assertFalse(isBalanced("{{}{}}{{}}}"));
}

@Test
public void testIncorrect(){
    assertFalse(isBalanced("([)]"));
}

}