package de.joshua_kuepper.blatt2.excercise3;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public enum PasswordFactory {

    LITTLE_LETTERS(new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}),
    GREAT_LETTERS(new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}),
    NUMBERS(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}),
    SPECIAL_CHARS(new char[]{'#', '!', '?', '_', '.'});

    private final char[] chars;

    private static final SecureRandom random;

    static {
        SecureRandom randomCandidate;
        try {
            randomCandidate = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException ex) {
            randomCandidate = new SecureRandom();
        }
        random = randomCandidate;
    }

    private PasswordFactory(final char[] chars) {
        this.chars = chars;
    }

    public String getRandomString(int length) {
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
            text[i] = chars[random.nextInt(chars.length)];
        return new String(text);
    }
}
