import java.util.Arrays;

public class EncryptorTester {
    public static void main(String[] args) {

        // -------------------------------------
        // ---- TEST PART C: encryptMessage ----
        // -------------------------------------
        System.out.println("\n---- TESTING PART C ----");
        Encryptor encryptorTest = new Encryptor(2, 3);
        String actualEncrypted1 = encryptorTest.encryptMessage("Meet at midnight");
        String expectedEncrypted1 = "Mte eati dmnitgAhA";
        if (actualEncrypted1.equals(expectedEncrypted1)) {
          System.out.println("\nTest 1 PASSED!");
        } else {
          System.out.println("\n*** Test 1 FAILED! ***");
          System.out.println("EXPECTED: " + expectedEncrypted1);
          System.out.println("  ACTUAL: " + actualEncrypted1);
        }

        String actualEncrypted2 = encryptorTest.encryptMessage("Let's go outside. Are you OK with that?");
        String expectedEncrypted2 = "L'est goou tsei.d A ryeouK  Owi tthhaAtA?A";
        if (actualEncrypted2.equals(expectedEncrypted2)) {
          System.out.println("\nTest 2 PASSED!");
        } else {
          System.out.println("\n*** Test 2 FAILED! ***");
          System.out.println("EXPECTED: " + expectedEncrypted2);
          System.out.println("  ACTUAL: " + actualEncrypted2);
        }

        Encryptor encryptorTester = new Encryptor(4, 3);
        String actualEncrypted3 = encryptorTester.encryptMessage("I saw this REALLY great show on Netflix about a family that moves to a small town");
        String expectedEncrypted3 = "Iats wh s iRELgaAYrtL e swneh  tooNfl o iauaxbt fi aalttmyh metaoso v  smloAa wAltnA";
        if (actualEncrypted3.equals(expectedEncrypted3)) {
          System.out.println("\nTest 3 PASSED!");
        } else {
          System.out.println("\n*** Test 3 FAILED! ***");
          System.out.println("EXPECTED: " + expectedEncrypted3);
          System.out.println("  ACTUAL: " + actualEncrypted3);
        }

        Encryptor encryptorTesterB = new Encryptor(5, 6);
        String actualEncrypted4 = encryptorTesterB.encryptMessage("Eeny, meeny, miny, moe, catch a tiger by the toe. If he hollers, let him go, eeny, meeny, miny, moe.");
        String expectedEncrypted4 = "Em  ceemmaneiotynnec,yy,h ,,  arh.e  e  tb Ihiytfog o letehlee eertgnes oyn,h,,y i  ,lmem mmAAAioAAAneAAAy.AAA,AAAA AAAA";
        if (actualEncrypted4.equals(expectedEncrypted4)) {
          System.out.println("\nTest 4 PASSED!");
        } else {
          System.out.println("\n*** Test 4 FAILED! ***");
          System.out.println("EXPECTED: " + expectedEncrypted4);
          System.out.println("  ACTUAL: " + actualEncrypted4);
        }

        Encryptor encryptorTesterC = new Encryptor(2, 4);
        String actualEncrypted5 = encryptorTesterC.encryptMessage("ABCD EFGH ABCD EFGH ABCD EFGH ABCD EFGH!");
        String expectedEncrypted5 = "A BECFDGHC DA BEFAGBHC D HE FAGBCFDG HE!";
        if (actualEncrypted5.equals(expectedEncrypted5)) {
          System.out.println("\nTest 5 PASSED!");
        } else {
          System.out.println("\n*** Test 5 FAILED! ***");
          System.out.println("EXPECTED: " + expectedEncrypted5);
          System.out.println("  ACTUAL: " + actualEncrypted5);
        }
    /*
        // -------------------------------------
        // ---- TEST PART D: decryptMessage ----
        // -------------------------------------
        System.out.println("\n---- TESTING PART D ----");
        Encryptor encryptorTest2 = new Encryptor(2, 3);
        String actualDecrypted1 = encryptorTest2.decryptMessage("Mte eati dmnitgAhA");
        String expectedDecrypted1 = "Meet at midnight";
        if (actualDecrypted1.equals(expectedDecrypted1)) {
          System.out.println("\nTest 1 PASSED!");
        } else {
          System.out.println("\n*** Test 1 FAILED! ***");
          System.out.println("EXPECTED: " + expectedDecrypted1);
          System.out.println("  ACTUAL: " + actualDecrypted1);
        }

        String actualDecrypted2 = encryptorTest2.decryptMessage("L'est goou tsei.d A ryeouK  Owi tthhaAtA?A");
        String expectedDecrypted2 = "Let's go outside. Are you OK with that?";
        if (actualDecrypted2.equals(expectedDecrypted2)) {
          System.out.println("\nTest 2 PASSED!");
        } else {
          System.out.println("\n*** Test 2 FAILED! ***");
          System.out.println("EXPECTED: " + expectedDecrypted2);
          System.out.println("  ACTUAL: " + actualDecrypted2);
        }

        Encryptor encryptorTester5 = new Encryptor(4, 3);
        String actualDecrypted3 = encryptorTester5.decryptMessage("Iats wh s iRELgaAYrtL e swneh  tooNfl o iauaxbt fi aalttmyh metaoso v  smloAa wAltnA");
        String expectedDecrypted3 = "I saw this REALLY great show on Netflix about a family that moves to a small town";
        if (actualDecrypted3.equals(expectedDecrypted3)) {
          System.out.println("\nTest 3 PASSED!");
        } else {
          System.out.println("\n*** Test 3 FAILED! ***");
          System.out.println("EXPECTED: " + expectedDecrypted3);
          System.out.println("  ACTUAL: " + actualDecrypted3);
        }

        Encryptor encryptorTesterD = new Encryptor(5, 6);
        String actualDecrypted5 = encryptorTesterD.decryptMessage("Em  ceemmaneiotynnec,yy,h ,,  arh.e  e  tb Ihiytfog o letehlee eertgnes oyn,h,,y i  ,lmem mmAAAioAAAneAAAy.AAA,AAAA AAAA");
        String expectedDecrypted5 = "Eeny, meeny, miny, moe, catch a tiger by the toe. If he hollers, let him go, eeny, meeny, miny, moe.";
        if (actualDecrypted5.equals(expectedDecrypted5)) {
          System.out.println("\nTest 4 PASSED!");
        } else {
          System.out.println("\n*** Test 4 FAILED! ***");
          System.out.println("EXPECTED: " + expectedDecrypted5);
          System.out.println("  ACTUAL: " + actualDecrypted5);
        }

        Encryptor encryptorTesterM = new Encryptor(2, 4);
        String actualDecrypted6 = encryptorTesterM.decryptMessage("A BECFDGHC DA BEFAGBHC D HE FAGBCFDG HE!");
        String expectedDecrypted6 = "ABCD EFGH ABCD EFGH ABCD EFGH ABCD EFGH!";
        if (actualDecrypted6.equals(expectedDecrypted6)) {
          System.out.println("\nTest 5 PASSED!");
        } else {
          System.out.println("\n*** Test 5 FAILED! ***");
          System.out.println("EXPECTED: " + expectedDecrypted6);
          System.out.println("  ACTUAL: " + actualDecrypted6);
        }
    */
    }

    public static void print2DArray(String[][] arr) {
        for (String[] row : arr) {
            for (String val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static boolean testArr(String[][] expected, String[][] actual) {
        if (expected.length != actual.length) {
            return false;
        }

        if (expected[0].length != actual[0].length) {
            return false;
        }

        for (int row = 0; row < expected.length; row++) {
            for (int col = 0; col < expected[0].length; col++) {
                String expElement = expected[row][col];
                String actElement = actual[row][col];
                if (!expElement.equals(actElement)) {
                    return false;
                }
            }
        }
        return true;
    }
}