import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GenerateDocumentTest {

    @Test
    public void TestCase1() {
        String characters = "Bste!hetsi ogEAxpelrt x ";
        String document = "AlgoExpert is the Best!";
        boolean expected = true;
        var actual = new GenerateDocument().generateDocument(characters, document);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase1Improved() {
        String characters = "Bste!hetsi ogEAxpelrt x ";
        String document = "AlgoExpert is the Best!";
        boolean expected = true;
        var actual = new GenerateDocument().generateDocumentImproved(characters, document);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase2() {
        String characters = "A";
        String document = "a";
        boolean expected = false;
        var actual = new GenerateDocument().generateDocument(characters, document);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase2Improved() {
        String characters = "A";
        String document = "a";
        boolean expected = false;
        var actual = new GenerateDocument().generateDocumentImproved(characters, document);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase3() {
        String characters = "a hsgalhsa sanbjksbdkjba kjx";
        String document = " ";
        boolean expected = true;
        var actual = new GenerateDocument().generateDocument(characters, document);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase3Improved() {
        String characters = "a hsgalhsa sanbjksbdkjba kjx";
        String document = " ";
        boolean expected = true;
        var actual = new GenerateDocument().generateDocumentImproved(characters, document);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase4() {
        String characters = "aheaollabbhb";
        String document = "hello";
        boolean expected = true;
        var actual = new GenerateDocument().generateDocument(characters, document);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase4Improved() {
        String characters = "aheaollabbhb";
        String document = "hello";
        boolean expected = true;
        var actual = new GenerateDocument().generateDocumentImproved(characters, document);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase5() {
        String characters = "Bste!hetsi ogEAxpert";
        String document = "AlgoExpert is the Best!";
        boolean expected = false;
        var actual = new GenerateDocument().generateDocument(characters, document);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase5Improved() {
        String characters = "Bste!hetsi ogEAxpert";
        String document = "AlgoExpert is the Best!";
        boolean expected = false;
        var actual = new GenerateDocument().generateDocumentImproved(characters, document);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase6() {
        String characters = "&*&you^a%^&8766 _=-09     docanCMakemthisdocument";
        String document = "Can you make this document &";
        boolean expected = true;
        var actual = new GenerateDocument().generateDocument(characters, document);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase6Improved() {
        String characters = "&*&you^a%^&8766 _=-09     docanCMakemthisdocument";
        String document = "Can you make this document &";
        boolean expected = true;
        var actual = new GenerateDocument().generateDocumentImproved(characters, document);
        assertTrue(expected == actual);
    }
}
