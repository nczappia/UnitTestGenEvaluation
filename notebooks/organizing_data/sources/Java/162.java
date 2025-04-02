import java.math.BigInteger;
import java.security.*;
import java.util.*;
import java.lang.*;

class Solution {
    
    public Optional<String> stringToMd5(String text) throws NoSuchAlgorithmException {
        if (text.isEmpty()) {
            return Optional.empty();
        }

        String md5 = new BigInteger(1, java.security.MessageDigest.getInstance("MD5").digest(text.getBytes())).toString(16);
        md5 = "0".repeat(32 - md5.length()) + md5;
        return Optional.of(md5);
    }
}