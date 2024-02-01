package com.quickersilver.themeengine

import androidx.annotation.ColorRes
import androidx.annotation.StyleRes

enum class Theme(@StyleRes val themeId: Int, @ColorRes val primaryColor: Int) {
    Amber(R.style.ThemeOverlay_Material3_MaterialAmber, R.color.md_theme_material_amber_light_primary),
    Blue(R.style.ThemeOverlay_Material3_MaterialBlue, R.color.md_theme_material_blue_light_primary),
    BlueVariant(R.style.ThemeOverlay_Material3_MaterialBlueVariant, R.color.md_theme_material_light_blue_light_primary),
    Brown(R.style.ThemeOverlay_Material3_MaterialBrown, R.color.md_theme_material_brown_light_primary),
    Cyan(R.style.ThemeOverlay_Material3_MaterialCyan, R.color.md_theme_material_cyan_light_primary),
    DeepOrange(R.style.ThemeOverlay_Material3_MaterialDeepOrange, R.color.md_theme_material_deep_orange_light_primary),
    DeepPurple(R.style.ThemeOverlay_Material3_MaterialDeepPurple, R.color.md_theme_material_deep_purple_light_primary),
    Green(R.style.ThemeOverlay_Material3_MaterialGreen, R.color.md_theme_material_green_light_primary),
    Indigo(R.style.ThemeOverlay_Material3_MaterialIndigo, R.color.md_theme_material_indigo_light_primary),
    LightBlue(R.style.ThemeOverlay_Material3_MaterialLightBlue, R.color.md_theme_material_light_blue_light_primary),
    LightGreen(R.style.ThemeOverlay_Material3_MaterialLightGreen, R.color.md_theme_material_light_green_light_primary),
    Lime(R.style.ThemeOverlay_Material3_MaterialLime, R.color.md_theme_material_lime_light_primary),
    Orange(R.style.ThemeOverlay_Material3_MaterialOrange, R.color.md_theme_material_orange_light_primary),
    Pink(R.style.ThemeOverlay_Material3_MaterialPink, R.color.md_theme_material_pink_light_primary),
    Purple(R.style.ThemeOverlay_Material3_MaterialPurple, R.color.md_theme_material_purple_light_primary),
    Red(R.style.ThemeOverlay_Material3_MaterialRed, R.color.md_theme_material_red_light_primary),
    Teal(R.style.ThemeOverlay_Material3_MaterialTeal, R.color.md_theme_material_teal_light_primary),
    Violet(R.style.ThemeOverlay_Material3_MaterialViolet, R.color.md_theme_material_violet_light_primary),
    Yellow(R.style.ThemeOverlay_Material3_MaterialYellow, R.color.md_theme_material_yellow_light_primary),
    Sakura(R.style.ThemeOverlay_Material3_MaterialSakura, R.color.md_theme_material_sakura_light_primary)
}
