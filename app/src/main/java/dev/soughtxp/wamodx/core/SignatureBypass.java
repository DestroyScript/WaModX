package dev.soughtxp.wamodx.core;

import android.content.pm.Signature;
import android.util.Base64;

import java.security.SecureRandom;

import dev.soughtxp.wamodx.util.PrefsUtils;

public class SignatureBypass {

    private static final String OFFICIAL_SIGNATURE_BASE64 =
        "";

    public static final String OFFICIAL_CLASSES_DEX_MD5_HEX = "";

    public static String getAndroidId(String original) {
        String id = PrefsUtils.PREFERENCES.getString("android_id", "");
        if (!id.equals("")) {
            return id;
        }
        id = Long.toHexString(new SecureRandom().nextLong());
        PrefsUtils.PREFERENCES.setString("android_id", id);
        return id;
    }

    public static Signature[] getOfficialSignatures() {
        byte[] bytes = Base64.decode(OFFICIAL_SIGNATURE_BASE64, Base64.DEFAULT);
        return new Signature[]{new Signature(bytes)};
    }

    public static String getPlayStoreInstaller() {
        return "com.android.vending";
    }

    public static byte[] hexToBytes(String hex) {
        int len = hex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
                    + Character.digit(hex.charAt(i + 1), 16));
        }
        return data;
    }

    public static byte[] dexMd5(byte[] original) {
        byte[] official = hexToBytes(OFFICIAL_CLASSES_DEX_MD5_HEX);
        if (official != null && official.length == 16) {
            return official;
        }
        return original;
    }

    public static Signature[] getSignatures(Object packageInfo) {
        return getOfficialSignatures();
    }
}
