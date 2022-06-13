package util;
import school.GradeValidator;
import school.IdValidator;
import school.RoomValidator;

import java.io.*;

public class KeyboardReader {

    private static BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));

    public KeyboardReader() { }

    public static String getPromptedString(String prompt) {
        String response = null;
        System.out.print(prompt);
        try {
            response = in.readLine();
        } catch (IOException e) {
            System.out.println("IOException occurred");
        }
        return response;
    }

    public static char getPromptedChar(String prompt) {
        return getPromptedString(prompt).charAt(0);
    }

    public static int getPromptedInt(String prompt) {
        return Integer.parseInt(getPromptedString(prompt));
    }

    public static int getPromptedInt(String prompt, String errMsg) {
        for ( ; ; ) {
            try {
                return Integer.parseInt(getPromptedString(prompt));
            } catch (NumberFormatException e) {
                System.out.println(errMsg);
            }
        }
    }
    public static int getPromptedInt(
            String prompt, String formatErrMsg,
            RoomValidator val, String valErrMsg) {
        for ( ; ; ) {
            try {
                int num = Integer.parseInt(getPromptedString(prompt));
                if (val.accept(num)) return num;
                else System.out.println(valErrMsg);
            } catch (NumberFormatException e) {
                System.out.println(formatErrMsg);
            }
        }
    }

    public static int getPromptedInt(
            String prompt, String formatErrMsg,
            IdValidator val, String valErrMsg) {
        for ( ; ; ) {
            try {
                int num = Integer.parseInt(getPromptedString(prompt));
                if (val.accept(num)) return num;
                else System.out.println(valErrMsg);
            } catch (NumberFormatException e) {
                System.out.println(formatErrMsg);
            }
        }
    }

    public static int getPromptedInt(
            String prompt, String formatErrMsg,
            GradeValidator val, String valErrMsg) {
        for ( ; ; ) {
            try {
                int num = Integer.parseInt(getPromptedString(prompt));
                if (val.accept(num)) return num;
                else System.out.println(valErrMsg);
            } catch (NumberFormatException e) {
                System.out.println(formatErrMsg);
            }
        }
    }

    public static int getPromptedInt(
            String prompt, String formatErrMsg,
            IntValidator val, String valErrMsg) {
        for ( ; ; ) {
            try {
                int num = Integer.parseInt(getPromptedString(prompt));
                if (val.accept(num)) return num;
                else System.out.println(valErrMsg);
            } catch (NumberFormatException e) {
                System.out.println(formatErrMsg);
            }
        }
    }

    public static float getPromptedFloat(String prompt) {
        return Float.parseFloat(getPromptedString(prompt));
    }
    public static float getPromptedFloat(String prompt, String errMsg) {
        for ( ; ; ) {
            try {
                return Float.parseFloat(getPromptedString(prompt));
            } catch (NumberFormatException e) {
                System.out.println(errMsg);
            }
        }
    }
    public static float getPromptedFloat(
            String prompt, String formatErrMsg,
            FloatValidator val, String valErrMsg) {
        for ( ; ; ) {
            try {
                float num = Float.parseFloat(getPromptedString(prompt));
                if (val.accept(num)) return num;
                else System.out.println(valErrMsg);
            } catch (NumberFormatException e) {
                System.out.println(formatErrMsg);
            }
        }
    }

    public static double getPromptedDouble(String prompt) {
        return Double.parseDouble(getPromptedString(prompt));
    }
    public static double getPromptedDouble(String prompt, String errMsg) {
        for ( ; ; ) {
            try {
                return Double.parseDouble(getPromptedString(prompt));
            } catch (NumberFormatException e) {
                System.out.println(errMsg);
            }
        }
    }
    public static double getPromptedDouble(
            String prompt, String formatErrMsg,
            DoubleValidator val, String valErrMsg) {
        for ( ; ; ) {
            try {
                double num = Double.parseDouble(getPromptedString(prompt));
                if (val.accept(num)) return num;
                else System.out.println(valErrMsg);
            } catch (NumberFormatException e) {
                System.out.println(formatErrMsg);
            }
        }
    }
}