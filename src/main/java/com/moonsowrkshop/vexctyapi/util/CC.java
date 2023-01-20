package com.moonsowrkshop.vexctyapi.util;

import org.bukkit.ChatColor;

public class CC {

    public static String PRIMARY;
    public static String SECONDARY;
    public static String B_PRIMARY;
    public static String B_SECONDARY;
    public static String BLUE;
    public static String AQUA;
    public static String YELLOW;
    public static String RED;
    public static String GRAY;
    public static String GOLD;
    public static String GREEN;
    public static String WHITE;
    public static String BLACK;
    public static String BOLD;
    public static String ITALIC;
    public static String STRIKE_THROUGH;
    public static String RESET;
    public static String MAGIC;
    public static String OBFUSCATED;
    public static String B;
    public static String M;
    public static String O;
    public static String I;
    public static String S;
    public static String R;
    public static String DARK_BLUE;
    public static String DARK_AQUA;
    public static String DARK_GRAY;
    public static String DARK_GREEN;
    public static String DARK_PURPLE;
    public static String DARK_RED;
    public static String D_BLUE;
    public static String D_AQUA;
    public static String D_GRAY;
    public static String D_GREEN;
    public static String D_PURPLE;
    public static String D_RED;
    public static String LIGHT_PURPLE;
    public static String L_PURPLE;
    public static String PINK;
    public static String B_BLUE;
    public static String B_AQUA;
    public static String B_YELLOW;
    public static String B_RED;
    public static String B_GRAY;
    public static String B_GOLD;
    public static String B_GREEN;
    public static String B_WHITE;
    public static String B_BLACK;
    public static String BD_BLUE;
    public static String BD_AQUA;
    public static String BD_GRAY;
    public static String BD_GREEN;
    public static String BD_PURPLE;
    public static String BD_RED;
    public static String BL_PURPLE;
    public static String I_BLUE;
    public static String I_AQUA;
    public static String I_YELLOW;
    public static String I_RED;
    public static String I_GRAY;
    public static String I_GOLD;
    public static String I_GREEN;
    public static String I_WHITE;
    public static String I_BLACK;
    public static String ID_RED;
    public static String ID_BLUE;
    public static String ID_AQUA;
    public static String ID_GRAY;
    public static String ID_GREEN;
    public static String ID_PURPLE;
    public static String IL_PURPLE;
    public static String SEPARATOR;
    public static String SB_BAR;
    public static String[] SEPARATORS;

    private CC() {
        throw new RuntimeException("Cannot instantiate a utility class.");
    }

    static {
        PRIMARY = ChatColor.DARK_RED.toString();
        SECONDARY = ChatColor.WHITE.toString();
        B_PRIMARY = CC.PRIMARY + ChatColor.BOLD;
        B_SECONDARY = CC.SECONDARY + ChatColor.BOLD;
        BLUE = ChatColor.BLUE.toString();
        AQUA = ChatColor.AQUA.toString();
        YELLOW = ChatColor.YELLOW.toString();
        RED = ChatColor.RED.toString();
        GRAY = ChatColor.GRAY.toString();
        GOLD = ChatColor.GOLD.toString();
        GREEN = ChatColor.GREEN.toString();
        WHITE = ChatColor.WHITE.toString();
        BLACK = ChatColor.BLACK.toString();
        BOLD = ChatColor.BOLD.toString();
        ITALIC = ChatColor.ITALIC.toString();
        STRIKE_THROUGH = ChatColor.STRIKETHROUGH.toString();
        RESET = ChatColor.RESET.toString();
        MAGIC = ChatColor.MAGIC.toString();
        OBFUSCATED = CC.MAGIC;
        B = CC.BOLD;
        M = CC.MAGIC;
        O = CC.MAGIC;
        I = CC.ITALIC;
        S = CC.STRIKE_THROUGH;
        R = CC.RESET;
        DARK_BLUE = ChatColor.DARK_BLUE.toString();
        DARK_AQUA = ChatColor.DARK_AQUA.toString();
        DARK_GRAY = ChatColor.DARK_GRAY.toString();
        DARK_GREEN = ChatColor.DARK_GREEN.toString();
        DARK_PURPLE = ChatColor.DARK_PURPLE.toString();
        DARK_RED = ChatColor.DARK_RED.toString();
        D_BLUE = CC.DARK_BLUE;
        D_AQUA = CC.DARK_AQUA;
        D_GRAY = CC.DARK_GRAY;
        D_GREEN = CC.DARK_GREEN;
        D_PURPLE = CC.DARK_PURPLE;
        D_RED = CC.DARK_RED;
        LIGHT_PURPLE = ChatColor.LIGHT_PURPLE.toString();
        L_PURPLE = CC.LIGHT_PURPLE;
        PINK = CC.L_PURPLE;
        B_BLUE = CC.BLUE + CC.B;
        B_AQUA = CC.AQUA + CC.B;
        B_YELLOW = CC.YELLOW + CC.B;
        B_RED = CC.RED + CC.B;
        B_GRAY = CC.GRAY + CC.B;
        B_GOLD = CC.GOLD + CC.B;
        B_GREEN = CC.GREEN + CC.B;
        B_WHITE = CC.WHITE + CC.B;
        B_BLACK = CC.BLACK + CC.B;
        BD_BLUE = CC.D_BLUE + CC.B;
        BD_AQUA = CC.D_AQUA + CC.B;
        BD_GRAY = CC.D_GRAY + CC.B;
        BD_GREEN = CC.D_GREEN + CC.B;
        BD_PURPLE = CC.D_PURPLE + CC.B;
        BD_RED = CC.D_RED + CC.B;
        BL_PURPLE = CC.L_PURPLE + CC.B;
        I_BLUE = CC.BLUE + CC.I;
        I_AQUA = CC.AQUA + CC.I;
        I_YELLOW = CC.YELLOW + CC.I;
        I_RED = CC.RED + CC.I;
        I_GRAY = CC.GRAY + CC.I;
        I_GOLD = CC.GOLD + CC.I;
        I_GREEN = CC.GREEN + CC.I;
        I_WHITE = CC.WHITE + CC.I;
        I_BLACK = CC.BLACK + CC.I;
        ID_RED = CC.D_RED + CC.I;
        ID_BLUE = CC.D_BLUE + CC.I;
        ID_AQUA = CC.D_AQUA + CC.I;
        ID_GRAY = CC.D_GRAY + CC.I;
        ID_GREEN = CC.D_GREEN + CC.I;
        ID_PURPLE = CC.D_PURPLE + CC.I;
        IL_PURPLE = CC.L_PURPLE + CC.I;
        SB_BAR = DARK_GRAY + STRIKE_THROUGH + "--------------";
        SEPARATORS = new String[22];
        int i = 0;
        for (ChatColor c : ChatColor.values()) {
            CC.SEPARATORS[i] = CC.SEPARATOR + c.toString();
            ++i;
        }
    }

}
