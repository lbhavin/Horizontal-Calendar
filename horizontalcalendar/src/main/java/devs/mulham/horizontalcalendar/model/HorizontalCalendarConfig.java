package devs.mulham.horizontalcalendar.model;

import android.graphics.Typeface;

/**
 * @author Mulham-Raee
 * @since v1.2.5
 */
public class HorizontalCalendarConfig {

    public static final float DEFAULT_SIZE_TEXT_TOP = 14f;
    public static final float DEFAULT_SIZE_TEXT_MIDDLE = 24f;
    public static final float DEFAULT_SIZE_TEXT_BOTTOM = 14f;

    public static final String DEFAULT_FORMAT_TEXT_TOP = "MMM";
    public static final String DEFAULT_FORMAT_TEXT_MIDDLE = "dd";
    public static final String DEFAULT_FORMAT_TEXT_BOTTOM = "EEE";

    /* Format & Font Sizes*/
    private String formatTopText;
    private String formatMiddleText;
    private String formatBottomText;
    private float sizeTopText;
    private float sizeMiddleText;
    private float sizeBottomText;
    private Typeface fontTopText;
    private Typeface fontMiddleText;
    private Typeface fontBottomText;

    private Integer selectorColor;
    private boolean showTopText;
    private boolean showBottomText;
    private boolean showBottomIndicator;

    public HorizontalCalendarConfig() {
    }

    public HorizontalCalendarConfig(float sizeTopText, float sizeMiddleText, float sizeBottomText, Typeface fontTopText,
            Typeface fontMiddleText, Typeface fontBottomText, Integer selectorColor) {
        this.sizeTopText = sizeTopText;
        this.sizeMiddleText = sizeMiddleText;
        this.sizeBottomText = sizeBottomText;
        this.fontTopText = fontTopText;
        this.fontMiddleText = fontMiddleText;
        this.fontBottomText = fontBottomText;
        this.selectorColor = selectorColor;
    }

//    public HorizontalCalendarConfig(float sizeTopText, float sizeMiddleText, float sizeBottomText, Integer selectorColor) {
//        this.sizeTopText = sizeTopText;
//        this.sizeMiddleText = sizeMiddleText;
//        this.sizeBottomText = sizeBottomText;
//        this.selectorColor = selectorColor;
//    }

    public HorizontalCalendarConfig setFormatTopText(String formatTopText) {
        this.formatTopText = formatTopText;
        return this;
    }

    public HorizontalCalendarConfig setFormatMiddleText(String formatMiddleText) {
        this.formatMiddleText = formatMiddleText;
        return this;
    }

    public HorizontalCalendarConfig setFormatBottomText(String formatBottomText) {
        this.formatBottomText = formatBottomText;
        return this;
    }

    public HorizontalCalendarConfig setSizeTopText(float sizeTopText) {
        this.sizeTopText = sizeTopText;
        return this;
    }

    public HorizontalCalendarConfig setSizeMiddleText(float sizeMiddleText) {
        this.sizeMiddleText = sizeMiddleText;
        return this;
    }

    public HorizontalCalendarConfig setSizeBottomText(float sizeBottomText) {
        this.sizeBottomText = sizeBottomText;
        return this;
    }


    public HorizontalCalendarConfig setFontTopText(Typeface fontTopText) {
        this.fontTopText = fontTopText;
        return this;
    }

    public HorizontalCalendarConfig setFontMiddleText(Typeface fontMiddleText) {
        this.fontMiddleText = fontMiddleText;
        return this;
    }

    public HorizontalCalendarConfig setFontBottomText(Typeface fontBottomText) {
        this.fontBottomText = fontBottomText;
        return this;
    }

    public HorizontalCalendarConfig setSelectorColor(Integer selectorColor) {
        this.selectorColor = selectorColor;
        return this;
    }

    public HorizontalCalendarConfig setShowTopText(boolean showTopText) {
        this.showTopText = showTopText;
        return this;
    }

    public HorizontalCalendarConfig setShowBottomText(boolean showBottomText) {
        this.showBottomText = showBottomText;
        return this;
    }

    public void setShowBottomIndicator(boolean showBottomIndicator) {
        this.showBottomIndicator = showBottomIndicator;
    }

    public String getFormatTopText() {
        return formatTopText;
    }

    public String getFormatMiddleText() {
        return formatMiddleText;
    }

    public String getFormatBottomText() {
        return formatBottomText;
    }

    public float getSizeTopText() {
        return sizeTopText;
    }

    public float getSizeMiddleText() {
        return sizeMiddleText;
    }

    public float getSizeBottomText() {
        return sizeBottomText;
    }

    public Typeface getFontTopText() {
        return fontTopText;
    }

    public Typeface getFontMiddleText() {
        return fontMiddleText;
    }

    public Typeface getFontBottomText() {
        return fontBottomText;
    }

    public Integer getSelectorColor() {
        return selectorColor;
    }

    public boolean isShowTopText() {
        return showTopText;
    }

    public boolean isShowBottomText() {
        return showBottomText;
    }

    public boolean isShowBottomIndicator() {
        return showBottomIndicator;
    }
    public void setupDefaultValues(HorizontalCalendarConfig defaultConfig) {
        if (defaultConfig == null) {
            return;
        }
        if (selectorColor == null) {
            selectorColor = defaultConfig.selectorColor;
        }
        if (sizeTopText == 0) {
            sizeTopText = defaultConfig.sizeTopText;
        }
        if (sizeMiddleText == 0) {
            sizeMiddleText = defaultConfig.sizeMiddleText;
        }
        if (sizeBottomText == 0) {
            sizeBottomText = defaultConfig.sizeBottomText;
        }
        if (fontTopText == null) {
            fontTopText = defaultConfig.fontTopText;
        }
        if (fontMiddleText == null) {
            fontMiddleText = defaultConfig.fontMiddleText;
        }
        if (fontBottomText == null) {
            fontBottomText = defaultConfig.fontBottomText;
        }
    }
}
