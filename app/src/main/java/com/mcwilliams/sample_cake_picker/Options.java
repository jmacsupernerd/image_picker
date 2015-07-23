package com.mcwilliams.sample_cake_picker;

/**
 * Created by joshuamcwilliams on 7/23/15.
 */
public class Options {
    private String optionName;
    private String optionImage;

    public Options(String optionName, String optionImage) {
        this.optionName = optionName;
        this.optionImage = optionImage;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionImage() {
        return optionImage;
    }

    public void setOptionImage(String optionImage) {
        this.optionImage = optionImage;
    }
}
