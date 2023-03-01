public class Encryptor {
    /**
     * A two-dimensional array of single-character strings, instantiated in the constructor
     */
    private String[][] letterBlock;

    /**
     * The number of rows of letterBlock, set by the constructor
     */
    private int numRows;

    /**
     * The number of columns of letterBlock, set by the constructor
     */
    private int numCols;

    /**
     * Constructor
     */
    public Encryptor(int r, int c) {
        letterBlock = new String[r][c];
        numRows = r;
        numCols = c;
    }

    public String[][] getLetterBlock() {
        return letterBlock;
    }

    /**
     * Places a string into letterBlock in row-major order.
     *
     * @param str the string to be processed
     *            <p>
     *            Postcondition:
     *            if str.length() < numRows * numCols, "A" in each unfilled cell
     *            if str.length() > numRows * numCols, trailing characters are ignored
     */
    public void fillBlock(String str) {
        int i = 0;
        for (int a = 0; a < numRows; a++) {
            for (int b = 0; b < numCols; b++) {
                if (i < str.length()) {
                    letterBlock[a][b] = String.valueOf(str.charAt(i));
                    i++;
                }
            }
        }
        for (int a = 0; a < numRows; a++) {
            for (int b = 0; b < numCols; b++) {
                if (letterBlock[a][b] == null || letterBlock[a][b].equals("*")) {
                    letterBlock[a][b] = "A";
                }
            }
        }
    }


    /**
     * Extracts encrypted string from letterBlock in column-major order.
     * <p>
     * Precondition: letterBlock has been filled
     *
     * @return the encrypted string from letterBlock
     */
    public String encryptBlock() {
        String tempString = "";
        for (int a = 0; a < numCols; a++) {
            for (int b = 0; b < numRows; b++) {
                tempString += letterBlock[b][a];
            }
        }
        return tempString;
    }


    /**
     * Encrypts a message.
     *
     * @param message the string to be encrypted
     * @return the encrypted message; if message is the empty string, returns the empty string
     */
    public String encryptMessage(String message) {
        String tempString = "";
        String tempString2 = "";
        int arrSize = numRows * numCols;
        int tempNum = 0;
        while (tempNum < message.length() - arrSize) {
            fillBlock(message.substring(tempNum, tempNum + arrSize));
            tempString += encryptBlock();
            tempNum += arrSize;
        }
        for (int i = 0; i < arrSize; i++) {
            tempString2 += "*";
        }
        fillBlock(tempString2);
        fillBlock(message.substring(tempNum));
        tempString += encryptBlock();
        return tempString;
    }

    /**
     * Decrypts an encrypted message. All filler 'A's that may have been
     * added during encryption will be removed, so this assumes that the
     * original message (BEFORE it was encrypted) did NOT end in a capital A!
     * <p>
     * NOTE! When you are decrypting an encrypted message,
     * be sure that you have initialized your Encryptor object
     * with the same row/column used to encrypted the message! (i.e.
     * the “encryption key” that is necessary for successful decryption)
     * This is outlined in the precondition below.
     * <p>
     * Precondition: the Encryptor object being used for decryption has been
     * initialized with the same number of rows and columns
     * as was used for the Encryptor object used for encryption.
     *
     * @param encryptedMessage the encrypted message to decrypt
     * @return the decrypted, original message (which had been encrypted)
     * <p>
     * TIP: You are encouraged to create other helper methods as you see fit
     * (e.g. a method to decrypt each section of the decrypted message,
     * similar to how encryptBlock was used)
     */
    public String decryptMessage(String encryptedMessage) {
        String tempString = "";
        int arrSize = numRows * numCols;
        int tempNum = 0;
        while (tempNum < encryptedMessage.length()) {
        for (int a = 0; a < numCols; a++) {
            for (int b = 0; b < numRows; b++) {
                letterBlock[b][a] = String.valueOf(encryptedMessage.charAt(tempNum));
                tempNum++;
            }
        }
        for (int a = 0; a < numRows; a++) {
            for (int b = 0; b < numCols; b++) {
                tempString += letterBlock[a][b];
            }
        }
        }
        int tempNum2 = tempString.length() - 1;
        while (String.valueOf(tempString.charAt(tempNum2)).equals("A")) {
            tempNum2--;
        }
        tempString = tempString.substring(0, tempNum2 + 1);
        return tempString;
    }

}