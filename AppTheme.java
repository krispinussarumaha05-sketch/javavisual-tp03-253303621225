package com.unpri.charactermanager.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class AppTheme {
    // 3 Warna Utama
    public static final Color PRIMARY_COLOR = Color.decode("#2C3E50");
    public static final Color SECONDARY_COLOR = Color.decode("#16A085");
    public static final Color BACKGROUND_COLOR = Color.decode("#ECF0F1");

    // 3 Font Utama
    public static final Font TITLE_FONT = new Font("Segoe UI", Font.BOLD, 18);
    public static final Font HEADER_FONT = new Font("Segoe UI", Font.BOLD, 14);
    public static final Font BODY_FONT = new Font("Segoe UI", Font.PLAIN, 12);

    // 1 Border Utama
    public static final Border DEFAULT_BORDER = BorderFactory.createEmptyBorder(10, 10, 10, 10);

    // Method colorFor (untuk menentukan warna berdasarkan role/kategori karakter)
    public static Color colorFor(String role) {
        if (role == null) return Color.LIGHT_GRAY;
        switch (role.toLowerCase()) {
            case "tank":
                return Color.decode("#2980B9"); // Biru
            case "mage":
                return Color.decode("#8E44AD"); // Ungu
            case "assassin":
                return Color.decode("#C0392B"); // Merah
            default:
                return Color.decode("#7F8C8D"); // Abu-abu
        }
    }
}