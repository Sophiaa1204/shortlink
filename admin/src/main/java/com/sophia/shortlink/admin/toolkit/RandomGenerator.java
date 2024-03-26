package com.sophia.shortlink.admin.toolkit;

import java.security.SecureRandom;

/**
 * 分组ID随机生成器 (不允许被继承）
 */
public final class RandomGenerator {
    private static final String CHARACTERS = "0123456789abcdefghijklmnopqrstuvwxyz";
    private static final SecureRandom RANDOM = new SecureRandom();

    public static String generateRandom() {
        return generateRandom(6);
    }

    /**
     * 生成随机分组ID
     * @param length
     * @return 分组ID
     */
    public static String generateRandom(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = RANDOM.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }
        return sb.toString();
    }


}
